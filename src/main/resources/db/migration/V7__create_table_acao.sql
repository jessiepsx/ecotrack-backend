CREATE TABLE ACAO_SUSTENTAVEL (
                                  ID_ACAO NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                                  NOME VARCHAR2(100) NOT NULL,
                                  DESCRICAO VARCHAR2(255) NOT NULL,
                                  PONTOS NUMBER NOT NULL
);