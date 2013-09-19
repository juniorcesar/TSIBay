/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.controller.Dao;
import br.edu.utfpr.cm.tsibay.daos.DaoGenerics;
import br.edu.utfpr.cm.tsibay.model.Produto;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author junior
 */
@ManagedBean(name = "listarProdutos")
@SessionScoped
public class ListagemProdutosBean {

    private List<Produto> listaProdutos;
    public Produto produtoSelecionado;
    private List<Produto> produtoFiltrado;
    private DaoGenerics<Produto> daoProduto;

    public List<Produto> getProdutoFiltrado() {
        return produtoFiltrado;
    }

    public void setProdutoFiltrado(List<Produto> produtoFiltrado) {
        this.produtoFiltrado = produtoFiltrado;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public List<Produto> getProdutos() {
        daoProduto = new DaoGenerics<Produto>(Produto.class);
        listaProdutos = daoProduto.listar();
        //System.out.println(listaProdutos);
        return listaProdutos;
    }

    public Produto getProdutoSelecionado() {
//        System.out.println("peguei a selecionada"+ this.selectedProduto.getName());
        return produtoSelecionado;
    }

    public void setProdutoSelecionado(Produto selectedProduto) {
        this.produtoSelecionado = selectedProduto;
    }

    @PostConstruct
    public void construct() {
        setProdutoSelecionado(new Produto());
    }

    public String editProduto() {
        daoProduto = new DaoGenerics<Produto>(Produto.class);
        daoProduto.persistir(this.produtoSelecionado);

        this.produtoSelecionado = new Produto();
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful", "Sala Editada!"));
        return "cad_salas";
//        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
    }

    public String removeProduto() {
        System.out.println("removendo");
        DaoGenerics<Produto> daoProduto = new DaoGenerics<Produto>(Produto.class);
        daoProduto.remover(produtoSelecionado);

        this.produtoSelecionado = new Produto();
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful", "Sala Excluida!"));
        return "del_produtos";
//        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
    }
}
