/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.admin.login.LoginBean;
import br.edu.utfpr.cm.tsibay.daos.DaoTransacao;
import br.edu.utfpr.cm.tsibay.model.Transacao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author junior
 */
@ManagedBean(name = "listagemVendasBean")
@RequestScoped
public class listagemVendasBean {

    private List<Transacao> vendas;
    private Transacao selectedVenda;
    private DaoTransacao daoVenda = new DaoTransacao();

    public Transacao getSelectedVenda() {
        return selectedVenda;
    }

    public void setSelectedVenda(Transacao selectedVenda) {
        this.selectedVenda = selectedVenda;
    }

    public List<Transacao> getVendasEmAndamento() {
        if (LoginBean.usuario.getTipo().equals("admin")) {
            vendas = daoVenda.listar();
        } else {
            vendas = daoVenda.listarVendasEmAndamento(LoginBean.usuario);
        }
        return vendas;
    }

    public List<Transacao> getVendasTotalVendas() {
        vendas = daoVenda.listar();
        return vendas;
    }

    public void setVendas(List<Transacao> vendas) {
        this.vendas = vendas;
    }

//    @PostConstruct
//    public void construct() {
//        setSelectedVenda(new Pessoa());
//    }
    public void deletePessoa() {
//        FacesContext context = FacesContext.getCurrentInstance();
//        try {
//            DaoProduto daoProduto = new DaoProduto();
//            if (!daoProduto.verificaDependencias(this.selectedPessoa.getId())) {
//                daoPessoa.remover(this.selectedPessoa);
//                this.selectedPessoa = new Pessoa();
//                context.addMessage(null, new FacesMessage("Sucesso", "Usuário removido com sucesso."));
//            } else {
//                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção", "O Usuário não pode ser removido, pois existem produtos/transações associados a ele."));
//            }
//        } catch (Exception ex) {
//            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Não foi possível remover o usuário."));
//            ex.printStackTrace();
//        }
    }
}
