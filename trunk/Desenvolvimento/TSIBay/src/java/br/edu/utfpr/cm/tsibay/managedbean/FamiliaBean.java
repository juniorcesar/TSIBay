/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.daos.DaoGenerics;
import br.edu.utfpr.cm.tsibay.model.Familia;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Junior
 */
@ManagedBean(name = "familiaBean")
@SessionScoped
public class FamiliaBean {

    Familia familia;

    /**
     * Creates a new instance of TypeBean
     */
    public FamiliaBean() {
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
//
//    public SelectItem[] getFamilias() {
//        List<Familia> familias = new DaoGenerics<Familia>(Familia.class).listar();
//        SelectItem[] items = new SelectItem[familias.size()];
//        int i = 0;
//        for (Familia f : familias) {
//            items[i++] = new SelectItem(f, f.getNome());
//        }
//        return items;
//    }
}
