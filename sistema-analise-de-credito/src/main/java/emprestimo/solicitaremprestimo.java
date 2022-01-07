package emprestimo;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.emprestimo;

public class solicitaremprestimo {	
	
	private static EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDcliente");
	private static EntityManager manager = managerFactory.createEntityManager();
	
	public void main(String[] args) {
		
		/****Mostrar Emprestimo pelo ID do solicitante****/
//		emprestimo emprestimo = manager.find(emprestimo.class, 1);
//		System.out.println(emprestimo.getValor());
		
		/****Inserir Emprestimo do Solicitante****/
		emprestimo emprestimo = new emprestimo();
		//emprestimo.setId(1);
		emprestimo.setDia(15);
		emprestimo.setParcelas(5);
		emprestimo.setValor(10000.00);
		emprestimo.setFk_id_solicitante(1);
		manager.getTransaction().begin();
		manager.persist(emprestimo);
		manager.getTransaction().commit();
		
		/****Deletar Emprestimo do Solicitante****/
//		emprestimo emprestimo0 = manager.find(emprestimo.class, 1);
//		manager.getTransaction().begin();
//		manager.remove(emprestimo);
//		manager.getTransaction().commit();
		
		/***Atualizar Emprestimo do Solicitante****/
//		emprestimo emprestimo1 = new emprestimo();
//		emprestimo.setId(1);
//		emprestimo.setDia(13);
//		emprestimo.setParcelas(20);
//		emprestimo.setValor(10000.00);
//		emprestimo.setFk_id_solicitante(1);
//		manager.getTransaction().begin();
//		manager.merge(emprestimo);
//		manager.getTransaction().commit();
		
	}
	
	
}
