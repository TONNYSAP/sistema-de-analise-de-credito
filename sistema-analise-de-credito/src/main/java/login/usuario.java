package login;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.cliente;

public class usuario {
	
	
	public void LoginUsuario(int Id, String Email, Integer Senha) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("E-mail: ");
		String email = scan.nextLine();
		System.out.println("Senha: ");
		Integer password = scan.nextInt();
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDcliente");
		EntityManager manager = managerFactory.createEntityManager();
		
		//Query emailusuario = manager.createQuery("SELECT * FROM bancocliente.clientes WHERE email = ?;");
		//Query senhausuario = manager.createQuery("SELECT * FROM bancocliente.clientes WHERE senha = ?");
		//emailusuario.getResultList();
		
		cliente cliente = manager.find(cliente.class, Id);
		
		Integer senha = cliente.getSenha();
		String emaillogin = cliente.getEmail();
		
		int resultadoemail = email.compareTo(emaillogin);
		
		System.out.println(cliente);
		System.out.println(email + " - " + emaillogin);
		System.out.println(resultadoemail);
		
		if(password.equals(senha) && (resultadoemail >= 0)) {
			System.out.println("Usuário está logado");
		}else {
			System.out.println("Usuário e/ou senha inválidos!");
		}
		
		
	}
	    

}
