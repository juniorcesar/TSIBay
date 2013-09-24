/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.daos;

import br.edu.utfpr.cm.tsibay.model.Pessoa;
import java.util.List;

/**
 *
 * @author Alex
 */
public class DaoPessoa extends DaoGenerics<Pessoa> {

    public DaoPessoa() {
        super(Pessoa.class);
    }

    public Pessoa getLogin(String login, String senha) {

        List<Pessoa> pessoas = this.listar();

        for (Pessoa p : pessoas) {
            if (p.getLogin().equals(login) && p.getSenha().equals(senha)) {
                return p;
            }
        }

        return null;
    }
}