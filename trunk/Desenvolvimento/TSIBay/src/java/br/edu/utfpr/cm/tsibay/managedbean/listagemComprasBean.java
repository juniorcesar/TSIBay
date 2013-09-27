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
@ManagedBean(name = "listagemComprasBean")
@RequestScoped
public class listagemComprasBean {

    private List<Transacao> compras;
    private Transacao selectedCompra;
    private DaoTransacao daoCompra = new DaoTransacao();

    public Transacao getSelectedCompra() {
        return selectedCompra;
    }

    public void setSelectedCompra(Transacao selectedCompra) {
        this.selectedCompra = selectedCompra;
    }

    public List<Transacao> getComprasEmAndamento() {
        if (LoginBean.usuario.getTipo().equals("admin")) {
            compras = daoCompra.listar();
        } else {
            compras = daoCompra.listarComprasEmAndamento(LoginBean.usuario);
        }
        return compras;
    }

    public List<Transacao> getComprasTotalCompras() {
        compras = daoCompra.listar();
        return compras;
    }

    public void setCompras(List<Transacao> Compras) {
        this.compras = Compras;
    }

//    @PostConstruct
//    public void construct() {
//        setSelectedCompra(new Pessoa());
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
