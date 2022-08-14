package com.tudoDeBom.Project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * A classe <b>Produto<b> é responsável por armazenar as 
 * informações referentes aos produtos da loja.
 * Ela se relaciona com a classe <b>ItemPedido<b> (relacionamento 1,1).
 *  
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 12/08/2022
 * @Version 1.0.0
 * 
 * @Author Caio Henrique Negrão da Silva
 * @Since 13/08/2022
 * @Version 1.0.1
 * Descrição: Alteração de atributos.
 * 
 * @Author Cristhiane Barros da Cruz
 * @Since 13/08/2022
 * @Version 1.0.2
 * Descrição: Implementação das anotações JPA.
 * */

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduto;
	
	@Column(name="nome_produto", nullable=false)
	private String nomeProduto;
	
	@Column(name="preco", nullable=false)
	private double preco;
	
	@Column(name="flag_remedio", nullable=false)
	private char flagRemedio;
	
	@Column(name="flag_generico", nullable=false)
	private char flagGenerico;
	
	@Column(name="estoque", nullable=false)
	private int estoque;
	
	public Produto(int idProduto, String nomeProduto, double preco, char flagRemedio, char flagGenerico, int estoque) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.flagRemedio = flagRemedio;
		this.flagGenerico = flagGenerico;
		this.estoque = estoque;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public char getFlagRemedio() {
		return flagRemedio;
	}
	public void setFlagRemedio(char flagRemedio) {
		this.flagRemedio = flagRemedio;
	}
	public char getFlagGenerico() {
		return flagGenerico;
	}
	public void setFlagGenerico(char flagGenerico) {
		this.flagGenerico = flagGenerico;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", preco=" + preco
				+ ", flagRemedio=" + flagRemedio + ", flagGenerico=" + flagGenerico + ", estoque=" + estoque + "]";
	}

	}
	

