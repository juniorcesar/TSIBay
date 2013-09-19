/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.daos;

import br.edu.utfpr.cm.tsibay.model.Produto;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Alex
 */
public class DaoProduto extends DaoGenerics<Produto> {

    public DaoProduto() {
        super(Produto.class);
    }

    public List<Produto> listarProdutosPorFamilia(int idFamilia) {

        List<Produto> produtos = null;
        Query query = session.createQuery("FROM " + alvo.getSimpleName()
                + " WHERE ofertado = 0 AND familia_id = " + idFamilia);
        produtos = query.list();
        return produtos;
    }

    public List<Produto> listarProdutosUltimos() {
        List<Produto> produtos = null;
        Query query = session.createQuery("FROM " + alvo.getSimpleName()
                + " WHERE ofertado = 0 ORDER BY id DESC");
        query.setMaxResults(9);
        produtos = query.list();
        return produtos;
    }

    public List<Produto> listarProdutosPorNome(String pesquisa) {
        List<Produto> produtos = null;
        if (pesquisa != null) {
            Query query = session.createQuery("FROM " + alvo.getSimpleName()
                    + " WHERE nome LIKE '%" + pesquisa + "%'");
            produtos = query.list();
        }
        return produtos;
    }

    public List<Produto> listarProdutosMaisVendidos() {
        List<Produto> produtos = null;
        Query query = session.createQuery("FROM " + alvo.getSimpleName()
                + " WHERE ofertado = 0 ORDER BY qtdeVendida DESC");
        query.setMaxResults(6);
        produtos = query.list();
        return produtos;
    }

    public static void main(String[] args) {
        List<Produto> prod = new DaoProduto().listarProdutosMaisVendidos();
        for (Produto p : prod) {
            System.out.println(p.getId() + " - " + p.getNome() + " - " + p.getQtdeVendida());
        }
    }
}