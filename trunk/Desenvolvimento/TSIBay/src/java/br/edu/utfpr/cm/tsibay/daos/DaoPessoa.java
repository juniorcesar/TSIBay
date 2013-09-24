/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.daos;

import br.edu.utfpr.cm.tsibay.model.Pessoa;
import br.edu.utfpr.cm.tsibay.model.Produto;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author junior
 */
public class DaoPessoa extends DaoGenerics<Pessoa> {

    public DaoPessoa() {
        super(Pessoa.class);
    }

    public Pessoa obterPorLogin(String login) {
        List<Pessoa> pessoas = null;
        Query query = session.createQuery("FROM " + alvo.getSimpleName()
                + " WHERE login LIKE '" + login + "'");
        pessoas = query.list();
        if (!pessoas.isEmpty()) {
            return pessoas.get(0);
        }
        return null;
    }
}
