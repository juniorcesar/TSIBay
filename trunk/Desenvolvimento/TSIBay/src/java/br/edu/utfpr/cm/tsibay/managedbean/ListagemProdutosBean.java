/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.admin.login.LoginBean;
import br.edu.utfpr.cm.tsibay.daos.DaoProduto;
import br.edu.utfpr.cm.tsibay.daos.DaoTransacao;
import br.edu.utfpr.cm.tsibay.model.Pessoa;
import br.edu.utfpr.cm.tsibay.model.Produto;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author junior
 */
@ManagedBean(name = "listagemProdutosBean")
@SessionScoped
public class ListagemProdutosBean {

    private List<Produto> listaProdutos;
    public Produto produtoSelecionado;
    private List<Produto> filteredProdutos;
    private SelectItem[] itens;
    private DaoProduto daoProduto = new DaoProduto();

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

    public void deleteProduto() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {

            if (produtoSelecionado != null) {
                if (!new DaoTransacao().verificaDependencias(produtoSelecionado)) {
                    daoProduto.remover(produtoSelecionado);

                    this.produtoSelecionado = new Produto();
                    context.addMessage(null, new FacesMessage("Sucesso", "Produto removido com sucesso!"));
                } else {
                    context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção", "Não é possível remover o produto, pois o mesmo está associado à uma ou mais transações!"));
                }
            } else {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção", "Selecione um produto para ser removido!"));
            }

        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Não foi possível remover o produto!"));
            ex.printStackTrace();

        }

    }

    public List<Produto> getFilteredProdutos() {
        return filteredProdutos;
    }

    public void setFilteredProdutos(List<Produto> filteredProdutos) {
        this.filteredProdutos = filteredProdutos;
    }

    public SelectItem[] getItens() {
        daoProduto = new DaoProduto();
        listaProdutos = daoProduto.listar();
        return itens;
    }
}
