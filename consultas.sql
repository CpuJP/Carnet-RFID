SELECT * FROM carnet.estudiante;
insert into carnet.rfid_nfc values('12345678901357908642');
insert into carnet.estudiante values('Ciencias Agropecuarias', 'Ambiental', 'Facatativá', 8, '1774009874', '12345678901357908642');
INSERT INTO carnet.personal_universidad VALUES ('1003456946', 'Cedula Ciudadania', '12345', '461220136', 'Cristhian', 'Fernando', 'Monetejo', 'Martínez', 'crismontejo@ucundinamarca.edu.co', '312349075');
insert into carnet.rfid_nfc values('0987654321357908642');
select id_persona, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, sede, facultad, sede, semestre, email, celular from carnet.personal_universidad, carnet.estudiante where personal_universidad.id_persona = estudiante.id_persona_estudiante;
SELECT codigo, carrera, primer_apellido, semestre FROM carnet.personal_universidad JOIN estudiante ON personal_universidad.id_persona = estudiante.id_persona_estudiante;
select codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, ingreso, salida from carnet.personal_universidad join laboratorio on personal_universidad.id_persona = laboratorio.id_persona;
SELECT * FROM carnet.personal_universidad JOIN estudiante USING(id_persona);/*para usar 'using' deben tener el mismo nombre de variables*/
select codigo, primer_nombre, primer_apellido, ingreso, salida from carnet.personal_universidad join laboratorio on personal_universidad.id_persona = laboratorio.id_persona;


