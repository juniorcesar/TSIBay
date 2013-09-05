package br.edu.utfpr.cm.tsibay.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "pageManager")
@SessionScoped
public class PageManager implements Serializable {

    public PageManager() {
    }
    private String paginaAtiva = "./pages/home.xhtml";

    public String getPaginaAtiva() {
        return paginaAtiva;
    }

    public void setPaginaAtiva(String paginaAtiva) {
        this.paginaAtiva = paginaAtiva;
    }

    public void setPagProdutos() {
        this.paginaAtiva = "./pages/produtos.xhtml";
    }
    
    public void setPagComissoes() {
        this.paginaAtiva = "./pages/comissoes.xhtml";
    }
    public void setPagCompras() {
        this.paginaAtiva = "./pages/compras.xhtml";
    }
    public void setPagConsultarMovimentacoes() {
        this.paginaAtiva = "./pages/consultar_movimentacoes.xhtml";
    }
    public void setPagGerenciarComissoes() {
        this.paginaAtiva = "./pages/gerenciar_comissoes.xhtml";
    }
    public void setPagListarCompras() {
        this.paginaAtiva = "./pages/listar_compras.xhtml";
    }
    public void setPagListarProdutos() {
        this.paginaAtiva = "./pages/listar_produtos.xhtml";
    }
    public void setPagListarVendas() {
        this.paginaAtiva = "./pages/listar_vendas.xhtml";
    }
    public void setPagPerfil() {
        this.paginaAtiva = "./pages/perfil.xhtml";
    }
    public void setPagSenha() {
        this.paginaAtiva = "./pages/senha.xhtml";
    }
    public void setPagVendas() {
        this.paginaAtiva = "./pages/vendas.xhtml";
    }
     public void setGerenciarUsuarios() {
        this.paginaAtiva = "./pages/gerenciar_usuarios.xhtml";
    }
}
