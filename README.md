# sistema-de-analise-de-credito
Durante a criação desse app pude aplicar varios conceitos que 
aprendi no bootcamp e aprendi mais outros também. Sei que esse 
app está ainda longe do ideal, mas tentei deixar mais proximo 
do que imaginei. Aprendi com um certo grau de conforto JPA, Mysql,
a ligação do BD com o App e CRUD.

### Criei um banco de dados no mysql chamado de bancocliente:

* CREATE DATABASE bancocliente;

* USE bancocliente;

* CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `rg` varchar(45) DEFAULT NULL,
  `endereco` varchar(60) DEFAULT NULL,
  `renda` double DEFAULT NULL,
  `senha` int(11) NOT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `id_UNIQUE` (`id_cliente`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1

* CREATE TABLE `emprestimos` (
  `id_emprestimo` int(11) NOT NULL AUTO_INCREMENT,
  `valor` double NOT NULL,
  `parcelas` int(11) NOT NULL,
  `dia` int(11) NOT NULL,
  `fk_id_solicitante` int(11) NOT NULL,
  PRIMARY KEY (`id_emprestimo`),
  KEY `fk_id_solicitante` (`fk_id_solicitante`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1

### O JPA - ligação do App com o Banco de dados usando o "persistence.xml" , pasta META-INF.
