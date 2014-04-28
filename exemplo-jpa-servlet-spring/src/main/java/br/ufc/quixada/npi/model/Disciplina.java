package br.ufc.quixada.npi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disciplinas")
public class Disciplina {

	public Disciplina() {
		super();
	}

	public Disciplina(String nome, String cod_d) {
		super();
		this.nome = nome;
		this.cod_d = cod_d;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_d;

	@Column(nullable=false)
	private String nome;

	private String cod_d;

	public Integer getId() {
		return id_d;
	}

	public void setId(Integer id_d) {
		this.id_d = id_d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCod_d() {
		return cod_d;
	}

	public void setCod_d(String cod_d) {
		this.cod_d = cod_d;
	}

	@Override
	public String toString() {
		return "Disciplina [id_d=" + id_d + ", nome=" + nome + ", cod_d=" + cod_d + "]";
	}

}
