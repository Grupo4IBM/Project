package com.tudoDeBom.Project.Service;

/** 
 * @author Cristhiane Barros da Cruz
 * @since 15/08/2022
 * @version 1.0.0
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tudoDeBom.Project.Model.Produto;

public interface ProdutoServiceInterface {

	//listar todos os produtos cadastrados
	public ArrayList<Produto> listar();
	
	//buscar pelo id
	public Produto listarPeloId(Integer id);
	
	//cadastrar novo produto
	public Produto novo(Produto novo);
	
	//atualizar produto
	public Produto editar(Produto atualizado);
	
	//excluir produto
	public void excluir(Integer id);
}
