package com.tudoDeBom.Project.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** 
 * A classe <b>ItemPedido<b> é responsável por armazenar as 
 * informações referentes aos produtoss contidos na Entidade Pedido.
 * Ela se relaciona com a classe <b>Produtos<b> (relacionamento 1,1).
 *  
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 12/08/2022
 * @Version 1.0.0
 * 
 * @author Caio Henrique Negrão da Silva
 * @Since 13/08/2022
 * @Version 1.0.1
 * Implementacao das anotacoes JPA.
 * */

/**
 * Anotacoes JPA para mapeamento de entidade/relacionamento no database.
 * Inclusao de getters e setters
 * 
 */

@Entity
@Table(name="itemPedido")
public class ItemPedido {
	
	@Column(name="id_item_pedido")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idItemPedido;
	
	@Column(name="quantidade")
	private Integer quantidade;
	
	@Column(name="preco_unitario")
	private double precoUnitario;
	
	@Column(name="preco_final")
	private double precoFinal;
	
	@ManyToOne
	@JoinColumn(name="numero_pedido")
	@JsonIgnoreProperties("itens")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;
	
	public Integer getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(Integer idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	

}
