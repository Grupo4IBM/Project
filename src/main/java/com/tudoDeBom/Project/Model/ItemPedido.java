package com.tudoDeBom.Project.Model;

/** 
 * A classe <b>ItemPedido<b> é responsável por armazenar as 
 * informações referentes aos produtos contidos na Entidade Pedido.
 * Ela se relaciona com a classe <b>Produtos<b> (relacionamento 1,1).
 *  
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 12/08/2022
 * */


public class ItemPedido {
	private int quantidade;
	private double precoUnitario;
	private double precoFinal;
	public ItemPedido(int quantidade, double precoUnitario, double precoFinal) {
		super();
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.precoFinal = precoFinal;
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
		return "ItemPedido [quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + ", precoFinal="
				+ precoFinal + "]";
	}
	
}
