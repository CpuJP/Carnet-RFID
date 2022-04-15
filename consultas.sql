SELECT * FROM carnet.estudiante;

insert into carnet.rfid_nfc values('12345678901357908642');
INSERT INTO carnet.personal_universidad VALUES ('1007668974', 'Cedula Ciudadania', '12345678901357908642', '461220134', 'Juan', 'Pablo', 'Giraldo', 'Collazos', '2000-10-08', 'Masculino', 'jpablogiraldo@ucundinamarca.edu.co', '3504896793');
insert into carnet.estudiante values('Ciencias Agropecuarias', 'Ambiental', 'Facatativá', 8, '1007668974', '12345678901357908642');
insert into carnet.docentes values ('Encargo', 'Planta', 'Ciencias del Deporte', 'Soacha', '1007668974', '12345678901357908642');
insert into carnet.administrativo values ('Secretaria Sistemas', 'Facatativá', '1007668974', '12345678901357908642');
insert into carnet.egresado values ('Ingeniería', 'Sistemas y Computación', '2019-1', '1007668974', '12345678901357908642');
insert into carnet.prestamos (nombre_objeto, inicio_prestamo, origen, id_persona, id_rfid_nfc) values ('Balón voleibol', '2022-04-01 20:27:40', 'Bienestar', '1007668974', '0987654321357908642');
insert into carnet.sala_computo values ('2022-04-01 20:27:40', '2022-04-01 20:27:40', '201', '3958398583975', '1003456946', '12345');
insert into carnet.laboratorio values ('2022-04-01 20:27:40', '2022-04-01 20:27:40', '1007668974', '12345678901357908642');
insert into carnet.autodiag (fiebre, fatiga, cabeza, tos, malestar, musculos, contacto_covid19, respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, ingresar_elementos, bicicleta, carro, moto, portatil, id_persona, id_rfid_nfc) values (0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36.7, 0, 0, 0, 0, 0, '1007668974', '12345678901357908642');
select * from autodiag;

SHOW INDEXES FROM carnet.personal_universidad;

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
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, facultad, carrera, sede, semestre from carnet.estudiante, carnet.personal_universidad where estudiante.id_persona_estudiante = personal_universidad.id_persona and estudiante.id_persona_estudiante = '100766897';

select * from carnet.egresado;
select fiebre, fatiga, cabeza, tos, malestar, musculos, contacto_covid19, respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, ingresar_elementos, bicicleta, carro, moto, portatil, id_rfid_nfc from carnet.autodiag, carnet.personal_universidad where autodiag.id_persona = personal_universidad.id_persona and autodiag.id_persona = '1007668974';
select * from carnet.autodiag;
SELECT * FROM egresado;
use carnet;
SELECT * FROM estudiante;
UPDATE administrativo SET cargo='Auxiliar de sistemas', sede = 'Soacha' WHERE id_persona_administrativo = '1007668974';
update docentes set tipo='Propio', cargo='Catedra', facultad='Ingeniería', sede='Facatativá' where id_persona_docente='1007668974';
UPDATE egresado set facultad='Ciencias Agropecuarias', carrera='Agrónoma', ano_prom='2022-2' WHERE id_persona_egresado = '1007668974';
UPDATE estudiante SET facultad='Ciencias del Deporte', carrera='Educación Física', sede='Soacha', semestre='6' WHERE id_persona_estudiante='1007668974';
UPDATE personal_universidad SET tipo_id ='Visa', primer_nombre='Carlos', segundo_nombre='Arturo', primer_apellido='Rodrigo', segundo_apellido='Perez', fecha_nacimiento='1999-11-27', genero='Intersexual', email='cpujuanpis@gmail.com', celular='3213212412' WHERE id_persona='1007668974';
use carnet;
DELETE FROM docentes WHERE id_persona_docente ='1007668974';
DELETE FROM egresado WHERE id_persona_egresado='1007668974';
DELETE FROM estudiante WHERE id_persona_estudiante='1007668974';
DELETE FROM administrativo WHERE id_persona_administrativo ='1007668974';
DELETE FROM laboratorio WHERE id_persona='1007668974';
DELETE FROM personal_Universidad WHERE id_persona='1007668974';


select * from carnet.docentes;
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, tipo, cargo, facultad, sede from carnet.docentes, carnet.personal_universidad where docentes.id_persona_docente = personal_universidad.id_persona and docentes.id_persona_docente = '1007668974';
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, tipo, cargo, facultad, sede from carnet.docentes, carnet.personal_universidad where docentes.id_persona_docente = personal_universidad.id_persona;
SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, email, celular, facultad, carrera, sede, semestre FROM estudiante, personal_universidad WHERE estudiante.id_persona_estudiante = personal_universidad.id_persona;
select * from estudiante, docentes, administrativo, egresado, personal_universidad where (personal_universidad.id_persona = estudiante.id_persona_estudiante and estudiante.id_persona_estudiante='1007668974') or (personal_universidad.id_persona = docentes.id_persona_docente and docentes.id_persona_docente='100766897') or (personal_universidad.id_persona = egresado.id_persona_egresado and egresado.id_persona_egresado='100766897') or (personal_universidad.id_persona = administrativo.id_persona_administrativo and administrativo.id_persona_administrativo='100766897');
select count(*) from laboratorio;
select * from docentes;
select * from laboratorio WHERE id_persona='1007668974' and ingreso or salida <'2022-04-17 00:00:00' order by ingreso;
select * from laboratorio WHERE id_persona='1007668974' order by ingreso asc;
select * from laboratorio order by ingreso desc;
insert into laboratorio values ('2022-04-14 18:42:00', null, '1007668974', '12345678901357908642');
insert into laboratorio values (null, '2022-04-18 20:42:00', '1007668974', '12345678901357908642');

SELECT * FROM personal_universidad WHERE id_persona = '1007668974';
SELECT * FROM personal_universidad;
ALTER table personal_universidad change column fecha_nacimineto fecha_nacimiento date;