/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.controller;

import br.edu.utfpr.cm.tsibay.daos.DaoProduto;
import br.edu.utfpr.cm.tsibay.model.Produto;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "ProdutoPesquisa", urlPatterns = {"/ProdutoPesquisa"})
public class ProdutoPesquisa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        List<Produto> listaProdutos = null;
        DaoProduto daoProduto = new DaoProduto();

        if (!request.getParameter("idFamilia").isEmpty()) {
            int idFamilia = Integer.parseInt(request.getParameter("idFamilia"));
            listaProdutos = daoProduto.listarProdutosPorFamilia(idFamilia);
        } 
        if (!request.getParameter("descricaoProduto").isEmpty()) {
            String pesquisa = request.getParameter("descricaoProduto");
            listaProdutos = daoProduto.listarProdutosPesquisa(pesquisa);
        } 
        








        HttpSession s = request.getSession();
        s.setAttribute("listaProdutos", listaProdutos);

        response.sendRedirect("home.jsp");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
