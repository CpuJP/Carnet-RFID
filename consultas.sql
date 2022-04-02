SELECT * FROM carnet.estudiante;
insert into carnet.estudiante values('Ingeniería', 'Sistemas y Computación', 'Facatativá', 5, '1007668974', '0987654321357908642');
select id_persona, codigo, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, sede, facultad, sede, semestre, email, celular from carnet.personal_universidad, carnet.estudiante where personal_universidad.id_persona = estudiante.id_persona_estudiante;
SELECT * FROM carnet.personal_universidad JOIN estudiante ON personal_universidad.id_persona = estudiante.id_persona_estudiante;
SELECT * FROM carnet.personal_universidad JOIN estudiante USING(id_persona);/*para usar using deben tener el mismo nombre de variables*/

