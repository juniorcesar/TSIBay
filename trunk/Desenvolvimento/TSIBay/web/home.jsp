<%-- 
    Document   : home
    Created on : 11/09/2013, 20:59:31
    Author     : alauber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en-US" xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      dir="ltr">
    <head>
        <title>TSIBay - Aqui fica fácil de vender</title>
        <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
        <link rel="shortcut icon" href="resources/imagesSite/favicon.ico" />
        <link rel="stylesheet" href="resources/css/LayoutSite.css" type="text/css" media="all" />

        <script src="resources/js/jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
        <!--[if IE 6]>
                <script src="js/DD_belatedPNG-min.js" type="text/javascript" charset="utf-8"></script>
        <![endif]-->
        <script src="resources/js/jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
        <script src="resources/js/functions.js" type="text/javascript" charset="utf-8"></script>
    </head>
    <body>
        <!-- Begin Wrapper -->
        <div id="wrapper">
            <!-- Begin Search -->
            <div id="search">
                <div class="shell">
                    <form action="#" method="get" accept-charset="utf-8">
                        <div class="container">
                            <input type="text" value="pesquisa..." title="Pesquisa..." class="blink" onClick="javascript:this.value = '';"/>
                        </div>
                        <input class="search-button" type="submit" value="Submit" />
                    </form>
                    <div class="cl">&nbsp;</div>
                </div>
            </div>
            <!-- End Search -->
            <!-- Begin Header -->
            <div id="header" class="shell">
                <h1 id="logo"><a class="notext" href="#" title="TSIBay">TSYBay</a></h1>
            </div>
            <!-- End Header -->
            <!-- Begin Navigation -->
            <div id="navigation">
                <div class="shell">
                    <ul>
                        <li><a href="#" title="Home">Home</a></li>
                        <li><a href="#" title="Ofertas especiais">Ofertas especiais</a></li>
                        <li><a href="#" title="Login">Login</a></li>
                        <li><a href="admin.xhtml" title="Administração"  target="blank">Administração</a></li>
                        <li><a href="#" title="Checkout">Checkout</a></li>
                        <li><a href="#" title="Contact">Contato</a></li>
                    </ul>
                    <div class="cl">&nbsp;</div>
                </div>
            </div>
            <!-- End Navigation -->
            <!-- Begin Main -->
            <div id="main">
                <!-- Begin Inner -->
                <div class="inner">
                    <div class="shell">
                        <!-- Begin Left Sidebar -->
                        <div id="left-sidebar" class="sidebar">
                            <ul>
                                <c:import url="/listaFamilias.jsp" />
                                <li class="widget">
                                    <h2>Informações</h2>
                                    <div class="widget-entry">
                                        <ul>
                                            <li><a href="#" title="Empresa"><span>Empresa</span></a></li>
                                            <li><a href="#" title="Politica de Privacidade"><span>Politica de Privacidade</span></a></li>
                                            <li><a href="#" title="Termos &amp; Condições"><span>Termos &amp; Condições</span></a></li>
                                            <li><a href="#" title="Contato"><span>Contato</span></a></li>
                                            <li class="last"><a href="#" title="Mapa do Site"><span>Mapa do Site</span></a></li>
                                        </ul>
                                    </div>
                                </li>
                                <li class="widget select-widget">
                                    <h2>Brands</h2>
                                    <div class="widget-entry">
                                        <div class="selectbox">
                                            <span class="currentItem">--- <span>Please Select</span> ---</span>
                                            <div class="list">
                                                <ul>
                                                    <li class="active"><a href="#" title="Please Select">Please Select</a></li>
                                                    <li><a href="#" title="Brand 1">Brand 1</a></li>
                                                    <li><a href="#" title="Brand 2">Brand 2</a></li>
                                                    <li><a href="#" title="Brand 3">Brand 3</a></li>
                                                </ul>
                                            </div>
                                            <select>
                                                <option value="option" selected="selected">Please Select</option>
                                                <option value="option1">Brand 1</option>
                                                <option value="option2">Brand 2</option>
                                                <option value="option3">Brand 3</option>
                                            </select>
                                        </div>
                                        <div class="cl">&nbsp;</div>
                                    </div>
                                </li>
                                <li class="widget">
                                    <h2>Shopping Card</h2>
                                    <div class="widget-entry">
                                        <a href="#" class="items" title="Shopping Card Items">0 items</a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        <!-- End Sidebar -->
                        <!-- Begin Content -->
                        <div id="content">
                            <!-- Begin Post -->
                            <div class="post">
                                <h2>Bem vindo à nossa loja<span class="title-bottom">&nbsp;</span></h2>
                                <p>Confira os produtos oferecidos logo abaixo.</p>
                            </div>
                            <!-- End Post -->
                            <c:import url="/listaProdutosUltimos.jsp" />
                        </div>
                        <!-- End Content -->
                        <!-- Begin Right Sidebar -->
                        <div id="right-sidebar" class="sidebar">
                            <c:import url="/listaProdutosMaisVendidosELancamentos.jsp" />                            
                        </div>
                        <!-- End Sidebar -->
                        <div class="cl">&nbsp;</div>
                    </div>
                </div>
                <!-- End Inner -->
            </div>
            <!-- End Main -->
            <!-- Begin Footer -->
            <div id="footer">
                <div class="shell">
                    <p class="bottom-menu"><a href="#" title="Home">Início</a><span>|</span><a href="#" title="Ofertas especiais">Ofertas especiais</a><span>|</span><a href="#" title="Login">Login</a><span>|</span><a href="#" title="Administração">Administração</a><span>|</span><a href="#" title="Checkout">Checkout</a><span>|</span><a href="#" title="Contato">Contato</a></p>
                    <p>Copyright &copy; TSYBay 2013. Design by: <a href="#" title="Junior Cesar de Olivera &amp; Alecsandro Lauber">Junior Cesar de Olivera &amp; Alexsandro Lauber</a>. Todos os direitos reservados. </p>
                    <div class="cl">&nbsp;</div>
                </div>
            </div>
            <!-- End Footer -->
        </div>
        <!-- End Wrapper -->
    </body>
</html>
