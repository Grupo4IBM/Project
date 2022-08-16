package com.tudoDeBom.Project.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tudoDeBom.Project.Model.ItemPedido;
import com.tudoDeBom.Project.Model.Pedido;
import com.tudoDeBom.Project.Repository.PedidoRepository;

/**
 * @author Caio Henrique Negrão da Silva
 * @since 15/08/2022
 * @version 1.0.0
 */

@Service
public class PedidoService implements PedidoServiceInterface {

	@Autowired
	private PedidoRepository pedidoRepo;
	/*
	ItemPedido itens;  
	@Override
	public Pedido inserirNovo(Pedido novo) {
		for (ItemPedido itens: novo.getItens());{
			
			itens.setPedido(novo);
	}
	return pedidoRepo.save(novo);
	}
	*/
	@Override
	public Pedido recuperarPeloNumero(Integer numero) {
		return pedidoRepo.findById(numero).orElse(null);
}

	@Override
	public ArrayList<Pedido> listar() {
		// TODO Auto-generated method stub
		return (ArrayList<Pedido>)pedidoRepo.findAll();
	}
}
