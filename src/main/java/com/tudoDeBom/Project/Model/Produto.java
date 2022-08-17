package com.tudoDeBom.Project.Model;

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

/**
 * Anotacoes JPA para mapeamento de entidade/relacionamento no database.
 * Inclusao de getters e setters
 * 
 */

@Entity
@Table(name = "produto")
public class Produto {
	
	@Column(name="id_produto")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduto;
	
	@Column(name="nome_produto", length=45, nullable=false)
	private String nomeProduto;
	
	@Column(name="preco")
	private Double preco;
	
	@Column(name="flag_remedio", length=1)
	private String flagRemedio;
	
	@Column(name="flag_generico", length=1)
	private String flagGenerico;
	
	@Column(name="estoque")
	private Integer estoque;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getFlagRemedio() {
		return flagRemedio;
	}

	public void setFlagRemedio(String flagRemedio) {
		this.flagRemedio = flagRemedio;
	}

	public String getFlagGenerico() {
		return flagGenerico;
	}

	public void setFlagGenerico(String flagGenerico) {
		this.flagGenerico = flagGenerico;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
}


