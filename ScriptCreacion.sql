--SENTENCIAS DDL
CREATE TABLE Localidad(
    codlocalidad    number(5) PRIMARY KEY,
    nombre  varchar2(30)
);
CREATE TABLE EMPLEADO(
    dniempleado varchar2(10),
    nombre  varchar2(30),
    domicilio   varchar2(50)
);
CREATE TABLE PUB(
    cod_pub number(5) primary key,
    nombre  varchar2(30),
    licenciafiscal  varchar2(30),
    domicilio   varchar2(30),
    FECHAAPERTURA   varchar2(30),
    cod_localidad   number(5) REFERENCES Localidad
);
CREATE TABLE existencias (
    cod_articulo    number(5) primary key,
    nombre  varchar2(30),
    cantidad   number(4),
    precio  number(8,2),
    cod_pub number(5) REFERENCES PUB
);
CREATE TABLE Titular(
    dni_titular varchar2(10) PRIMARY KEY,
    nombre  varchar2(30),
    domicilio   varchar2(40),
    cod_pub number(5) REFERENCES PUB
);
CREATE TABLE PUB_EMPLEADOS (
    cod_pub number(5) REFERENCES PUB,
    dniempleado varchar2(10) REFERENCES EMPLEADO,
    funcion varchar2(30)
);

ALTER TABLE existencias ADD CONSTRAINT ck_precio
CHECK (precio > 0);

ALTER TABLE pub_empleado ADD CONSTRAINT ck_funcion
 CHECK (funcion IN ('CAMARERA', 'PORTERO', 'LIMPIEZA')) ;

ALTER TABLE pub_empleado ADD sueldo number(5,2);
ALTER TABLE pub_empleado MODIFY sueldo number(8,2);
ALTER TABLE pub_empleado DROP COLUMN sueldo;
--

--SENTENCIAS DML
INSERT INTO Localidad (codlocalidad,nombre) VALUES
(1,'Sevilla');
INSERT INTO Localidad (codlocalidad,nombre) VALUES
(2,'Madrid');
INSERT INTO Localidad (codlocalidad,nombre) VALUES
(3,'BARCELONA');

INSERT INTO EMPLEADO (dniempleado,nombre,domicilio )
VALUES ('12345678-X','Pepe','C/San Pedro');
INSERT INTO EMPLEADO (dniempleado,nombre,domicilio )
VALUES ('11545678-H','Loli','C/San Penelope');
INSERT INTO EMPLEADO (dniempleado,nombre,domicilio )
VALUES ('17564567-Z','JOCE','C/San Juan');
INSERT INTO EMPLEADO (dniempleado,nombre,domicilio )
VALUES ('75645627-Z','Carmen','C/San Anton');
INSERT INTO EMPLEADO (dniempleado,nombre,domicilio )
VALUES ('55564212-Z','Sonia','C/San Juan');
INSERT INTO EMPLEADO (dniempleado,nombre,domicilio )
VALUES ('57564478-D','Luis','C/San Chaparro');
INSERT INTO EMPLEADO (dniempleado,nombre,domicilio )
VALUES ('97564347-H','Pedro','C/San Damas');
INSERT INTO EMPLEADO (dniempleado,nombre,domicilio )
VALUES ('75863758-Q','Maria','C/San Bacalao');

INSERT into pub (cod_pub,nombre,licenciafiscal,domicilio,FECHAAPERTURA,codlocalidad)
VALUES (1,'Yuca','1231423232112X','C/Julio Verne',20000213000000,1);
INSERT into pub (cod_pub,nombre,licenciafiscal,domicilio,FECHAAPERTURA,codlocalidad)
VALUES (2,'Bambu','1651423232402D','Embarca',20010213000000,2);
INSERT into pub (cod_pub,nombre,licenciafiscal,domicilio,FECHAAPERTURA,codlocalidad)
VALUES (3,'ANSUFAM','1651465432402D','Little Spain',20010213000000,3);

INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (1231,'Fanta',12,1.60,1);
INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (1731,'CocaCola',17,1.80,1);
INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (1930,'Ron',16,6.60,1);


INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (0231,'Don Perignon',2,199.60,2);
INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (0731,'Mojito',17,0.80,2);
INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (0930,'Ginebra',46,12.60,2);


INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (1631,'Whisky',42,6.60,3);
INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (8761,'Nejar',87,8.80,3);
INSERT into existencias(cod_articulo,nombre,cantidad,precio,cod_pub)
VALUES (1560,'Mercader',96,12.60,3);

INSERT into Titular(dni_titular,nombre,domicilio,cod_pub)
VALUES ('232123345-L','Dani El Rojo',1);
INSERT into Titular(dni_titular,nombre,domicilio,cod_pub)
VALUES ('632164345-A','Coto Matamoros',2);
INSERT into Titular(dni_titular,nombre,domicilio,cod_pub)
VALUES ('465433450-J','Pipi Cazaslargas',3);

INSERT into PUB_EMPLEADOS(cod_pub,dniempleado,funcion)
VALUES (1,'12345678-X','PORTERO');
INSERT into PUB_EMPLEADOS(cod_pub,dniempleado,funcion)
VALUES (1,'11545678-H','CAMARERA');
INSERT into PUB_EMPLEADOS(cod_pub,dniempleado,funcion)
VALUES (1,'17564567-Z','LIMPIEZA');
INSERT into PUB_EMPLEADOS(cod_pub,dniempleado,funcion)
VALUES (2,'75645627-Z','CAMARERA');
INSERT into PUB_EMPLEADOS(cod_pub,dniempleado,funcion)
VALUES (2,'55564212-Z','LIMPIEZA');
INSERT into PUB_EMPLEADOS(cod_pub,dniempleado,funcion)
VALUES (2,'57564478-D','PORTERO');
INSERT into PUB_EMPLEADOS(cod_pub,dniempleado,funcion)
VALUES (3,'97564347-H','PORTERO');
INSERT into PUB_EMPLEADOS(cod_pub,dniempleado,funcion)
VALUES (3,'75863758-Q','CAMARERA');
--
--CONSULTAS
