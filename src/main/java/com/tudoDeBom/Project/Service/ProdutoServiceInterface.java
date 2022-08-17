package com.tudoDeBom.Project.Service;

/** 
 * @author Cristhiane Barros da Cruz
 * @since 15/08/2022
 * @version 1.0.0
 * */

import java.util.ArrayList;

import com.tudoDeBom.Project.Model.Produto;

public interface ProdutoServiceInterface {

	/**
	 * Cabecalho do metodo listar para listar todos os produtos
	 * @param ArrayList de Produto
	 ** @return Lista de todos os produtos
	 */
	public ArrayList<Produto> listar();
	
	/**
	 * Cabecalho do metodo listarPeloId para listar produtos por ID
	 * @param id
	 * @return lista de produtos com o id informado no parametro
	 */
	public Produto listarPeloId(Integer id);
	
	/**
	 * Cabecalho do metodo para cadastrar novo produto
	 * @param novo
	 * @return novo cadastro ok
	 */
	public Produto novoProduto(Produto novo);
	
	/**
	 * Cabecalho do metodo para atualizar dados existentes
	 * @param atualizado
	 * @return cadastro atualizado ou mensagem de erro caso dados sejam invalidos
	 */
	public Produto editar(Produto atualizado);
	
	/**
	 * Cabecalho para excluir dados atraves do id
	 * @param id
	 * @return vazio caso id seja valido
	 */
	public void excluir(Integer id);
}
