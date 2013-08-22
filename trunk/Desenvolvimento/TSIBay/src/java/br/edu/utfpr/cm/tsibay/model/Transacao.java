/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author junior
 */
@Entity
@Table(name = "TRANSACAO")
public class Transacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 10, nullable = false, unique = true)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    private String idVenda;
    private String qtdeProduto;
    private Double valorUnitario;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date prazoValidade;
    private String tpPagamento;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Pessoa> pessoas;
    private String frete;

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }

    public String getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(String qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Date getPrazoValidade() {
        return prazoValidade;
    }

    public void setPrazoValidade(Date prazoValidade) {
        this.prazoValidade = prazoValidade;
    }

    public String getTpPagamento() {
        return tpPagamento;
    }

    public void setTpPagamento(String tpPagamento) {
        this.tpPagamento = tpPagamento;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }
}
