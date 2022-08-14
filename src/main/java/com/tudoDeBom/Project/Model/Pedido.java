package com.tudoDeBom.Project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * A classe <b>Pedido<b> é responsável por armazenar as 
 * informações referentes aos pedidos realizados por clientes.
 * Ela se relaciona com a classe Cliente (relacionamento N,1) e
 * com a entidade itemPedido (relacionamento 1,N).
 * 
 * 
 * @Author Cassia Roberta Maria Leal
 * @Since 12/08/2022
 * @Version 1.0.0
 * 
 * @Author Caio Henrique Negrão da Silva
 * @Since 13/08/2022
 * @Version 1.0.1
 * Descrição: Alteração de atributos.
 * Implementacao das anotacoes JPA.
 * */

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroPedido;
	
	@Column(name="status", nullable=false)
	private String status;
	
	@Column(name="data", nullable=false)
	private String data;
	
	@Column(name="valor_bruto", nullable=false)
	private double valorBruto;
	
	@Column(name="valor_liquido", nullable=false)
	private double valorLiquido;
	
	@Column(name="desconto", nullable=false)
	private double desconto;
		
	private Cliente cliente; 
	
	public Pedido(int numeroPedido, String status, String data, double valorBruto, double valorLiquido, double desconto,
			Cliente cliente) {
		super();
		this.numeroPedido = numeroPedido;
		this.status = status;
		this.data = data;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.desconto = desconto;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", status=" + status + ", data=" + data + ", valorBruto="
				+ valorBruto + ", valorLiquido=" + valorLiquido + ", desconto=" + desconto + ", cliente=" + cliente
				+ "]";
	}
}
