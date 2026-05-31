CREATE TABLE DICA_ESG (
                          ID_DICA NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                          TITULO VARCHAR2(100) NOT NULL,
                          DESCRICAO VARCHAR2(255) NOT NULL,
                          CATEGORIA VARCHAR2(80) NOT NULL
);