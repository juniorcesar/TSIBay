/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.daos.DaoGenerics;
import br.edu.utfpr.cm.tsibay.model.Produto;
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
public class ProdutoBean {

    private Produto produto;

    /**
     * Creates a new instance of ProdutoBean
     */
    public ProdutoBean() {
        produto = new Produto();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String addProduto() {
        DaoGenerics<Produto> daoProduto = new DaoGenerics<Produto>();
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            daoProduto.persistir(this.produto);
            this.produto = new Produto();

            context.addMessage(null, new FacesMessage("Successful", "Gravado"));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage("Error", "Erro ao gravar"));
            e.printStackTrace();
        }
        return "produtos";
    }
}
