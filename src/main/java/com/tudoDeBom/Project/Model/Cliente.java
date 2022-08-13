package com.tudoDeBom.Project.Model;
/** 
 * A classe <b>Cliente<b> é responsável por armazenar as informações 
 * pessoais e de contato dos clientes cadastrados na loja.
 * 
 * 
 * @Author Cristhiane Barros da Cruz
 * @Since 12/08/2022
 * */


public class Cliente {

	private int idCliente;
	
	private String nomeCliente;
	
	private String telefone;
	
	private String email;
	
	private String cpf;
	
	private String endereco;
	
	private String dataNasc;

	public Cliente(int idCliente, String nomeCliente, String telefone, String email, String cpf, String endereco,
			String dataNasc) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", telefone=" + telefone
				+ ", email=" + email + ", cpf=" + cpf + ", endereco=" + endereco + ", dataNasc=" + dataNasc + "]";
	}
	
}
