create database banco;

use banco;

create table cliente(
    numero int,
    nombre varchar(100),
    apellido_paterno varchar(100),
    apellido_materno varchar(100),
    telefono	varchar(10),
    celular	varchar(10),
    domicilio varchar(255),
    rfc varchar(13),
    primary key (numero)

);

create table cuenta(
    numero int,
    tipo int(1),
    fecha_apertura date,
    capacidad double,
    cliente int,
    primary key (numero),
    index cliente_idx (cliente asc),
    constraint cliente_idx
    foreign key (cliente) references cliente(numero)
        on delete no action 
        on update cascade

);

create table tarjeta(
    numero int(16),
    nip varchar(20),
    fecha_vencimiento date,
    cuenta int,
    primary key (numero),
    index cuenta_idx (cuenta asc),
    constraint cuenta_idx
    foreign key (cuenta) references cuenta(numero)
        on delete no action 
        on update cascade

);

create table movimiento(
    numero int,
    fecha date,
    hora time,
    tipo int(1),
    catidad double,
    tarjeta int(16),
    primary key (numero),
    index tarjeta_idx (tarjeta asc),
    constraint tarjeta_idx
    foreign key (tarjeta) references tarjeta(numero)
        on delete no action 
        on update cascade
);