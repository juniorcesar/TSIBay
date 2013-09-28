/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.daos.DaoFamilia;
import br.edu.utfpr.cm.tsibay.daos.DaoGenerics;
import br.edu.utfpr.cm.tsibay.model.Familia;
import br.edu.utfpr.cm.tsibay.model.Produto;
import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author junior
 */
@ManagedBean(name = "produtoBean")
@RequestScoped
public class ProdutoBean implements Serializable {

    private Produto produto;

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

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void addProduto() {
        DaoGenerics<Produto> daoProduto = new DaoGenerics<Produto>(Produto.class);
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            if (produto.getFamilia() == null) {
                Familia familia = new DaoFamilia().obterFamilia("Outros");
                if (familia == null) {
                    familia = new Familia("Outros");
                }
                produto.setFamilia(familia);
            }
            daoProduto.persistir(this.produto);
            this.produto = new Produto();
            context.addMessage(null, new FacesMessage("Sucesso", "O produto foi inserido com sucesso!"));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage("Error", "Erro ao gravar"));
            e.printStackTrace();
        }
    }
}
