CREATE TABLE paises (
    pais_id   NUMBER PRIMARY KEY,
    nombre    NVARCHAR2(15),
    continente_p NVARCHAR2(10),
    poblacion NUMBER(4),
    CONSTRAINT check_continente_p CHECK ( continente_p IN ( 'AMERICA', 'AFRICA', 'EUROPA', 'ASIA', 'OCEANIA' ) ),
    idpresidentes NUMBER(3)
);

CREATE TABLE presidentes (
    idpresidentes NUMBER PRIMARY KEY,
    nombre        NVARCHAR2(15),
    edad          NUMBER(2)
);

--CREAR LLAVE FORANEA
ALTER TABLE paises
    ADD CONSTRAINT fkidpresidentes FOREIGN KEY ( idpresidentes )
        REFERENCES presidentes ( idpresidentes );

Describe paises;
Describe presidentes;
select * from paises;
select * from presidentes;

CREATE SEQUENCE PAISES_SEQ;
CREATE SEQUENCE PRESIDENTES_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_paises BEFORE
INSERT ON paises FOR EACH ROW BEGIN
SELECT paises_SEQ.NEXTVAL INTO :new.pais_id FROM dual;
END;

CREATE OR REPLACE TRIGGER ON_INSERT_presidentes BEFORE
INSERT ON presidentes FOR EACH ROW BEGIN
SELECT presidentes_SEQ.NEXTVAL INTO :new.idpresidentes FROM dual;
END;

INSERT ALL
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('México','AMERICA',500)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Afganistán','ASIA',9999)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Albania','EUROPA',5007)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Bélgica','EUROPA',7990)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Francia','EUROPA',8766)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Ghana','AFRICA',5700)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Hungría','EUROPA',7658)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Israel','ASIA',4355)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Italia','EUROPA',5675)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Kazajistán','EUROPA',6567)
SELECT * FROM DUAL;

--UPDATE PAISES SET NOMBRE = 'México' Where NOMBRE = 'PEÑANIETO';

INSERT ALL
INTO presidentes(NOMBRE,EDAD)
VALUES('PEÑANIETO',45)

INTO presidentes(NOMBRE,EDAD)
VALUES('Jimmy Carter',97)
INTO presidentes(NOMBRE,EDAD)
VALUES('Anastasio Bustamante',28)
INTO presidentes(NOMBRE,EDAD)
VALUES('Melchor Múzquiz',83)
INTO presidentes(NOMBRE,EDAD)
VALUES('Manuel Gómez Pedraza',33)
INTO presidentes(NOMBRE,EDAD)
VALUES('Valentín Gómez Farías',45)
INTO presidentes(NOMBRE,EDAD)
VALUES('Miguel Barragán',64)
INTO presidentes(NOMBRE,EDAD)
VALUES('Vladímir Putin',93)
INTO presidentes(NOMBRE,EDAD)
VALUES('Borís Yeltsin',23)
INTO presidentes(NOMBRE,EDAD)
VALUES('Dmitri Medvédev',27)
SELECT * FROM DUAL;

