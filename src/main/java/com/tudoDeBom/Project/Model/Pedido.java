package com.tudoDeBom.Project.Model;

/** 
 * A classe <b>Pedido<b> é responsável por armazenar as 
 * informações referentes aos pedidos realizados por clientes.
 * Ela se relaciona com a classe Cliente (relacionamento N,1) e
 * com a entidade itemPedido (relacionamento 1,N).
 * 
 * 
 * @Author Cassia Roberta Maria Leal
 * @Since 12/08/2022
 * */

public class Pedido {
	
	private int numeroPedido;
	private String status;
	private String data;
	private double valorBruto;
	private double valorLiquido;
	private double desconto;
	
	public Pedido(int numeroPedido, String status, String data, double valorBruto, double valorLiquido,
			double desconto) {
		super();
		this.numeroPedido = numeroPedido;
		this.status = status;
		this.data = data;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.desconto = desconto;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", status=" + status + ", data=" + data + ", valorBruto="
				+ valorBruto + ", valorLiquido=" + valorLiquido + ", desconto=" + desconto + "]";
	}
	
	
	
}
