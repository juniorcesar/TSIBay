/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.daos;

import br.edu.utfpr.cm.tsibay.model.Familia;
import br.edu.utfpr.cm.tsibay.model.Produto;
import java.util.List;

/**
 *
 * @author Alex
 */
public class DaoProduto extends DaoGenerics<Produto> {

    public DaoProduto() {
        super(Produto.class);
    }

    public List<Produto> listarProdutosPorFamilia(Familia familia) {

        List<Produto> produtos = null;
        for (Produto produto : produtos) {
            if (produto.getFamilia().equals(familia)) {
                produtos.add(produto);
            }
        }
        return produtos;
    }
}