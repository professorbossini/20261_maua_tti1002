USE 20261_maua_tti1002_sub2_pessoas;
SELECT * FROM tb_pessoa;

--adicionar uma coluan chamada ativo com valor padrão igual a 1, ela é inteira e somente admite valores 0 ou 1 (usar tbm a cláusula check)
ALTER TABLE tb_pessoa
ADD COLUMN ativo BOOLEAN DEFAULT TRUE 
CHECK (ativo IN (TRUE, FALSE)); 

-- DELETE FROM tb_pessoa
-- WHERE cod_pessoa = 1;
-- -- atualizar o nome de Maria para Maria Souza e seu email para mariasouza@email.com, usando um comando só
-- UPDATE tb_pessoa SET
-- nome='Maria Souza', email='mariasouza@email.com'
-- WHERE cod_pessoa = 3;
-- UPDATE tb_pessoa SET
-- nome = 'João da Silva'
-- WHERE cod_pessoa = 2;

-- SELECT * FROM tb_pessoa;

-- SELECT * FROM tb_pessoa WHERE cod_pessoa = 2;
-- SELECT nome, fone FROM tb_pessoa
-- WHERE cod_pessoa = 1 OR cod_pessoa = 3;

-- SELECT nome, fone FROM tb_pessoa
-- WHERE cod_pessoa IN (1, 3);

-- SELECT * FROM tb_pessoa
-- WHERE fone LIKE '1%';

--pegar somente fone e email de todo mundo que nome começando e terminando com A
-- SELECT fone, email FROM tb_pessoa
-- WHERE nome LIKE ('a%a');

-- INSERT INTO tb_pessoa
-- (nome, fone, email)
-- VALUES
-- ('João', '77887788', 'joao@email.com'),
-- ('Maria', '11442233', 'maria@email.com');

-- SELECT * FROM tb_pessoa;
-- --projeção
-- SELECT nome, email FROM tb_pessoa;

-- INSERT INTO tb_pessoa
-- (nome, fone, email)
-- VALUES
-- ('Ana', '12345678', 'ana@email.com');

-- CREATE TABLE tb_pessoa(
--   cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
--   nome VARCHAR(200),
--   fone VARCHAR(200),
--   email VARCHAR(200)
-- );

--USE 20261_maua_tti1002_sub2_pessoas;

--CREATE DATABASE 20261_maua_tti1002_sub2_pessoas;
    