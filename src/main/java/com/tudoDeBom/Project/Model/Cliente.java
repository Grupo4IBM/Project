package com.tudoDeBom.Project.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
 * 
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.2
 * @Descricao: Correção de getter, setter e toString do atributo endereco
 * */

/**
 * Anotacoes JPA para mapeamento de entidade/relacionamento no database.
 * Inclusao de getters e setters
 */  

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
	
	@OneToMany(mappedBy="cliente", cascade = CascadeType.ALL, orphanRemoval=false)//todas as alterações feitas a pedido repercutem em seus itens
	@JsonIgnoreProperties("cliente")
	private List<Pedido> pedidosCliente;

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

	public List<Pedido> getPedidosCliente() {
		return pedidosCliente;
	}

	public void setPedidosCliente(List<Pedido> pedidosCliente) {
		this.pedidosCliente = pedidosCliente;
	}
}
