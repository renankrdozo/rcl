package br.edu.iffarroupilha.bolicho.modelo;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Aluno {

	@Id
	@Column(nullable = false)
	private int matricula;
	@Column(length = 40, nullable = false)
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	private String nome;	
	

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getmatricula() {
		return matricula;
	 }

	public void setmatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
