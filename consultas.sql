SELECT * FROM carnet.estudiante;

insert into carnet.rfid_nfc values('12345678901357908642');
INSERT INTO carnet.personal_universidad VALUES ('1007668974', 'Cedula Ciudadania', '12345678901357908642', '461220134', 'Juan', 'Pablo', 'Giraldo', 'Collazos', 'jpablogiraldo@ucundinamarca.edu.co', '3504896793');
insert into carnet.estudiante values('Ciencias Agropecuarias', 'Ambiental', 'Facatativá', 8, '1774009874', '12345678901357908642');
insert into carnet.docentes values ('Encargo', 'Planta', 'Ciencias del Deporte', 'Soacha', '1007668974', '12345678901357908642');
insert into carnet.administrativo values ('Secretaria Sistemas', 'Facatativá', '1007668974', '12345678901357908642');
insert into carnet.egresado values ('Ingeniería', 'Sistemas y Computación', '2019-1', '1007668974', '12345678901357908642');
insert into carnet.prestamos (nombre_objeto, inicio_prestamo, origen, id_persona, id_rfid_nfc) values ('Balón voleibol', '2022-04-01 20:27:40', 'Bienestar', '1007668974', '0987654321357908642');
insert into carnet.sala_computo values ('2022-04-01 20:27:40', '2022-04-01 20:27:40', '201', '3958398583975', '1003456946', '12345');
insert into carnet.laboratorio values ('2022-04-01 20:27:40', '2022-04-01 20:27:40', '1007668974', '0987654321357908642');
insert into carnet.autodiag (fiebre, fatiga, cabeza, tos, malestar, musculos, contacto_covid19, respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, ingresar_elementos, bicicleta, carro, moto, portatil, id_persona, id_rfid_nfc) values (0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36.7, 0, 0, 0, 0, 0, '1007668974', '12345678901357908642');
select * from autodiag;

SHOW INDEXES FROM carnet.administrativo;

select id_persona, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, sede, facultad, sede, semestre, email, celular from carnet.personal_universidad, carnet.estudiante where personal_universidad.id_persona = estudiante.id_persona_estudiante;
SELECT codigo, carrera, primer_apellido, semestre FROM carnet.personal_universidad JOIN estudiante ON personal_universidad.id_persona = estudiante.id_persona_estudiante;
select codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, ingreso, salida from carnet.personal_universidad join laboratorio on personal_universidad.id_persona = laboratorio.id_persona;
SELECT * FROM carnet.personal_universidad JOIN estudiante USING(id_persona);/*para usar 'using' deben tener el mismo nombre de variables*/
select codigo, primer_nombre, primer_apellido, ingreso, salida from carnet.personal_universidad join laboratorio on personal_universidad.id_persona = laboratorio.id_persona;
select id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, cargo, sede from carnet.personal_universidad, carnet.administrativo where personal_universidad.id_persona = administrativo.id_persona_administrativo and administrativo.id_persona_administrativo = '1007668974' or administrativo.id_rfid_nfc_administrativo = '12345678901357908642';
select id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, cargo, sede from carnet.personal_universidad, carnet.administrativo where personal_universidad.id_persona = administrativo.id_persona_administrativo;
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, cargo, sede FROM carnet.personal_universidad, carnet.administrativo WHERE personal_universidad.id_persona = administrativo.id_persona_administrativo AND administrativo.id_persona_administrativo = '1007668975';
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, facultad, carrera, ano_prom from carnet.egresado, carnet.personal_universidad where egresado.id_persona_egresado = personal_universidad.id_persona and egresado.id_persona_egresado = '1007668975';
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, facultad, carrera, ano_prom from carnet.egresado, carnet.personal_universidad where egresado.id_persona_egresado = personal_universidad.id_persona;

select * from carnet.egresado;
select fiebre, fatiga, cabeza, tos, malestar, musculos, contacto_covid19, respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, ingresar_elementos, bicicleta, carro, moto, portatil, id_rfid_nfc from carnet.autodiag, carnet.personal_universidad where autodiag.id_persona = personal_universidad.id_persona and autodiag.id_persona = '1007668974';
select * from carnet.autodiag;
SELECT * FROM egresado;
UPDATE administrativo SET cargo='Auxiliar de sistemas', sede = 'Soacha' WHERE id_persona_administrativo = '1007668974';
update carnet.docentes set tipo='Propio', cargo='Catedra', facultad='Ingeniería', sede='Facatativá' where id_persona_docente='1007668974';
UPDATE egresado set facultad='Ciencias Agropecuarias', carrera='Agrónoma', ano_prom='2022-2' WHERE id_persona_egresado = '1007668974';
DELETE FROM administrativo WHERE id_persona_administrativo ='1007668974';
use carnet;
DELETE FROM docentes WHERE id_persona_docente ='1007668974';
DELETE FROM egresado WHERE id_persona_egresado='1007668974';
select * from carnet.docentes;
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, tipo, cargo, facultad, sede from carnet.docentes, carnet.personal_universidad where docentes.id_persona_docente = personal_universidad.id_persona and docentes.id_persona_docente = '1007668974';
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, tipo, cargo, facultad, sede from carnet.docentes, carnet.personal_universidad where docentes.id_persona_docente = personal_universidad.id_persona;
