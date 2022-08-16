package com.tudoDeBom.Project.Service;

import java.util.ArrayList;

import com.tudoDeBom.Project.Model.Pedido;

/**
 * @Author Caio Henrique Negrão da Silva
 * 
*/

public interface PedidoServiceInterface {
	
	//public Pedido inserirNovo(Pedido novo);
	public Pedido recuperarPeloNumero(Integer numero);
	public ArrayList<Pedido> listar();
	


	 

}
