        <!-- Begin Products -->
        <ul>
            <li class="widget products-box">
                <h2>Mais vendidos</h2>
                <div class="widget-entry">
                    <ul>
                        <c:forEach items="${produtosMaisVendidos}" var="p" begin="1" end="7" >
                            <li>
                                <a href="#" title=${p.nome}>
                                    <img src="resources/imagesSite/side-img1.jpg" alt="Product Side Image 1" />
                                    <span class="info">
                                        <span class="title">${p.nome}</span>
                                        <span class="price"><span>R$</span>${p.precoVenda}</span>
                                    </span>
                                    <span class="cl">&nbsp;</span>
                                </a>
                            </li>
                        </c:forEach>                                            
                    </ul>
                    <div class="cl">&nbsp;</div>
                </div>
            </li>
            <li class="widget products-box">
                <h2>Lançamentos</h2>
                <div class="widget-entry">
                    <ul>
                        <c:forEach items="${produtos}" var="p" begin="1" end="7" >
                            <li>
                                <a href="#" title=${p.nome}>
                                    <img src="resources/imagesSite/side-img1.jpg" alt="Product Side Image 1" />
                                    <span class="info">
                                        <span class="title">${p.nome}</span>
                                        <span class="price"><span>R$</span>${p.precoVenda}</span>
                                    </span>
                                    <span class="cl">&nbsp;</span>
                                </a>
                            </li>
                        </c:forEach>
                    </ul>
                    <div class="cl">&nbsp;</div>
                </div>
            </li>
        </ul>
        <!-- End Products -->