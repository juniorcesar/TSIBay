/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.managedbean;

import br.edu.utfpr.cm.tsibay.daos.DaoGenerics;
import br.edu.utfpr.cm.tsibay.model.Familia;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;

/**
 *
 * @author Junior
 */
@ManagedBean(name="familiaBean")
@FacesConverter("familiaConverter")
@SessionScoped
public class FamiliaConverter implements Converter{

    private static List<Familia> familias;
    Familia familia;

    public FamiliaConverter() {
        familias = new DaoGenerics<Familia>(Familia.class).listar();
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public SelectItem[] getFamilias() {
        List<Familia> familias = new DaoGenerics<Familia>(Familia.class).listar();
        SelectItem[] items = new SelectItem[familias.size()];
        int i = 0;
        for (Familia f : familias) {
            items[i++] = new SelectItem(f, f.getNome());
        }
        return items;
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value.trim().equals("")) {
            return null;
        } else {
            try {
                int number = Integer.parseInt(value);

                for (Familia f : familias) {  
                    if (f.getId()== number) {  
                        return f;  
                    }  
                } 

            } catch (NumberFormatException exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid player"));
            }
        }

        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null || value.equals("")) {  
            return "";  
        } else {  
            return String.valueOf(((Familia) value).getId());  
        } 
    }

}
