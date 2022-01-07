package controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.cliente;

public class controleBD {
	

	private static EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDcliente");
	private static EntityManager manager = managerFactory.createEntityManager();
	
	
	public void DadosCliente(int Id) {
		cliente cliente = manager.find(cliente.class, Id);
		System.out.println("Nome, Email e Endereço do cliente: " + cliente.getNome() + " - " + cliente.getEmail() + " - " + cliente.getEndereco());
	}
	
	public void CadastroCliente(String Nome, String Email, String Cpf, String Rg, String Endereco, Double Renda, Integer Senha) {
		cliente cliente = new cliente();
		///cliente.getId();
		cliente.setNome(Nome);
		cliente.setEmail(Email);
		cliente.setCpf(Cpf);
		cliente.setRg(Rg);
		cliente.setEndereco(Endereco);
		cliente.setRenda(Renda);
		cliente.setSenha(Senha);
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		System.out.println("Cliente Cadastrado!");
	}
	
	public void DeletarCliente(Integer Id) {		
		cliente cliente = manager.find(cliente.class, Id); ///remove pelo id
		
		manager.getTransaction().begin();
		manager.remove(cliente);
		manager.getTransaction().commit();
		
		System.out.println("Cliente Removido!");
	}
	
	public void AtualizarCliente(Integer Id, String Nome, String Email, String Cpf, String Rg, String Endereco, Double Renda, Integer Senha) {
		cliente cliente = manager.find(cliente.class, Id); ///atualizar pelo id
		cliente.setId(Id);
		cliente.setNome(Nome);
		cliente.setEmail(Email);
		cliente.setCpf(Cpf);
		cliente.setRg(Rg);
		cliente.setEndereco(Endereco);
		cliente.setRenda(Renda);
		cliente.setSenha(Senha);
				
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();
				
		System.out.println("Cliente Atualizado!");
	}
}
