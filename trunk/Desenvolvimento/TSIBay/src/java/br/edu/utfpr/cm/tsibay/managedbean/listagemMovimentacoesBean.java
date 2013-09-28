/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.daos.DaoTransacao;
import br.edu.utfpr.cm.tsibay.model.Transacao;
import br.edu.utfpr.cm.tsibay.util.Moeda;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author junior
 */
@ManagedBean(name = "listagemMovimentacoesBean")
@RequestScoped
public class listagemMovimentacoesBean implements Serializable {

    private List<Transacao> transacoes;
    private Transacao selectedTransacao;
    private DaoTransacao daoTransacao = new DaoTransacao();

    public List<Transacao> getTransacoes() {
        transacoes = daoTransacao.listar();
        return transacoes;
    }

    public String getValorTotal() {
        Double valorTotal = 0D;
        for (Transacao transacao : transacoes) {
            valorTotal += transacao.getValorTotal();
        }
        return Moeda.mascaraDinheiro(valorTotal, Moeda.DINHEIRO_REAL);
    }

    public Transacao getSelectedTransacao() {
        return selectedTransacao;
    }

    public void setSelectedTransacao(Transacao selectedTransacao) {
        this.selectedTransacao = selectedTransacao;
    }

    
}
