        <!-- Begin Products -->
        <h2>Últimos produtos<span class="title-bottom">&nbsp;</span></h2>
        <div id="products">
            <c:forEach items="${listaProdutosUltimos}" var="p" begin="1" end="9">
                <div class="product">
                    <a href="#" title=${p.nome}>
                        <span class="title">${p.familia.nome}</span>
                        <img src="resources/imagesSite/product-img1.jpg" alt=${p.nome} " Image 1" />
                        <span class="number">${p.nome} </span>
                        <span class="price"><span>R$</span>${p.precoVenda}</span>
                    </a>
                </div>
            </c:forEach>
        </div>
        <!-- End Products -->