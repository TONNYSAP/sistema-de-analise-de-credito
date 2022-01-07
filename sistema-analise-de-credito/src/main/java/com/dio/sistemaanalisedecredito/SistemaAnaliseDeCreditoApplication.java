package com.dio.sistemaanalisedecredito;


//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import java.util.Scanner;
import controle.controleBD;
import emprestimo.clientesolicitaemprestimo;
import emprestimo.metodosemprestimo;
//import emprestimo.solicitaremprestimo;
import login.usuario;
import model.emprestimo;


@SpringBootApplication
public class SistemaAnaliseDeCreditoApplication {

		
		public static void main(String[] args) {		
		//SpringApplication.run(SistemaAnaliseDeCreditoApplication.class, args);
			
			/****LOGIN****/
		usuario usuario = new usuario();
		usuario.LoginUsuario(4, "alexgonzales@gmail.com", 9999);
			
	/////////////////////////////////////////////////////////////////////////////////////////////////////		
			/****Cadastrar Cliente****/
//		controleBD control = new controleBD();
//		control.CadastroCliente("Anna Petrov", "annakaty@hotmail.com", "111.222.111-16", "4443218", "rua napolis, n. 872", 4590.00, 6789);
			
			/****Remover Cliente****/
//		controleBD control = new controleBD();
//		control.DeletarCliente(7);
			
			/****Atualizar Cliente****/
//		controleBD control = new controleBD();
//		control.AtualizarCliente(6, "Anna Petrov", "annapetrov123@hotmail.com", "111.222.111-16", "4443218", "rua napolis, n. 872", 6500.00, 3456);

			/**** Dados - Cliente - Id****/
//		controleBD controlebd = new controleBD();
//		controlebd.DadosCliente(6);
		
	//////////////////////////////////////////////////////////////////////////////////////////////////////		
			/****Solicitar Emprestimos****/		
//		clientesolicitaemprestimo cse = new clientesolicitaemprestimo();
//		cse.Questions();
			
		/****Listar Todos os Emprestimos****/
//		metodosemprestimo metEmp = new metodosemprestimo();
//		System.out.println(metEmp.findAll());
		
			/****Dados da Solicitações - Id****/
//		metodosemprestimo metEmp = new metodosemprestimo();
		/////metEmp.listagem2(4)-codigo do cliente(id_cliente) ///metEmp.listagem2(5) e metEmp.listagem3(5) - codigo da solicitação(id_emprestimo)
//		System.out.println(metEmp.listagem(5) + " | emprestimo de (total) R$" + metEmp.listagem2(2) + " - " + metEmp.listagem3(2) + " parcelas");
		
	}

}
