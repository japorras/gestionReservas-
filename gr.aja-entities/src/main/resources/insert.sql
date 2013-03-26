INSERT INTO COMPANY (ID, NAME, DESCRIPTION) VALUES (1, "PADDEL CLUB GRA", "Club de paddel de Valdemoro");
INSERT INTO COMPANY (ID, NAME, DESCRIPTION) VALUES (2, "DEPORTES HALCON", "Tienda de ropa deportiva");

INSERT INTO WORKER (ID, COMPANY_ID, NAME, SURNAME, WORKERTYPE) VALUES (1, 1, "Juan Pablo", "Perez Garcia", "dependiente");
INSERT INTO WORKER (ID, COMPANY_ID, NAME, SURNAME, WORKERTYPE) VALUES (2, 1, "Pedro", "Gimenez Sanchez", "Camarero");

INSERT INTO WORKER (ID, COMPANY_ID, NAME, SURNAME, WORKERTYPE) VALUES (3, 2, "Pablo", "Perez Garcia", "dependiente");
INSERT INTO WORKER (ID, COMPANY_ID, NAME, SURNAME, WORKERTYPE) VALUES (4, 2, "Carlos", "Pulido Sanchez", "Supervisor");

INSERT INTO ROLES (ID, ROLE) VALUES (1, "ROLE_ADMIN");
INSERT INTO ROLES (ID, ROLE) VALUES (2, "ROLE_USER");	

INSERT INTO PERSONA (nombreUsuario, password, nombre, apellidos, direccion, codPostal, poblacion, provincia, ROLE_id)
	VALUES ("japorras", "2dd051e0bce217e5d22cf8afd71fb52860230a1af803d7bd10518ee1cb3c5bc0b483b560156d3b77", 
	"Jose Antonio", "Porras Sanchez", "C/Huerta del Peral nº4", "28991", "Torrejon de la Calzada", "Madrid", 1);
INSERT INTO PERSONA (nombreUsuario, password, nombre, apellidos, direccion, codPostal, poblacion, provincia, ROLE_id)
	VALUES ("dgarcia", "239e0492734c5e9af9e7b6c7208eaa643b6aeb683b8ef626bc8093bebe37ab2d74afde3e9dbbd16e", 
	"David", "Garcia Gomez", "C/ Maria Tubau nº10", "28050", "Madrid", "Madrid", 2);	
	

	
	