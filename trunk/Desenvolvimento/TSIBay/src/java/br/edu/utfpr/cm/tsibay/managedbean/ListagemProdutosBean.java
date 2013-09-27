/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.admin.login.LoginBean;
import br.edu.utfpr.cm.tsibay.daos.DaoGenerics;
import br.edu.utfpr.cm.tsibay.daos.DaoProduto;
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
@ManagedBean(name = "listagemProdutosBean")
@SessionScoped
public class ListagemProdutosBean {

    private List<Produto> listaProdutos;
    public Produto produtoSelecionado;
    private List<Produto> produtoFiltrado;
    private DaoProduto daoProduto = new DaoProduto();

    public List<Produto> getProdutoFiltrado() {
        return produtoFiltrado;
    }

    public void setProdutoFiltrado(List<Produto> produtoFiltrado) {
        this.produtoFiltrado = produtoFiltrado;
    }

    public List<Produto> getListaProdutos() {
        if (LoginBean.usuario.getTipo().equals("admin")) {
            listaProdutos = daoProduto.listar();
        } else {
            listaProdutos = daoProduto.listarPorUsuario(LoginBean.usuario.getId());
        }
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
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
        daoProduto.persistir(this.produtoSelecionado);

        this.produtoSelecionado = new Produto();
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful", "Sala Editada!"));
        return "cad_salas";
//        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
    }

    public void removeProduto() {
        daoProduto.remover(produtoSelecionado);

        this.produtoSelecionado = new Produto();
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful", "Sala Excluida!"));
    }
}
