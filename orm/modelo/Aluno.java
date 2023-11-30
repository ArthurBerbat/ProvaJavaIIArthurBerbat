package orm.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "aluno")
public class Aluno {
	@Id
	@GeneratedValue
	private Long id;
	

	private String Nome;
	private String email;
	private long CPF;
	private String Naturalidade;
	private String endereco;

	@Temporal(TemporalType.DATE)
	private int dataDeNascimento;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public void setEmail(String Email) {
		this.email = Email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Long getCPF() {
		return CPF;
	}

	public void setCPF(long CPF) {
		this.CPF = CPF;
	}
	
	public String getNaturalidade() {
		return Naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		Naturalidade = naturalidade;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getDataNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataNascimento(int date) {
		this.dataDeNascimento = date;
	}
}