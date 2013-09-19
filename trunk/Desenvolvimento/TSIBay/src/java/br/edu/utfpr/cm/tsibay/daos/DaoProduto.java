/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.daos;

import br.edu.utfpr.cm.tsibay.model.Familia;
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

    public List<Produto> listarProdutosUltimos(long filtroItens) {
        List<Produto> produtos = super.listar();
        filtroItens = produtos.get(produtos.size() - 1).getId() - filtroItens;

        if (filtroItens > 0) {
            Query query = session.createQuery("FROM " + alvo.getSimpleName()
                    + " WHERE ofertado = 0 AND id >= " + filtroItens);
            produtos = query.list();
        }
        return produtos;
    }

    public List<Produto> listarProdutosPesquisa(String pesquisa) {
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
        Query query = session.createQuery("SELECT TOP 2 p.id, SUM(p.qtdeVendida) FROM " + alvo.getSimpleName() + " p "
                + " GROUP BY p.id ORDER BY SUM(p.qtdeVendida) DESC 2");
        query.setFirstResult(1 * 2);
        query.setMaxResults(2);
        produtos = query.list();
        return produtos;
    }
    
    public static void main(String[] args) {
        List<Produto> prod = new DaoProduto().listarProdutosMaisVendidos();
            System.out.println(prod.toString());
    }
}