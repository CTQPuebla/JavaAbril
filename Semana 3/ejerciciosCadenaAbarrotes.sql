CREATE TABLE proveedor (
    idproveedor  NUMBER PRIMARY KEY,
    razon_social NVARCHAR2(30),
    telefono     NUMBER(10),
    correo       NVARCHAR2(50)
);

CREATE TABLE categorias (
    idcategoria NUMBER PRIMARY KEY,
    nombre      NVARCHAR2(50)
);

CREATE TABLE detalle_categoria (
    iddetalle_categoria NUMBER PRIMARY KEY,
    idcategoria         NUMBER(3),
    nombre_producto     NVARCHAR2(30)
);

CREATE TABLE inventario (
    idinventario    NUMBER PRIMARY KEY,
    cantidad_prod   NUMBER(10),
    fecha_resurtido DATE,
    idventas        NUMBER(3)
);

CREATE TABLE productos (
    idproducto   NUMBER PRIMARY KEY,
    nombre       NVARCHAR2(30),
    precio       NUMBER(4),
    marca        NVARCHAR2(30),
    presentacion NVARCHAR2(50),
    idproveedor  NUMBER(3),
    idcategoria  NUMBER(3),
    idinventario NUMBER(3)
);

CREATE TABLE ventas (
    idventas    NUMBER PRIMARY KEY,
    idproducto  NUMBER(3),
    cantidad    NUMBER(5),
    fecha_venta DATE
);

--CREAR LLAVE FORANEA
ALTER TABLE inventario
    ADD CONSTRAINT fkidventas FOREIGN KEY ( idventas )
        REFERENCES ventas ( idventas );

ALTER TABLE productos
    ADD CONSTRAINT fkidproveedor FOREIGN KEY ( idproveedor )
        REFERENCES proveedor ( idproveedor );

ALTER TABLE productos
    ADD CONSTRAINT fkidcategoria FOREIGN KEY ( idcategoria )
        REFERENCES categorias ( idcategoria );

ALTER TABLE productos
    ADD CONSTRAINT fkidinventario FOREIGN KEY ( idinventario )
        REFERENCES inventario ( idinventario );
        
ALTER TABLE ventas
    ADD CONSTRAINT fkidproducto FOREIGN KEY ( idproducto )
        REFERENCES productos ( idproducto );
        
ALTER TABLE detalle_categoria
    ADD CONSTRAINT fkidcategoria FOREIGN KEY ( idcategoria )
        REFERENCES categorias ( idcategoria );

Describe proveedor;
Describe categorias;
Describe detalle_categoria;
Describe inventario;
Describe productos;
Describe ventas;
select * from proveedor;
select * from categorias;
select * from detalle_categoria;
select * from inventario;
select * from productos;
select * from ventas;

CREATE SEQUENCE proveedor_SEQ;
CREATE SEQUENCE categorias_SEQ;
CREATE SEQUENCE detalle_categoria_SEQ;
CREATE SEQUENCE inventario_SEQ;
CREATE SEQUENCE productos_SEQ;
CREATE SEQUENCE ventas_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_proveedor BEFORE
INSERT ON proveedor FOR EACH ROW BEGIN
SELECT proveedor_SEQ.NEXTVAL INTO :new.idproveedor FROM dual;
END;

CREATE OR REPLACE TRIGGER ON_INSERT_categorias BEFORE
INSERT ON categorias FOR EACH ROW BEGIN
SELECT categorias_SEQ.NEXTVAL INTO :new.idcategoria FROM dual;
END;

CREATE OR REPLACE TRIGGER ON_INSERT_detalle_categoria BEFORE
INSERT ON detalle_categoria FOR EACH ROW BEGIN
SELECT detalle_categoria_SEQ.NEXTVAL INTO :new.iddetalle_categoria FROM dual;
END;

CREATE OR REPLACE TRIGGER ON_INSERT_inventario BEFORE
INSERT ON inventario FOR EACH ROW BEGIN
SELECT inventario_SEQ.NEXTVAL INTO :new.idinventario FROM dual;
END;

