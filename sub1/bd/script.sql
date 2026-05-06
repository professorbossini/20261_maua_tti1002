--adicionar uma coluna
--ela se chama ativo
--é do tipo boolean
--somente admite valores 1 ou 0 (cláusula CHECK)
--vem com o valor 1 como padrão
ALTER TABLE tb_pessoa
ADD COLUMN ativo BOOLEAN DEFAULT 1 
CHECK (ativo IN (0, 1));

SELECT * FROM tb_pessoa;

UPDATE tb_pessoa SET ativo = 0
WHERE cod_pessoa = 1;


-- DELETE FROM tb_pessoa
-- WHERE cod_pessoa = 2;

-- SELECT * FROM tb_pessoa;

-- UPDATE tb_pessoa SET
-- nome='José da Silva'
-- WHERE cod_pessoa = 1;

-- SELECT * FROM tb_pessoa
-- WHERE cod_pessoa IN (1, 3);

-- SELECT nome, email FROM tb_pessoa
-- WHERE cod_pessoa = 1 OR cod_pessoa = 3;

-- SELECT nome FROM tb_pessoa
-- WHERE cod_pessoa = 2;

-- SELECT * FROM tb_pessoa
-- WHERE cod_pessoa = 1;
-- --projeção
-- SELECT nome, fone FROM tb_pessoa;
-- SELECT * FROM tb_pessoa;

-- INSERT INTO tb_pessoa
-- (nome, fone, email)
-- VALUES
-- ('João', '77774444', 'joao@email.com'),
-- ('Maria', '11001122', 'maria@email.com');

-- SELECT * FROM tb_pessoa;
-- INSERT INTO tb_pessoa
-- (nome, fone, email)
-- VALUES
-- ('José', '12345678', 'jose@email.com');

-- CREATE TABLE tb_pessoa(
--   cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
--   nome VARCHAR(200),
--   fone VARCHAR(200),
--   email VARCHAR(200)
-- );