package com.tudoDeBom.Project.Service;

import java.util.List;

import com.tudoDeBom.Project.Model.Pedido;

/**
 * @Author Caio Henrique Negrão da Silva
 * 
*/

public interface PedidoServiceInterface {
	
	/**
	 * Cabecalho do metodo para cadastrar novo cliente
	 * @param novo
	 * @return novo cadastro ok
	 */
	public Pedido inserirNovo(Pedido novo);
	
	/**
	 * Cabecalho do metodo listarPeloNumero para listar pedidos por numero de pedido
	 * @param numero
	 * @return lista de pedidos com o numero informado no parametro
	 */
	public Pedido recuperarPeloNumero(Integer numero);
	
	/**
	 * Cabecalho do metodo listar para listar todos os pedidos
	 * @param ArrayList de Pedido
	 ** @return Lista de todos os pedidos
	 */
	public List<Pedido> listar();
	


	 

}
