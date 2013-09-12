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
    <h:head>
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
    </h:head>
    <h:body>
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
            <!-- Begin Slider -->
            <div id="slider">
                <div class="slider-outer">
                    <div class="slider-inner shell">
                        <!-- Begin Slider Items -->
                        <ul class="slider-items">
                            <li>
                                <img src="resources/imagesSite/slide-img1.jpg" alt="Slide Image 1" />
                                <div class="slide-entry">
                                    <h2>Ofertas especias</h2>
                                    <h3>Ótimas ofertas para você e sua família</h3>
                                    <p>Aqui você encontra uma variedade de produtos de grande qualidade com ótimos preços.</p>
                                </div>
                                <a href="#" class="more" title="Veja mais">Veja mais</a>
                            </li>
                            <li>
                                <img src="resources/imagesSite/slide-img1.jpg" alt="Slide Image 1" />
                                <div class="slide-entry">
                                    <h2>Ofertas especias</h2>
                                    <h3>Ótimas ofertas para você e sua família</h3>
                                    <p>Aqui você encontra uma variedade de produtos de grande qualidade com ótimos preços.</p>
                                </div>
                                <a href="#" class="more" title="Veja mais">Veja mais</a>
                            </li>
                            <li>
                                <img src="resources/imagesSite/slide-img1.jpg" alt="Slide Image 1" />
                                <div class="slide-entry">
                                    <h2>Ofertas especias</h2>
                                    <h3>Ótimas ofertas para você e sua família</h3>
                                    <p>Aqui você encontra uma variedade de produtos de grande qualidade com ótimos preços.</p>
                                </div>
                                <a href="#" class="more" title="Veja mais">Veja mais</a>
                            </li>
                            <li>
                                <img src="resources/imagesSite/slide-img1.jpg" alt="Slide Image 1" />
                                <div class="slide-entry">
                                    <h2>Ofertas especias</h2>
                                    <h3>Ótimas ofertas para você e sua família</h3>
                                    <p>Aqui você encontra uma variedade de produtos de grande qualidade com ótimos preços.</p>
                                </div>
                                <a href="#" class="more" title="Veja mais">Veja mais</a>
                            </li>
                            <li>
                                <img src="resources/imagesSite/slide-img1.jpg" alt="Slide Image 1" />
                                <div class="slide-entry">
                                    <h2>Ofertas especias</h2>
                                    <h3>Ótimas ofertas para você e sua família</h3>
                                    <p>Aqui você encontra uma variedade de produtos de grande qualidade com ótimos preços.</p>
                                </div>
                                <a href="#" class="more" title="Veja mais">Veja mais</a>
                            </li>
                        </ul>
                        <!-- End Slider Items -->
                        <div class="cl">&nbsp;</div>
                        <div class="slider-controls">

                        </div>
                    </div>
                </div>
                <div class="cl">&nbsp;</div>
            </div>
            <!-- End Slider -->
            <!-- Begin Main -->
            <div id="main">
                <!-- Begin Inner -->
                <div class="inner">
                    <div class="shell">
                        <!-- Begin Left Sidebar -->
                        <div id="left-sidebar" class="sidebar">
                            <ul>
                                <li class="widget">
                                    <h2>Categorias</h2>
                                    <div class="widget-entry">
                                        <ul>
                                            <c:forEach items="${familias}" var="f" >
                                                <li><a href="#" title=${f.nome}><span>${f.nome}</span></a></li>
                                            </c:forEach>
                                        </ul>
                                    </div>
                                </li>
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
                            <!-- Begin Products -->
                            <div id="products">
                                <h2>Latest Products<span class="title-bottom">&nbsp;</span></h2>
                                <div class="product">
                                    <a href="#" title="Product 1">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img1.jpg" alt="Product Image 1" />
                                        <span class="number">Product 14</span>
                                        <span class="price"><span>$</span>587.50</span>
                                    </a>
                                </div>
                                <div class="product">
                                    <a href="#" title="Product 2">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img2.jpg" alt="Product Image 2" />
                                        <span class="number">Product 17</span>
                                        <span class="price"><span>$</span>1587.50</span>
                                    </a>
                                </div>
                                <div class="product last">
                                    <a href="#" title="Product 3">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img3.jpg" alt="Product Image 3" />
                                        <span class="number">Product 22</span>
                                        <span class="price"><span>$</span>1249.99</span>
                                    </a>
                                </div>
                                <div class="cl">&nbsp;</div>
                                <div class="product">
                                    <a href="#" title="Product 4">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img4.jpg" alt="Product Image 4" />
                                        <span class="number">Product 9</span>
                                        <span class="price"><span>$</span>199.99</span>
                                    </a>
                                </div>
                                <div class="product">
                                    <a href="#" title="Product 5">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img5.jpg" alt="Product Image 5" />
                                        <span class="number">Product 21</span>
                                        <span class="price"><span>$</span>259.50</span>
                                    </a>
                                </div>
                                <div class="product last">
                                    <a href="#" title="Product 6">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img6.jpg" alt="Product Image 6" />
                                        <span class="number">Product 2</span>
                                        <span class="price"><span>$</span>785.20</span>
                                    </a>
                                </div>
                                <div class="cl">&nbsp;</div>
                                <div class="product">
                                    <a href="#" title="Product 7">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img7.jpg" alt="Product Image 7" />
                                        <span class="number">Product 115</span>
                                        <span class="price"><span>$</span>99.99</span>
                                    </a>
                                </div>
                                <div class="product">
                                    <a href="#" title="Product 8">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img8.jpg" alt="Product Image 8" />
                                        <span class="number">Product 97</span>
                                        <span class="price"><span>$</span>199.99</span>
                                    </a>
                                </div>
                                <div class="product last">
                                    <a href="#" title="Product 9">
                                        <span class="title">Product Name</span>
                                        <img src="resources/imagesSite/product-img9.jpg" alt="Product Image 9" />
                                        <span class="number">Product 24</span>
                                        <span class="price"><span>$</span>688.50</span>
                                    </a>
                                </div>
                                <div class="cl">&nbsp;</div>
                            </div>
                            <!-- End Products -->
                        </div>
                        <!-- End Content -->
                        <!-- Begin Right Sidebar -->
                        <div id="right-sidebar" class="sidebar">
                            <ul>
                                <li class="widget products-box">
                                    <h2>Bestsellers</h2>
                                    <div class="widget-entry">
                                        <ul>
                                            <li>
                                                <a href="#" title="Side Product 1">
                                                    <img src="resources/imagesSite/side-img1.jpg" alt="Product Side Image 1" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>117.50</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 2">
                                                    <img src="resources/imagesSite/side-img2.jpg" alt="Product Side Image 2" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>94.00</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 3">
                                                    <img src="resources/imagesSite/side-img3.jpg" alt="Product Side Image 3" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>1,175.00</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 4">
                                                    <img src="resources/imagesSite/side-img4.jpg" alt="Product Side Image 4" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>117.50</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 5">
                                                    <img src="resources/imagesSite/side-img5.jpg" alt="Product Side Image 5" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>1,175.00</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 6">
                                                    <img src="resources/imagesSite/side-img6.jpg" alt="Product Side Image 6" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>587.50</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 7">
                                                    <img src="resources/imagesSite/side-img7.jpg" alt="Product Side Image 7" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>1,175.00</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 8">
                                                    <img src="resources/imagesSite/side-img8.jpg" alt="Product Side Image 8" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>117.50</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 9">
                                                    <img src="resources/imagesSite/side-img9.jpg" alt="Product Side Image 9" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>118.68</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Side Product 10">
                                                    <img src="resources/imagesSite/side-img10.jpg" alt="Product Side Image 10" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>235.00</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                        </ul>
                                        <div class="cl">&nbsp;</div>
                                    </div>
                                </li>
                                <li class="widget products-box">
                                    <h2>Feature</h2>
                                    <div class="widget-entry">
                                        <ul>
                                            <li>
                                                <a href="#" title="Featured Product 1">
                                                    <img src="resources/imagesSite/featured-img1.jpg" alt="Product Featured Image 1" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>117.50</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Featured Product 2">
                                                    <img src="resources/imagesSite/featured-img2.jpg" alt="Product Featured Image 2" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>94.00</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Featured Product 3">
                                                    <img src="resources/imagesSite/featured-img3.jpg" alt="Product Featured Image 3" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>1,175.00</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Featured Product 4">
                                                    <img src="resources/imagesSite/featured-img4.jpg" alt="Product Featured Image 4" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>117.50</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Featured Product 5">
                                                    <img src="resources/imagesSite/featured-img5.jpg" alt="Product Featured Image 5" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>1,175.00</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#" title="Featured Product 6">
                                                    <img src="resources/imagesSite/featured-img6.jpg" alt="Product Featured Image 6" />
                                                    <span class="info">
                                                        <span class="title">Product Name</span>
                                                        <span class="price"><span>$</span>587.50</span>
                                                    </span>
                                                    <span class="cl">&nbsp;</span>
                                                </a>
                                            </li>								
                                        </ul>
                                        <div class="cl">&nbsp;</div>
                                    </div>
                                </li>
                            </ul>
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
                    <p class="bottom-menu"><a href="#" title="Home">Home</a><span>|</span><a href="#" title="Ofertas especiais">Ofertas especiais</a><span>|</span><a href="#" title="Login">Login</a><span>|</span><a href="#" title="Administração">Administração</a><span>|</span><a href="#" title="Checkout">Checkout</a><span>|</span><a href="#" title="Contato">Contato</a></p>
                    <p>Copyright &copy; PC Store 2012. Design by: <a href="#" title="Junior Cesar de Olivera &amp; Alecsandro Lauber">Junior Cesar de Olivera &amp; Alecsandro Lauber</a>. Todos os direitos reservados. </p>
                    <div class="cl">&nbsp;</div>
                </div>
            </div>
            <!-- End Footer -->
        </div>
        <!-- End Wrapper -->
    </h:body>
</html>