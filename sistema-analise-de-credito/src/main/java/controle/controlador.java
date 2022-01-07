package controle;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.cliente;

public class controlador {

	private static EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDcliente");
	private static EntityManager manager = managerFactory.createEntityManager();
	
	public  void main(String[] args) {
		
		//Encontrar pelo id
		int Id = 1;
		cliente cliente = manager.find(cliente.class, Id);
		System.out.println("Nome, Email e Senha do clientes: " + cliente.getNome() + " - " + cliente.getEmail() + " - " + cliente.getSenha());
				
		//Inserir Cliente
//		cliente cliente1 = new cliente();
//		cliente1.setNome("Katrina Ivanov");
//		cliente1.setEmail("ivanovnovkz@gmail.com");
//		cliente1.setCpf("222.222.222-15");
//		cliente1.setRg("55522211");
//		cliente1.setEndereco("avenida urbano, 4350");
//		cliente1.setRenda(8400.80);
//		cliente1.setSenha(2228);
//		manager.getTransaction().begin();
//		manager.persist(cliente1);
//		manager.getTransaction().commit();
		
		//Deletar Cliente
//		cliente cliente = manager.find(cliente.class, 2); ///remove pelo id
//		manager.getTransaction().begin();
//		manager.remove(cliente);
//		manager.getTransaction().commit();
		
		//Atualizar Cliente
		//////cliente cliente = new cliente();
		//cliente cliente = manager.find(cliente.class, 4);
		//cliente.setId(4);
		//cliente.setNome("Alexandra");
		//cliente.setEmail("alexgonzales@gmail.com");
		//cliente.setCpf("111.111.111-13");
		//cliente.setRg("66677799");
		//cliente.setEndereco("rua do carmo, 450");
		//cliente.setRenda(6200);		
//		cliente.setSenha(9999);
//		manager.getTransaction().begin();
//		manager.merge(cliente);
//		manager.getTransaction().commit();
	}

	
}
