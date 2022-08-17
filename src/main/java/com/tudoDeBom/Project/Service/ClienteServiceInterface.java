package com.tudoDeBom.Project.Service;

import java.util.ArrayList;
import java.util.List;

import com.tudoDeBom.Project.Model.Cliente;

/**
 * @Author: Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.0
 * 
 * @Author: Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.1
 * @Descricao Atualizacao de metodo listarPeloNome
 */

public interface ClienteServiceInterface {
	
	/**
	 * Cabecalho do metodo listar para listar todos os clientes
	 * @param ArrayList de Cliente
	 ** @return Lista de todos os clientes
	 */
	public ArrayList<Cliente> listar();
	
	/**
	 * Cabecalho do metodo listarPeloNome para listar clientes por nome
	 * @param nomeCliente
	 * @return lista de clientes com o nome informado no parametro
	 */
	public ArrayList<Cliente> listarPeloNome(String nomeCliente);
	
	/**
	 * Cabecalho do metodo listarPeloId para listar clientes por ID
	 * @param id
	 * @return lista de clientes com o id informado no parametro
	 */
	public Cliente listarPeloId(Integer id);
	
	/**
	 * Cabecalho do metodo para cadastrar novo cliente
	 * @param novo
	 * @return novo cadastro ok
	 */
	public Cliente novo (Cliente novo);
	
	/**
	 * Cabecalho do metodo para atualizar dados existentes
	 * @param atualizado
	 * @return cadastro atualizado ou mensagem de erro caso dados sejam invalidos
	 */
	public Cliente editar(Cliente atualizado);
	
	/**
	 * Cabecalho para excluir dados atraves do id
	 * @param id
	 * @return vazio caso id seja valido
	 */
	public void excluir(Integer id);
}
