package com.tudoDeBom.Project.Model;

/** 
 * A classe <b>Produto<b> é responsável por armazenar as 
 * informações referentes aos produtos da loja.
 * Ela se relaciona com a classe <b>ItemPedido<b> (relacionamento 1,1).
 *  
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 12/08/2022
 * */

public class Produto {
	
	private int idProduto;
	private String classificacao;
	private String nomeProduto;
	private double preco;
	private String fabricante;
	private String validade;
	private String lote;
	private String principioAtivo;
	private int estoque;
	
	public Produto(int idProduto, String classificacao, String nomeProduto, double preco, String fabricante,
			String validade, String lote, String principioAtivo, int estoque) {
		super();
		this.idProduto = idProduto;
		this.classificacao = classificacao;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.fabricante = fabricante;
		this.validade = validade;
		this.lote = lote;
		this.principioAtivo = principioAtivo;
		this.estoque = estoque;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
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

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", classificacao=" + classificacao + ", nomeProduto=" + nomeProduto
				+ ", preco=" + preco + ", fabricante=" + fabricante + ", validade=" + validade + ", lote=" + lote
				+ ", principioAtivo=" + principioAtivo + ", estoque=" + estoque + "]";
	}
	
}
