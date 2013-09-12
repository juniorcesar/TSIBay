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
    private Produto produtoSelecionado;
    private List<Produto> produtoFiltrado;

    public List<Produto> getProdutoFiltrado() {
        return produtoFiltrado;
    }

    public void setProdutoFiltrado(List<Produto> produtoFiltrado) {
        this.produtoFiltrado = produtoFiltrado;
    }   
//    
//
//    public List<> getListaSalas() {
//        return listaSalas;
//    }
//
//    public void setListaSalas(List<ClassRoom> listaSalas) {
//        this.listaSalas = listaSalas;
//    }
//
//    public List<ClassRoom> getSalas() {
//        DaoClassRoom dC = new DaoClassRoom();
//        listaSalas = dC.listar();
//        //System.out.println(listaSalas);
//        return listaSalas;
//    }
//
//    public ClassRoom getSelectedClassRoom() {
////        System.out.println("peguei a selecionada"+ this.selectedClassRoom.getName());
//        return selectedClassRoom;
//    }
//
//    public void setSelectedClassRoom(ClassRoom selectedClassRoom) {
//        this.selectedClassRoom = selectedClassRoom;
//    }
//
//    @PostConstruct
//    public void construct() {
//        setSelectedClassRoom(new ClassRoom());
//    }
//    
//    public String editClassRoom() {
//        DaoClassRoom dcr = new DaoClassRoom();
//        dcr.persistir(this.selectedClassRoom);
//        
//        this.selectedClassRoom = new ClassRoom();
//        FacesContext context = FacesContext.getCurrentInstance();
//
//        context.addMessage(null, new FacesMessage("Successful", "Sala Editada!"));
//        return "cad_salas";
////        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
//    }
    
    public String removeProduto() {
            System.out.println("removendo");
//        DaoGenerics<Produto> daoProduto = new DaoGenerics<Produto>(Produto.class);
//        daoProduto.remover(produtoSelecionado);
        
        this.produtoSelecionado = new Produto();
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful", "Sala Excluida!"));
        return "del_produtos";
//        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
    }
}
