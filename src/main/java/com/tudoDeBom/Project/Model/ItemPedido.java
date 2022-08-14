package com.tudoDeBom.Project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * A classe <b>ItemPedido<b> é responsável por armazenar as 
 * informações referentes aos produtos contidos na Entidade Pedido.
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

@Entity
@Table(name="item_pedido")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idItemPedido;
	
	@Column(name="quantidade", nullable=false)
	private int quantidade;
	
	@Column(name="preco_unitario", nullable=false)
	private double precoUnitario;
	
	@Column(name="preco_final", nullable=false)
	private double precoFinal;
	
	public ItemPedido() {
		super();
		
	}

	public ItemPedido(int idItemPedido, int quantidade, double precoUnitario, double precoFinal) {
		super();
		this.idItemPedido = idItemPedido;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.precoFinal = precoFinal;
	}

	public int getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(int idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
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

	@Override
	public String toString() {
		return "ItemPedido [idItemPedido=" + idItemPedido + ", quantidade=" + quantidade + ", precoUnitario="
				+ precoUnitario + ", precoFinal=" + precoFinal + "]";
	}
	
	
	
}
