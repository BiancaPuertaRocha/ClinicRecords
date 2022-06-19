
drop database clr;
create database clr;
use clr;
create table setor(
	codigo int auto_increment primary key,
    descricao varchar(50),
    observacao varchar(200)
);
CREATE TABLE  pessoa (
  codigo INT(11) NOT NULL AUTO_INCREMENT,
  `TYPE` VARCHAR(20) NULL DEFAULT NULL,
    cpf				varchar(11),
    rg 				varchar(9),
    nome 			varchar(20),
    cidade	 		varchar(50),
    endereco 		varchar(100),
    uf 				varchar(2),
    email 			varchar(50),
	telefone 		varchar(11),
    bairro			varchar(50),
	sexo 			varchar(10),
	datanasc 		date,
	cartsus 		varchar(20),
	nomemae 		varchar(50),
    nomepai 		varchar(50),
	estcivil 		varchar(15),
	profissao 		varchar(20),
    datacad 		date,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE  funcionario (
	codigo			int NOT NULL,
   nomeuser 		varchar(10),
    senha 			varchar(200),
    setor	 		int,
    tipo 			boolean,
  PRIMARY KEY (codigo),
  INDEX `FK_funcionario_setor` (setor ASC),
  CONSTRAINT `FK_funcionario_codigo`
    FOREIGN KEY (codigo)
    REFERENCES pessoa (codigo),
  CONSTRAINT `FK_funcionario_setor`
    FOREIGN KEY (setor)
    REFERENCES setor (CODIGO))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
CREATE TABLE medico (
	codigo 			int  NOT NULL,
    nomeuser 		varchar(10),
    senha 			varchar(200),
    crm 			varchar(50),
	maxatendi 		int,
    especialidade 	varchar(50),
      PRIMARY KEY (codigo),
  CONSTRAINT `FK_medico_codigo`
	FOREIGN KEY (codigo)
    REFERENCES pessoa(codigo))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


create table tipoatend(
	codigo 			int auto_increment primary key,
    descricao 		varchar(50),
    observacao 		varchar(200)
);


create table fichaAtend(
	codigo 			int auto_increment primary key,
    funcionario 	int,
    dataatend		date,
    tipoatend 		int,
    paciente 		int,
    numeroordem 	int,
    atendmed 		boolean,
    foreign key (funcionario) references funcionario(codigo),
    foreign key (tipoatend) references tipoatend(codigo),
    foreign key (paciente) references pessoa(codigo)
);
create table preConsulta(
	codigo   		int auto_increment primary key,
    peso 			double,
    altura 			double,
    idade 			int,
    sistolica		int,
    diastolica		int,
    funcionario 	int,
    medico 			int,
    fichaatend 		int,
    dataPrec		date,
    foreign key (funcionario) references funcionario(codigo),
    foreign key (medico) references medico(codigo),
    foreign key (fichaatend) references fichaAtend(codigo)
);
create table consulta(
	codigo 			int auto_increment primary key,
    preconsulta 	int,
    diagnostico 	varchar(500),
    observacoes 	varchar(500),
    foreign key (preconsulta) references preconsulta(codigo)
);
create table receita(
	codigo 			int auto_increment primary key,
    quantidade 		int, 
    dosagem 		varchar(30),
    consulta 		int,
	foreign key (consulta) references consulta(codigo)
    
);

create table exame(
	codigo 			int auto_increment primary key,
    descricao 		varchar(100),
	consulta 		int,
	observacoes 	varchar(500),
	foreign key (consulta) references consulta(codigo)
);