drop database if exists clr;
create database clr;
use clr;
create table setor(
	codigo int auto_increment primary key,
    descricao varchar(50),
    observacao varchar(100)
);
CREATE TABLE  pessoa (
  codigo INT(11) NOT NULL AUTO_INCREMENT,
  `TYPE` VARCHAR(20) NULL DEFAULT NULL,
    cpf				varchar(15),
    rg 				varchar(12),
    nome 			varchar(50),
    cidade	 		varchar(30),
    endereco 		varchar(100),
    uf 				varchar(2),
    email 			varchar(50),
	telefone 		varchar(14),
    bairro			varchar(50),
	sexo 			varchar(10),
	datanasc 		date,
	cartsus 		varchar(20),
	nomemae 		varchar(50),
    nomepai 		varchar(50),
	estcivil 		varchar(15),
	profissao 		varchar(40),
	tiposang		varchar (4),
    datacad 		date,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE  funcionario (
	codigo			int NOT NULL,
   nomeuser 		varchar(10),
    senha 			varchar(20),
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
    senha 			varchar(20),
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
    observacao 		varchar(100)
);


create table fichaAtend(
	codigo 			int auto_increment primary key,
    funcionario 	int,
    dataatend		date,
    tipoatend 		int,
    paciente 		int,
    numeroordem 	int,
    atendmed 		boolean,
    situacao		boolean,
    dataregistro	datetime,
    
    
    foreign key (funcionario) references pessoa(codigo),
    foreign key (tipoatend) references tipoatend(codigo),
    foreign key (paciente) references pessoa(codigo)
);
create table preConsulta(
	codigo   		int auto_increment primary key,
    peso 			double,
    altura 			double,
    sistolica		int,
    diastolica		int,
    funcionario 	int,
    medico 			int,
    fichaatend 		int,
    dataPrec		datetime,
    situacao		boolean,
	numeroordem		int,
	temperatura		varchar(4),
    foreign key (funcionario) references funcionario(codigo),
    foreign key (medico) references medico(codigo),
    foreign key (fichaatend) references fichaAtend(codigo)
);
create table consulta(
	codigo 			int auto_increment primary key,
    preconsulta 	int,
    diagnostico 	varchar(500),
    observacoes 	varchar(500),
    dataConsul		datetime,
    situacao		boolean,
    foreign key (preconsulta) references preconsulta(codigo)
);
create table medicamento(
	codigo			int auto_increment primary key,
    descricao		varchar(50),
    concentracao	double,
    unidade			varchar(3)
);
create table itemdereceita(
	codigo 			int auto_increment primary key,
	medicamento		int,
    periodicidade	varchar(20),
    dosagem 		varchar(30),
    consulta 		int,
    
    foreign key (consulta) references consulta(codigo),
	foreign key (medicamento) references medicamento(codigo)
);
create table exame(
	codigo 			int auto_increment primary key,
    descricao 		varchar(100),
	observacoes 	varchar(200)
);
create table itemdeexame(
	codigo 			int auto_increment primary key,
    exame 			int,
    consulta 		int,
    
    foreign key (consulta) references consulta(codigo),
    foreign key (exame) references exame(codigo)
);

insert into setor (descricao, observacao) values ("Farmácia","Setor de entrega de medicamentos aos pacientes a partir de uma receita."), 
("Recursos Humanos","Setor de administração de pessoas"),
("Agendamento","Setor de agendamento de consultas ou atendimentos"),
("Pré-Consulta","Setor que realiza as pré-consultas anteriormente à consulta");
INSERT INTO `clr`.`pessoa`
(
`TYPE`,
`cpf`,
`rg`,
`nome`,
`cidade`,
`endereco`,
`uf`,
`email`,
`telefone`,
`bairro`,
`sexo`,
`datanasc`,
`cartsus`,
`nomemae`,
`nomepai`,
`estcivil`,
`profissao`,
`datacad`,`tiposang` )
VALUES
("FUNCIONARIO",
"44558962147",
"111111111",
"Bianca Puerta Rocha",
 "Presidente Epitácio",
"Rua das Lamentações 5-98",
"SP",
"mariazinhahtinha@125.com",
"1832817888",
"Jardim Real",
 "Feminino",
"1999-03-02",
"25689514253",
"Floriana Peixoto Severina Alto",
"Marcos Alto",
"Casada",
"Técnica em Enfermagem",
"2017-05-07","AB+"),
("MEDICO",
"66589521455",
"333333333",
"Fiorella Valentina Rocha Muniz",
 "Presidente Epitácio",
"Juca Pita 12-17",
"SP",
"fiorvale@125.com",
"18325110778",
"Cruzeiro do Sul",
 "Feminino",
"1986-03-02",
"58889555",
"Bianca Puerta Rocha",
"Fulaninho de Tal Muniz",
"Solteira",
"Médica",
"2017-05-07", "A+"),
("MEDICO",
"69877723654",
"369888888",
"Daniel Marcelo Silva",
 "Presidente Epitácio",
"Av. Presidente Vargas 12-36",
"SP",
"danielsilva@125.com",
"18325393699",
"Centro",
 "Masculino",
"1990-03-02",
"58889555",
"Fernanda Souza Silva",
"Carlos Silveira Silva",
"Solteira",
"Médico",
"2017-05-07","B+"),
("MEDICO",
"22544788932",
"333222555",
"Fatima da Silva Puerta",
 "Presidente Epitácio",
"Minas Gerais 12-12",
"SP",
"fiorvale@125.com",
"18325191077",
"Cruzeiro do Sul",
 "Feminino",
"1977-01-04",
"58889555",
"Maria Silva de Oliveira",
"Augusto Puerta",
"Casada",
"Médica",
"2017-05-07", "O-"),
("PESSOA",
"67736985212",
"236589741",
"Bianca Puerta Rocha",
 "Presidente Epitácio",
"Juca Pita 12-17",
"SP",
"bibiarocha@125.com",
"1832511077",
"Cruzeiro do Sul",
 "Feminino",
"1970-03-02",
"56981233333",
"Fatima da Silva Puerta",
"Fabricio Duarte Rocha",
"Solteira",
"Professora",
"2017-05-07","AB-"),
("FUNCIONARIO",
"11478999877",
"744477885",
"Fabricio Duarte Rocha",
 "Presidente Epitácio",
"Rio de Janeiro 12-58",
"SP",
"fabriciotexas@125.com",
"18325110772",
"Campinal",
 "Feminino",
"1972-11-12",
"569812333",
"Maria de Lourdes Duarte Rocha",
"Antônio Riocha",
"Casado",
"Enfermeiro",
"2017-05-07","O-");
INSERT INTO `clr`.`medico`
(`codigo`,
`nomeuser`,
`senha`,
`crm`,
`maxatendi`,
`especialidade`)
VALUES
(2,
"fiorella",
"40028922",
"12589332",
20,
"Cardiologista"),
(3,
"daniel",
"40028922",
"55681133",
20,
"Clinico Geral"),
(4,
"fatima",
"40028922",
"3658999",
20,
"Ortopedista");
INSERT INTO `clr`.`funcionario`
(`codigo`,
`nomeuser`,
`senha`,
`setor`,
`tipo`)
VALUES
(1,
"bianca",
"40028622",
2,
true),
(6,
"fabricio",
"40028622",
3,
false);
INSERT INTO `clr`.`tipoatend`
(`descricao`,
`observacao`)
VALUES
("Retirada de Curativo",
"O serviço deverá ser executado por um funcionário/técnico"),
("Consulta médica",
"O serviço deverá ser executado por um médico"),
("Retorno",
"O serviço deverá ser executado por um médico"),
("Exame de Sangue",
"O serviço deverá ser executado por um funcionário/técnico da área da saúde");