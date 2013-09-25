<%-- 
    Document   : pessoa
    Created on : 23/09/2013, 19:06:10
    Author     : alauber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TSIBay</title>
    </head>
    <body>
        <h2>Compra</h2>
        <!-- Begin Compra -->

        <table width="500" border="0" cellpadding="10" cellspacing="10">
            <tr>
                <td width="69" colspan="2">Comprador</td>
            </tr>
            <tr>
                <td width="150">Nome:</td>
                <td width="546">${comprador.nome} </td>
            </tr>
            <tr>
                <td>CPF:</td>
                <td>${comprador.cpf}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${comprador.email}</td>
            </tr>
        </table>    

        <table width="500" border="0" cellpadding="10" cellspacing="10">
            <tr>
                <td width="69" colspan="2">Vendedor</td>
            </tr>
            <tr>
                <td width="150">Nome:</td>
                <td width="546">${vendedor.nome}</td>
            </tr>
            <tr>
                <td>CPF:</td>
                <td>${vendedor.cpf}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${vendedor.email}</td>
            </tr>
        </table>

        <table width="500" border="0" cellpadding="10" cellspacing="10">
            <tr>
                <td width="69" colspan="2">Transação</td>
            </tr>
            <tr>
                <td width="120">Data:</td>
                <td width="546"><fmt:formatDate value="${produtoTransacao.data}" pattern="dd/MM/yyyy" /></td>
            </tr>
            <tr>
                <td>Frete:</td>
                <td>${produtoTransacao.frete}</td>
            </tr>
            <tr>
                <td>Pagamento:</td>
                <td>${produtoTransacao.tpPagamento}</td>
            </tr>
            <tr>
                <td>Prazo:</td>
                <td><fmt:formatDate value="${produtoTransacao.prazoValidade}" pattern="dd/MM/yyyy" /></td>
            </tr>
        </table>

        <table width="500" border="0" cellpadding="10" cellspacing="10">
            <tr>
                <td width="69" colspan="2">Produto</td>
            </tr>
            <tr>
                <td width="120">Tipo:</td>
                <td width="546">${produtoTransacao.produto.familia.nome} </td>
            </tr>
            <tr>
                <td>Produto:</td>
                <td>${produtoTransacao.produto.nome}</td>
            </tr>
            <tr>
                <td>Quantidade:</td>
                <td>${produtoTransacao.qtdeProduto}</td>
            </tr>
            <tr>
                <td>Valor Unitário:</td>
                <td><fmt:formatNumber value="${produtoTransacao.valorUnitario}" pattern="R$ #,##0.00"/></td>
            </tr>
            <tr>
                <td>Valor Transação:</td>
                <td><fmt:formatNumber value="${valorTransacao}" pattern="R$ #,##0.00"/></td>
            </tr>
        </table>
        <!-- End Compra -->
    </body>
</html>
