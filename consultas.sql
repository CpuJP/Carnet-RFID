SELECT * FROM carnet.estudiante;
insert into carnet.rfid_nfc values('12345678901357908642');
INSERT INTO carnet.personal_universidad VALUES ('1007668999', 'Cedula Ciudadania', '13579', '461220188', 'Martha', '', 'Carreño', '', 'mCarreño@hotmail.com', '312349099');
insert into carnet.estudiante values('Ciencias Agropecuarias', 'Ambiental', 'Facatativá', 8, '1774009874', '12345678901357908642');
insert into carnet.docentes values ('Encargo', 'Planta', 'Ciencias del Deporte', 'Soacha', '1003456946', '12345');
insert into carnet.administrativo values ('Secretaria Sistemas', 'Facatativá', '1007668827', '67890');
insert into carnet.egresado values ('Ingeniería', 'Sistemas y Computación', '2019-1', '1007668999', '13579');
insert into carnet.prestamos (nombre_objeto, inicio_prestamo, origen, id_persona, id_rfid_nfc) values ('Balón voleibol', '2022-04-01 20:27:40', 'Bienestar', '1007668974', '0987654321357908642');
insert into carnet.sala_computo values ('2022-04-01 20:27:40', '2022-04-01 20:27:40', '201', '3958398583975', '1003456946', '12345');
insert into carnet.laboratorio values ('2022-04-01 20:27:40', '2022-04-01 20:27:40', '1007668974', '0987654321357908642');
insert into carnet.autodiag (fiebre, fatiga, cabeza, tos, malestar, musculos, contacto_covid19, respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, ingresar_elementos, id_persona, id_rfid_nfc) values (0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36.7, 0, '1007668974', '0987654321357908642');
SHOW INDEXES FROM carnet.estudiante;
select id_persona, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, sede, facultad, sede, semestre, email, celular from carnet.personal_universidad, carnet.estudiante where personal_universidad.id_persona = estudiante.id_persona_estudiante;
SELECT codigo, carrera, primer_apellido, semestre FROM carnet.personal_universidad JOIN estudiante ON personal_universidad.id_persona = estudiante.id_persona_estudiante;
select codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, ingreso, salida from carnet.personal_universidad join laboratorio on personal_universidad.id_persona = laboratorio.id_persona;
SELECT * FROM carnet.personal_universidad JOIN estudiante USING(id_persona);/*para usar 'using' deben tener el mismo nombre de variables*/
select codigo, primer_nombre, primer_apellido, ingreso, salida from carnet.personal_universidad join laboratorio on personal_universidad.id_persona = laboratorio.id_persona;
