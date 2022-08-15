package com.tudoDeBom.Project.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@Column(name="numero_pedido")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroPedido;
	
	@Column(name="status", length=25,nullable=false)
	private String status;
	
	@Column(name="data", length=10,nullable=false)
	private String data;
	
	@Column(name="valor_bruto", nullable=false)
	private double valorBruto;
	
	@Column(name="valor_liquido", nullable=false)
	private double valorLiquido;
	
	@Column(name="desconto", nullable=false)
	private double desconto;
	
	//Relacionamento muitos para um - um cliente pode ter vários pedidos
	@ManyToOne
	@JoinColumn(name="id_cliente", referencedColumnName="id_cliente")
	private Cliente cliente;
	
	//Relacionamento um para muitos - um pedido pode conter vários itens
	@OneToMany(mappedBy="pedido", cascade=CascadeType.ALL)//todas as alterações feitas a pedido repercutem em seus itens
	@JsonIgnoreProperties("pedido")
	private List<ItemPedido> itens;

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int numeroPedido, String status, String data, double valorBruto, double valorLiquido, double desconto,
			Cliente cliente, List<ItemPedido> itens) {
		super();
		this.numeroPedido = numeroPedido;
		this.status = status;
		this.data = data;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.desconto = desconto;
		this.cliente = cliente;
		this.itens = itens;
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

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", status=" + status + ", data=" + data + ", valorBruto="
				+ valorBruto + ", valorLiquido=" + valorLiquido + ", desconto=" + desconto + ", cliente=" + cliente
				+ ", itens=" + itens + "]";
	}
	
}
