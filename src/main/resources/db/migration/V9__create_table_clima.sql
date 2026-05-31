CREATE TABLE CLIMA (
                       ID_CLIMA NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                       TEMPERATURA NUMBER(5,2),
                       UMIDADE NUMBER,
                       INDICE_UV VARCHAR2(50),
                       QUALIDADE_AR VARCHAR2(50),
                       DESCRICAO VARCHAR2(100)
);