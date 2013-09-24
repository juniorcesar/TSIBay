/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsibay.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alauber
 */
@WebFilter(filterName = "LoginFilter", urlPatterns = {"/transacao.jsp"})
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if (!req.getServletPath().startsWith("/LoginController")) {
            HttpSession s = req.getSession();
            String l = (String) s.getAttribute("login");

            if (l == null) {
                RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
                rd.forward(req, resp);
            }
        }
        
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {
    }
}