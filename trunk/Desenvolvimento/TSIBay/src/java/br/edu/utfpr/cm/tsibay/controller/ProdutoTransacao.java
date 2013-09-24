/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.controller;

import br.edu.utfpr.cm.tsibay.daos.DaoPessoa;
import br.edu.utfpr.cm.tsibay.daos.DaoProduto;
import br.edu.utfpr.cm.tsibay.daos.DaoTransacao;
import br.edu.utfpr.cm.tsibay.model.Pessoa;
import br.edu.utfpr.cm.tsibay.model.Produto;
import br.edu.utfpr.cm.tsibay.model.Transacao;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alauber
 */
@WebServlet(name = "ProdutoTransacao", urlPatterns = {"/ProdutoTransacao"})
public class ProdutoTransacao extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        SimpleDateFormat outFmt = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat inFmt = new SimpleDateFormat("dd/MM/yyyy");

        Produto produto = new Produto();
        DaoProduto daoProduto = new DaoProduto();

        Pessoa pessoa = new Pessoa();
        DaoPessoa daoPessoa = new DaoPessoa();

        Transacao transacao = new Transacao();
        DaoTransacao daoTransacao = new DaoTransacao();

        produto = daoProduto.obterPorId(Integer.parseInt(request.getParameter("idProduto")));

        transacao.setProduto(produto);
        transacao.setValorUnitario(produto.getPrecoVenda());
        transacao.setQtdeProduto(Integer.parseInt(request.getParameter("qtdeCompra")));
        transacao.setFrete(produto.getFrete());
        transacao.setTpPagamento("A combinar");
        Date prazo = new Date();
        prazo.setDate(prazo.getDate() + produto.getPrazo());
        transacao.setPrazoValidade(prazo);
        transacao.setData(new Date());
        Pessoa comprador = daoPessoa.obterPorId(Integer.parseInt(request.getParameter("comprador_id")));
        Pessoa vendedor = produto.getPessoa();
        transacao.setComprador(comprador);
        transacao.setVendedor(vendedor);

        daoTransacao.persistir(transacao);
        produto.setQtdeDisponivel(produto.getQtdeDisponivel() - transacao.getQtdeProduto());
        produto.setQtdeVendida(produto.getQtdeVendida() + transacao.getQtdeProduto());
        daoProduto.persistir(produto);

        double valorTransacao = transacao.getQtdeProduto() * transacao.getValorUnitario();

        HttpSession s = request.getSession();
        s.setAttribute("vendedor", vendedor);
        s.setAttribute("produtoTransacao", transacao);
        s.setAttribute("valorTransacao", valorTransacao);

        response.sendRedirect("transacao.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
