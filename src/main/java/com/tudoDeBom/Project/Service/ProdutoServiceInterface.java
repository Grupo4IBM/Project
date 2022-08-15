package com.tudoDeBom.Project.Service;

import java.util.List;
import java.util.Optional;

import com.tudoDeBom.Project.Model.Produto;

public interface ProdutoServiceInterface {

	public List<Produto> listar();
	public Optional<Produto> listarPeloId(int idProduto);
}
