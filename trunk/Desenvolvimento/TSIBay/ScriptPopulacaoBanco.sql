USE tsibay;

INSERT INTO Familia (id, nome) values (1, "Computadores");
INSERT INTO Familia (id, nome) values (2, "Notebooks");
INSERT INTO Familia (id, nome) values (3, "Componentes");
INSERT INTO Familia (id, nome) values (4, "Software");
INSERT INTO Familia (id, nome) values (5, "Smartphones");
INSERT INTO Familia (id, nome) values (6, "Cameras");
INSERT INTO Familia (id, nome) values (7, "Outros");

INSERT INTO Pessoa (id, cpf, dtCadastro, dtNascimento, email, login, nome, senha, tipo)
VALUES (1, "12345678910", "2013-09-11", "1985-10-10", "fulano@fulano.com.br", "fulano", "Fulano de Tal", "123", "Usuario");

INSERT INTO Pessoa (id, cpf, dtCadastro, dtNascimento, email, login, nome, senha, tipo)
VALUES (2, "12345678911", "2013-09-11", "1980-03-25", "joao@joao.com.br", "joao", "Joao da Silva", "456", "Usuario");

INSERT INTO Pessoa (id, cpf, dtCadastro, dtNascimento, email, login, nome, senha, tipo)
VALUES (3, "12345678912", "2013-09-11", "1987-04-03", "jose@jose.com.br", "jose", "Jose de Souza", "789", "Usuario");

INSERT INTO Pessoa (id, cpf, dtCadastro, dtNascimento, email, login, nome, senha, tipo)
VALUES (4, "12345678913", "2013-09-10", "1973-11-15", "maria@maria.com.br", "maria", "Maria dos Santos", "321", "Usuario");

INSERT INTO Pessoa (id, cpf, dtCadastro, dtNascimento, email, login, nome, senha, tipo)
VALUES (5, "12345678914", "2013-09-10", "1975-05-17", "fatima@fatima.com.br", "fatima", "Fatima de Paula", "654", "Usuario");

INSERT INTO Pessoa (id, cpf, dtCadastro, dtNascimento, email, login, nome, senha, tipo)
VALUES (6, "12345678915", "2013-09-10", "1978-08-20", "paulo@paulo.com.br", "paulo", "Paulo de Lima", "987", "Usuario");

INSERT INTO Pessoa (id, cpf, dtCadastro, dtNascimento, email, login, nome, senha, tipo)
VALUES (7, "12345678916", "2013-09-11", "1986-10-31", "marcos@marcos.com.br", "marcos", "Marcos Oliveira", "123", "Usuario");

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (1, "2013-10-09", "Processador Intel® Celeron® G470 (2.0GHz, 2 Threads, 1.5Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 2GB, Dual Channel DDR3, 1600MHz (1x2Gb) - Disco Rígido 500GB", "2013-10-10", "Dell", "A Combinar", "Computador Dell Spiron", 0, 5, 2500, 10, 0, 10, 1, 1);

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (2, "2013-10-09", "Processador Intel® Celeron® G470 (2.0GHz, 2 Threads, 1.5Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 2GB, Dual Channel DDR3, 1600MHz (1x2Gb) - Disco Rígido 500GB", "2013-10-10", "Dell", "Grátis", "Computador Dell Spiron", 0, 5, 2400, 10, 0, 10, 1, 5);

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (3, "2013-10-09", "Processador Intel® Celeron® G470 (2.0GHz, 2 Threads, 1.5Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 2GB, Dual Channel DDR3, 1600MHz (1x2Gb) - Disco Rígido 500GB", "2013-10-10", "Dell", "Grátis", "Computador Dell Spiron", 0, 5, 2650, 10, 0, 10, 1, 7);

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (4, "2013-10-09", "3ª Geração do Processador Intel® Core™ i3-3240 (3.4GHz, 4 Threads, 3Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 4GB, Dual Channel DDR3, 1600MHz (1x4Gb) - Disco Rígido 500GB, SATA (7200 RPM)", "2013-10-10", "Dell", "A Combinar", "Computador Dell Vostro", 0, 5, 2750, 5, 0, 5, 1, 1);

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (5, "2013-10-09", "3ª Geração do Processador Intel® Core™ i3-3240 (3.4GHz, 4 Threads, 3Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 4GB, Dual Channel DDR3, 1600MHz (1x4Gb) - Disco Rígido 500GB, SATA (7200 RPM)", "2013-10-10", "Dell", "Grátis", "Computador Dell Vostro", 0, 5, 2850, 5, 0, 5, 1, 2);

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (6, "2013-10-09", "3ª Geração do Processador Intel® Core™ i3-3240 (3.4GHz, 4 Threads, 3Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 4GB, Dual Channel DDR3, 1600MHz (1x4Gb) - Disco Rígido 500GB, SATA (7200 RPM)", "2013-10-10", "Dell", "Grátis", "Computador Dell Vostro", 0, 5, 2850, 5, 0, 5, 1, 4);

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (7, "2013-10-09", "3ª Geração do Processador Intel® Core™ i3-3240 (3.4GHz, 4 Threads, 3Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 4GB, Dual Channel DDR3, 1600MHz (1x4Gb) - Disco Rígido 500GB, SATA (7200 RPM)", "2013-10-10", "Dell", "Grátis", "Computador Dell Vostro", 0, 5, 2850, 5, 0, 5, 1, 3);

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (8, "2013-10-09", "3ª Geração do Processador Intel® Core™ i3-3240 (3.4GHz, 4 Threads, 3Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 4GB, Dual Channel DDR3, 1600MHz (1x4Gb) - Disco Rígido 500GB, SATA (7200 RPM)", "2013-10-10", "Dell", "Grátis", "Computador Dell Vostro", 0, 5, 2850, 5, 0, 5, 1, 4);

INSERT INTO Produto (id, data, descricao, dtLimiteVenda, fabricante, frete, nome, ofertado, prazo, precoVenda, qtdeDisponivel, qtdeVendida, quantidade, familia_id, pessoa_id)
VALUES (9, "2013-10-09", "3ª Geração do Processador Intel® Core™ i3-3240 (3.4GHz, 4 Threads, 3Mb Cache) - Windows® 7 Home Basic 64-Bit - Memória 4GB, Dual Channel DDR3, 1600MHz (1x4Gb) - Disco Rígido 500GB, SATA (7200 RPM)", "2013-10-10", "Dell", "Grátis", "Computador Dell Vostro", 0, 5, 2850, 5, 0, 5, 1, 5);