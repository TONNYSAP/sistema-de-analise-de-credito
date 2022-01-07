package model;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emprestimos")
public class emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_emprestimo;
	
	@Column(name="valor")
	private Double valor;
	@Column(name="parcelas")
	private Integer parcelas;
	@Column(name="dia")
	private Integer dia;
	@Column(name="fk_id_solicitante")
	private Integer fk_id_solicitante;
	/**
	 * @return the fk_id_solicitante
	 */
	public Integer getFk_id_solicitante() {
		return fk_id_solicitante;
	}
	/**
	 * @param fk_id_solicitante the fk_id_solicitante to set
	 */
	public void setFk_id_solicitante(Integer fk_id_solicitante) {
		this.fk_id_solicitante = fk_id_solicitante;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id_emprestimo;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id_emprestimo = id;
	}
	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	/**
	 * @return the parcelas
	 */
	public Integer getParcelas() {
		return parcelas;
	}
	/**
	 * @param parcelas the parcelas to set
	 */
	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	/**
	 * @return the dia
	 */
	public Integer getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
	@Override
	public String toString() {
		return "emprestimo [id_emprestimo=" + id_emprestimo + ", valor=" + valor + ", parcelas=" + parcelas + ", dia="
				+ dia + ", fk_id_solicitante=" + fk_id_solicitante + "]";
	
	}
	@Override
	public int hashCode() {
		return Objects.hash(dia, fk_id_solicitante, id_emprestimo, parcelas, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		emprestimo other = (emprestimo) obj;
		return Objects.equals(dia, other.dia) && Objects.equals(fk_id_solicitante, other.fk_id_solicitante)
				&& Objects.equals(id_emprestimo, other.id_emprestimo) && Objects.equals(parcelas, other.parcelas)
				&& Objects.equals(valor, other.valor);
	}	
}
