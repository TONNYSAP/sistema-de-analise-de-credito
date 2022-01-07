package emprestimo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.cliente;
import model.emprestimo;


public class metodosemprestimo {
	
	private static EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDcliente");
	private static EntityManager manager = managerFactory.createEntityManager();

	
	
	
	public List<?> findAll() {	
		
		return manager.createQuery("FROM emprestimo").getResultList();
	}
	
	public String listagem(int Id) {				
		cliente cliente = manager.find(cliente.class, Id);
		return cliente.getNome() + " - " + cliente.getEmail() ;
	}
	
	public Double listagem2(int Id_solicitante) {
		emprestimo emprestimo = manager.find(emprestimo.class, Id_solicitante);
		return emprestimo.getValor();
	}
	
	public Integer listagem3(int Id_solicitante) {
		emprestimo emprestimo = manager.find(emprestimo.class, Id_solicitante);
		return emprestimo.getParcelas();
	}
}
