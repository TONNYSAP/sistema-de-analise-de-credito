package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes") ////"clientes" : é o nome da tablela.
public class cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="rg")
	private String rg;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="renda")
	private Double renda;
	
	@Column(name="senha")
	private Integer senha;
	/**
	 * @return the senha
	 */
	public Integer getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id_cliente;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id_cliente = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the renda
	 */
	public Double getRenda() {
		return renda;
	}
	/**
	 * @param i the renda to set
	 */
	public void setRenda(double i) {
		this.renda = i;
	}
	
	
	
}
