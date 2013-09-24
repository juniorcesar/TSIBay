/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.controller;

import br.edu.utfpr.cm.tsibay.daos.DaoPessoa;
import br.edu.utfpr.cm.tsibay.model.Pessoa;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        DaoPessoa pessoaDao = new DaoPessoa();
        Pessoa comprador = pessoaDao.getLogin(login, senha);

        if (comprador != null) {
            HttpSession s = request.getSession();
            s.setAttribute("comprador", comprador);
            s.setAttribute("login_id", comprador.getId());
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(req, resp);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(req, resp);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}