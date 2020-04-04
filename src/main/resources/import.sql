INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('gino','$2a$10$cdJQ.cxI2gXagDFzmBSLr.0V5C2tzgeHeUQz.tyytLJKanwED.a1u',true,'Gino','Fernandez','gino@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$27xSxMrjhqPZDybJgB5mGeInkhYNDTHn/2CXAcZ0o0yztug0K7cqe',true,'Jaime','Miranda','jaime@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);