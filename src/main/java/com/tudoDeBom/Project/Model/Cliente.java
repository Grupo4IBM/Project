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
 * @Version 1.0.0
 * 
 * @Author Caio Henrique Negrão da Silva
 * @Since 13/08/2022
 * @Version 1.0.1
 * Descrição: Criação do construtor Cliente().
 * */

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Column(name="id_cliente")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(name="nome_cliente", length=70,nullable=false)
	private String nomeCliente;
	
	@Column(name="telefone", length=15, nullable=false)
	private String telefone;
	
	@Column(name="email", length=50 ,nullable=false)
	private String email;
	
	@Column(name="cpf", length=14, nullable=false, unique=true)
	private String cpf;
	
	@Column(name="endereco", length=100)
	private String endereco;   //<- verificar se essas infos sao realmente necessarias
	
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
