create schema carnet;
use carnet;

create table if not exists rfid_nfc (
id_carnet varchar(50) not null primary key
);

create table if not exists personal_universidad (
id_persona varchar(15) not null primary key,
tipo_id ENUM('Cedula Ciudadania', 'Tarjeta Identidad', 'Pasaporte', 'PEP', 'Visa'),
rfid_nfc_id_carnet varchar(50) not null,
foreign key (rfid_nfc_id_carnet) references rfid_nfc(id_carnet),
codigo varchar(15) not null,
unique key unique_codigo (codigo),
primer_nombre varchar(15) not null,
segundo_nombre varchar(15),
primer_apellido varchar(15) not null,
segundo_apellido varchar(15),
email varchar(100) not null,
unique key unique_email (email),
celular varchar(13) not null,
unique key unique_celular (celular)
);

create table if not exists autodiag (
id_autodiag int auto_increment primary key,
fiebre bit not null,
fatiga bit not null,
cabeza bit not null,
tos bit not null,
malestar bit not null,
musculos bit not null,
contacto_covid19 bit not null,
respiracion bit not null,
pecho bit not null,
nariz bit not null,
garganta bit not null,
olores bit not null,
diarrea bit not null,
temperatura decimal,
ingresar_elementos bit not null,
bicicleta bit,
carro bit,
moto bit,
portatil bit,
id_persona varchar(15) not null,
foreign key (id_persona) references personal_universidad(id_persona),
id_rfid_nfc varchar(50) not null,
foreign key (id_rfid_nfc) references rfid_nfc(id_carnet)
);

create table if not exists estudiante (
facultad ENUM('Ingeniería', 'Ciencias Administrativas', 'Ciencias Agropecuarias', 'Ciencias del Deporte', 'Educación', 'Ciencias de la Salud', 'Ciencias Sociales') not null,
carrera ENUM('Admin Empresas', 'Contaduría Pública', 'Gestión Turística', 'Agrónoma', 'Ambiental', 'Zootecnia', 'Educación Física', 'Ciencias Sociales', 'Electrónica', 'Industrial', 'Sistemas y Computación', 'Sistemas', 'Software', 'Enfermería', 'Música', 'Psicología') not null,
sede ENUM('Fusagasugá', 'Facatativá', 'Girardot', 'Soacha', 'Ubaté', 'Zipaquirá', 'Chía', 'Bogotá') not null,
semestre int not null,
id_persona_estudiante varchar(15) not null,
unique key unique_id_persona_estudiante(id_persona_estudiante),
foreign key (id_persona_estudiante) references personal_universidad(id_persona),
id_rfid_nfc_estudiante varchar(50) not null,
unique key unique_id_rfid_nfc_estudiante(id_rfid_nfc_estudiante),
foreign key (id_rfid_nfc_estudiante) references rfid_nfc(id_carnet)
);

create table if not exists docentes (
tipo ENUM('Encargo', 'Propio') not null,
cargo ENUM('Catedra', 'Planta') not null,
facultad ENUM('Ingeniería', 'Ciencias Administrativas', 'Ciencias Agropecuarias', 'Ciencias del Deporte', 'Educación', 'Ciencias de la Salud', 'Ciencias Sociales') not null,
sede ENUM('Fusagasugá', 'Facatativá', 'Girardot', 'Soacha', 'Ubaté', 'Zipaquirá', 'Chía', 'Bogotá') not null,
id_persona_docente varchar(15) not null,
unique key unique_id_persona_docente(id_persona_docente),
foreign key (id_persona_docente) references personal_universidad(id_persona),
id_rfid_nfc_docente varchar(50) not null,
unique key unique_id_rfid_nfc_docente(id_rfid_nfc_docente),
foreign key (id_rfid_nfc_docente) references rfid_nfc(id_carnet)
);

create table if not exists administrativo (
cargo varchar(45) not null,
sede ENUM('Fusagasugá', 'Facatativá', 'Girardot', 'Soacha', 'Ubaté', 'Zipaquirá', 'Chía', 'Bogotá') not null,
id_persona_administrativo varchar(15) not null,
unique key unique_id_persona_administrativo(id_persona_administrativo),
foreign key (id_persona_administrativo) references personal_universidad(id_persona),
id_rfid_nfc_administrativo varchar(50) not null,
unique key unique_id_rfid_nfc_administrativo(id_rfid_nfc_administrativo),
foreign key (id_rfid_nfc_administrativo) references rfid_nfc(id_carnet)
);

create table if not exists egresado (
facultad ENUM('Ingeniería', 'Ciencias Administrativas', 'Ciencias Agropecuarias', 'Ciencias del Deporte', 'Educación', 'Ciencias de la Salud', 'Ciencias Sociales') not null,
carrera ENUM('Admin Empresas', 'Contaduría Pública', 'Gestión Turística', 'Agrónoma', 'Ambiental', 'Zootecnia', 'Educación Física', 'Ciencias Sociales', 'Electrónica', 'Industrial', 'Sistemas y Computación', 'Sistemas', 'Software', 'Enfermería', 'Música', 'Psicología') not null,
ano_prom varchar(8) not null,
id_persona_egresado varchar(15) not null,
unique key unique_id_persona_egresado(id_persona_egresado),
foreign key (id_persona_egresado) references personal_universidad(id_persona),
id_rfid_nfc_egresado varchar(50) not null,
unique key unique_id_rfid_nfc_egresado(id_rfid_nfc_egresado),
foreign key (id_rfid_nfc_egresado) references rfid_nfc(id_carnet)
);

create table if not exists prestamos (
id_prestamo int auto_increment primary key,
nombre_objeto varchar(50) not null,
inicio_prestamo datetime,
final_prestamo datetime,
origen ENUM('Bienestar', 'Biblioteca', 'Sala de Computo') not null,
id_persona varchar(15) not null,
foreign key (id_persona) references personal_universidad(id_persona),
id_rfid_nfc varchar(50) not null,
foreign key (id_rfid_nfc) references rfid_nfc(id_carnet)
);

create table if not exists laboratorio (
ingreso datetime,
salida datetime,
id_persona varchar(15) not null,
foreign key (id_persona) references personal_universidad(id_persona),
id_rfid_nfc varchar(50) not null,
foreign key (id_rfid_nfc) references rfid_nfc(id_carnet)
);

create table if not exists sala_computo (
ingreso datetime,
salida datetime,
sala_ingreso varchar(5) not null,
pc_uso varchar(50) not null,
id_persona varchar(15) not null,
foreign key (id_persona) references personal_universidad(id_persona),
id_rfid_nfc varchar(50) not null,
foreign key (id_rfid_nfc) references rfid_nfc(id_carnet)
);