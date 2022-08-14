package com.tudoDeBom.Project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * A classe <b>Cliente<b> é responsável por armazenar as informações 
 * pessoais e de contato dos clientes cadastrados na loja.
 * 
 * Utilizamos anotações JPA para fazer o mapeamento objeto-relacional.
 * 
 * @Author Cristhiane Barros da Cruz
 * @Since 12/08/2022
 * */

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(name="nome_cliente", nullable=false)
	private String nomeCliente;
	
	@Column(name="telefone", nullable=false)
	private String telefone;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="cpf", nullable=false, unique=true)
	private String cpf;
	
	//private String endereco;   <- verificar se essas infos sao realmente necessarias
	//private String dataNasc;

	public Cliente() {
		super();
	}
	
	public Cliente(int idCliente, String nomeCliente, String telefone, String email, String cpf) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", telefone=" + telefone
				+ ", email=" + email + ", cpf=" + cpf + "]";
	}
	
}