CREATE OR REPLACE TRIGGER ON_INSERT_productos BEFORE
INSERT ON productos FOR EACH ROW BEGIN
SELECT productos_SEQ.NEXTVAL INTO :new.idproducto FROM dual;
END;

CREATE OR REPLACE TRIGGER ON_INSERT_ventas BEFORE
INSERT ON ventas FOR EACH ROW BEGIN
SELECT ventas_SEQ.NEXTVAL INTO :new.idventas FROM dual;
END;

INSERT ALL
INTO proveedor(razon_social,telefono,correo)
VALUES('Julieto SA de CV',4751037493,'julieto53@gmail.com')
INTO proveedor(razon_social,telefono,correo)
VALUES('Javiersin SA de CV',651037456,'javiersin59@protonmail.com')
INTO proveedor(razon_social,telefono,correo)
VALUES('Romeosss SA de CV',7251037472,'romeosss8765@gmail.com')
INTO proveedor(razon_social,telefono,correo)
VALUES('Tinassss SA de CV',7451037464,'tinassss5@hotmail.com')
INTO proveedor(razon_social,telefono,correo)
VALUES('Samuel SA de CV',9951567488,'samuel@gmail.com')
SELECT * FROM DUAL;

INSERT ALL
INTO detalle_categoria(idcategoria,nombre_producto,cantidad_producto)
VALUES(2,'Lata de chiles',7)
INTO detalle_categoria(idcategoria,nombre_producto,cantidad_producto)
VALUES(1,'Jamón',3)
INTO detalle_categoria(idcategoria,nombre_producto,cantidad_producto)
VALUES(3,'Plumas',9)
INTO detalle_categoria(idcategoria,nombre_producto,cantidad_producto)
VALUES(5,'Smirnof',8)
INTO detalle_categoria(idcategoria,nombre_producto,cantidad_producto)
VALUES(4,'Sandia',8)
SELECT * FROM DUAL;

INSERT ALL
INTO inventario(cantidad_prod,fecha_resurtido,idventas)
VALUES(88,'12/11/2021',343)
INTO inventario(cantidad_prod,fecha_resurtido,idventas)
VALUES(22,'15/12/2021',4334)
INTO inventario(cantidad_prod,fecha_resurtido,idventas)
VALUES(12,'18/01/2022',3443)
INTO inventario(cantidad_prod,fecha_resurtido,idventas)
VALUES(23,'21/02/2022',3443)
INTO inventario(cantidad_prod,fecha_resurtido,idventas)
VALUES(15,'17/06/2021',7567)
SELECT * FROM DUAL;

INSERT ALL
INTO ventas(idproducto,cantidad,fecha_venta)
VALUES(1,5,'12/11/2021')
INTO ventas(idproducto,cantidad,fecha_venta)
VALUES(2,10,'12/11/2021')
INTO ventas(idproducto,cantidad,fecha_venta)
VALUES(3,7,'12/11/2021')
INTO ventas(idproducto,cantidad,fecha_venta)
VALUES(4,9,'12/11/2021')
INTO ventas(idproducto,cantidad,fecha_venta)
VALUES(5,8,'12/11/2021')
SELECT * FROM DUAL;


--DROP TABLE categorias;

--Alter table categorias drop column bebidas_alcoholicas;

Alter table categorias add
nombre NVARCHAR2(50);
update categorias set nombre = 'carnes frias' where idcategoria = 1;
update categorias set nombre = 'abarrotes' where idcategoria = 2;
update categorias set nombre = 'Papeleria' where idcategoria = 3;
update categorias set nombre = 'Frutas' where idcategoria = 4;
update categorias set nombre = 'Verduras' where idcategoria = 5;
update categorias set nombre = 'Bebidas alcoholicas' where idcategoria = 5;


Alter table detalle_categoria add cantidad_Producto NVARCHAR2(50);