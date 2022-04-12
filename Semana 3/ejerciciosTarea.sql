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
VALUES('M�xico','AMERICA',500)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Afganist�n','ASIA',9999)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Albania','EUROPA',5007)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('B�lgica','EUROPA',7990)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Francia','EUROPA',8766)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Ghana','AFRICA',5700)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Hungr�a','EUROPA',7658)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Israel','ASIA',4355)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Italia','EUROPA',5675)
INTO paises(NOMBRE,CONTINENTE_P,poblacion)
VALUES('Kazajist�n','EUROPA',6567)
SELECT * FROM DUAL;

--UPDATE PAISES SET NOMBRE = 'M�xico' Where NOMBRE = 'PE�ANIETO';

INSERT ALL
INTO presidentes(NOMBRE,EDAD)
VALUES('PE�ANIETO',45)

INTO presidentes(NOMBRE,EDAD)
VALUES('Jimmy Carter',97)
INTO presidentes(NOMBRE,EDAD)
VALUES('Anastasio Bustamante',28)
INTO presidentes(NOMBRE,EDAD)
VALUES('Melchor M�zquiz',83)
INTO presidentes(NOMBRE,EDAD)
VALUES('Manuel G�mez Pedraza',33)
INTO presidentes(NOMBRE,EDAD)
VALUES('Valent�n G�mez Far�as',45)
INTO presidentes(NOMBRE,EDAD)
VALUES('Miguel Barrag�n',64)
INTO presidentes(NOMBRE,EDAD)
VALUES('Vlad�mir Putin',93)
INTO presidentes(NOMBRE,EDAD)
VALUES('Bor�s Yeltsin',23)
INTO presidentes(NOMBRE,EDAD)
VALUES('Dmitri Medv�dev',27)
SELECT * FROM DUAL;

