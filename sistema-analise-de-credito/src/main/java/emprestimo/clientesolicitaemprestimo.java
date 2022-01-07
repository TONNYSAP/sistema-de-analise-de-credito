package emprestimo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.emprestimo;

public class clientesolicitaemprestimo {
	
	
	Scanner scann = new Scanner(System.in);
	
	public void Questions() {
		
		System.out.println("Qual o valor do emprestimo?");
		double valoremp = scann.nextDouble();
				
		System.out.println("Quantas parcelas?");
		int parcelasemp = scann.nextInt();		
				
		System.out.println("Data da solicitação do emprestimo: ");
		int dataemp = scann.nextInt();
		
		System.out.println("Código do solicitante: ");
		int idSolicitante = scann.nextInt();
		
		if(parcelasemp <= 60) {
			double resultado = valoremp / parcelasemp;
			System.out.println("As parcelas serão de R$" + resultado);
		}else {
			System.out.println("Número de parcelas incorreto");
		}
		
		if(dataemp > 15) {			
			int resultadoData = (dataemp + 15) - 30;
			System.out.println("A primeira parcela será paga contando 15 dias a partir da data de solicitação, ou seja, será dia " + resultadoData);
		}else if(dataemp <= 15) {
			int resultadoData2 = (dataemp + 15);
			System.out.println("A primeira parcela será paga contando 15 dias a partir da data de solicitação, ou seja, será dia " + resultadoData2);
		}
		
		System.out.println("Deseja Salvar a solicitação? S ou N");
		String resposta = scann.next();
		if(resposta.equalsIgnoreCase("S")) {
			Save(idSolicitante, dataemp, parcelasemp, valoremp);	
		}else {
			System.out.println("Solicitação cancelada!");
		}
	}
	
	private static EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDcliente");
	private static EntityManager manager = managerFactory.createEntityManager();
	
	public void Save(int Id, int Dia, int Parcela, double Valor) {
		emprestimo emprestimo = new emprestimo();
		/////emprestimo.setId(1);
		emprestimo.setDia(Dia);
		emprestimo.setParcelas(Parcela);
		emprestimo.setValor(Valor);
		emprestimo.setFk_id_solicitante(Id);
		manager.getTransaction().begin();
		manager.persist(emprestimo);
		manager.getTransaction().commit();
		
		/////solicitaremprestimo soliemprest = new solicitaremprestimo();
		/////soliemprest.main(null);
		System.out.println("Salvo");
	}
}
