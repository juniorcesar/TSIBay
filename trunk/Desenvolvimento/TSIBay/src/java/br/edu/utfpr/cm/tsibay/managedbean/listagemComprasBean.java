/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.admin.login.LoginBean;
import br.edu.utfpr.cm.tsibay.daos.DaoTransacao;
import br.edu.utfpr.cm.tsibay.model.Status;
import br.edu.utfpr.cm.tsibay.model.Transacao;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

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
        compras = daoCompra.listarComprasEmAndamento(LoginBean.usuario);
        return compras;
    }

    public List<Transacao> getTotalCompras() {
        compras = daoCompra.listarTotalCompras(LoginBean.usuario);
        return compras;
    }

    public void setCompras(List<Transacao> Compras) {
        this.compras = Compras;
    }

    public void cancelarCompra() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            if (daoCompra == null) {
                daoCompra = new DaoTransacao();
            }
            if (selectedCompra != null) {
                selectedCompra.setStatus(Status.CANCELADO.getStatus());
                daoCompra.persistir(selectedCompra);
                context.addMessage(null, new FacesMessage("Sucesso", "Compra cancelada com sucesso."));
            } else {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção", "Selecione a compra para cancelar!"));
            }

        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Não foi possível cancelar a compra."));
            ex.printStackTrace();
        }
    }
}
