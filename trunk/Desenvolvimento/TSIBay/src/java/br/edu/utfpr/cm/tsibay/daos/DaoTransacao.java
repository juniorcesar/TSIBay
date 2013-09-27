/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.daos;

import br.edu.utfpr.cm.tsibay.model.Pessoa;
import br.edu.utfpr.cm.tsibay.model.Transacao;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Alex
 */
public class DaoTransacao extends DaoGenerics<Transacao> {

    public DaoTransacao() {
        super(Transacao.class);
    }
    
        public List<Transacao> listarVendasEmAndamento(Pessoa p) {
        Query query = session.createQuery("FROM " + alvo.getSimpleName() + " p WHERE produto.id IN (p.id FROM Produto WHERE pessoa.id = "+p.getId().intValue()+")");
        return query.list();
    }
    public List<Transacao> listarComprasEmAndamento(Pessoa p) {
        Query query = session.createQuery("FROM " + alvo.getSimpleName() + " p WHERE produto.id IN (p.id FROM Produto WHERE pessoa.id = "+p.getId().intValue()+")");
        return query.list();
    }
    public List<Transacao> listarTotalVendas(Pessoa p) {
        Query query = session.createQuery("FROM " + alvo.getSimpleName() + " p WHERE produto.id IN (p.id FROM Produto WHERE pessoa.id = "+p.getId().intValue()+")");
        return query.list();
    }
    public List<Transacao> listarTotalCompras(Pessoa p) {
        Query query = session.createQuery("FROM " + alvo.getSimpleName() + " p WHERE produto.id IN (p.id FROM Produto WHERE pessoa.id = "+p.getId().intValue()+")");
        return query.list();
    }
}