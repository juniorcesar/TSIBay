/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.controller.UploadArquivo;
import br.edu.utfpr.cm.tsibay.daos.DaoFamilia;
import br.edu.utfpr.cm.tsibay.daos.DaoGenerics;
import br.edu.utfpr.cm.tsibay.daos.DaoProduto;
import br.edu.utfpr.cm.tsibay.model.Familia;
import br.edu.utfpr.cm.tsibay.model.Imagem;
import br.edu.utfpr.cm.tsibay.model.Produto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author junior
 */
@ManagedBean(name = "produtoBean")
@RequestScoped
public class ProdutoBean implements Serializable {

    private static Produto produto;
    private UploadArquivo arquivo = new UploadArquivo();
    private DaoProduto daoProduto = new DaoProduto();
    private List<Imagem> imagens = new ArrayList<Imagem>();

    /**
     * Creates a new instance of ProdutoBean
     */
    public ProdutoBean() {
        produto = new Produto();
        produto.setData(new Date());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto p) {
        produto = p;
    }

    public void addProduto() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            if (produto.getFamilia() == null) {
                Familia familia = new DaoFamilia().obterFamilia("Outros");
                if (familia == null) {
                    familia = new Familia("Outros");
                }
                produto.setFamilia(familia);
            }
            daoProduto.persistir(produto);
            produto = new Produto();
            context.addMessage(null, new FacesMessage("Sucesso", "O produto foi inserido com sucesso!"));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage("Error", "Erro ao gravar"));
            e.printStackTrace();
        }
    }

    public void uploadAction(FileUploadEvent event) {
        int idProduto = 0;
        if (daoProduto == null) {
            daoProduto = new DaoProduto();
        }
        if (produto.getId() <= 0) {
            idProduto = (daoProduto.obterUltimoId() + 1);
        } else {
            idProduto = produto.getId().intValue();
        }
        if(produto.getImagens() == null){
            imagens = new ArrayList<Imagem>();
        }else{
            imagens = produto.getImagens();
        }
        imagens.add(new Imagem(idProduto+"."+getExtensaoImagem(event.getFile().getFileName())));
        this.arquivo.fileUpload(event, "."+getExtensaoImagem(event.getFile().getFileName()), "/produtos/" + idProduto + "/" , idProduto+"."+getExtensaoImagem(event.getFile().getFileName()));
        this.produto.setImagens(imagens);
        this.arquivo.gravar();
        arquivo = new UploadArquivo();
    }
    
     public String getExtensaoImagem(String nome) {
        return nome.substring(nome.lastIndexOf("."), nome.length());
    }
}
