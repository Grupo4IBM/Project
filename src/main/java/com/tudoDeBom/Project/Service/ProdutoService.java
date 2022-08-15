package com.tudoDeBom.Project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tudoDeBom.Project.Model.Produto;
import com.tudoDeBom.Project.Repository.ProdutoRepository;

@Service
public class ProdutoService implements ProdutoServiceInterface {

	@Autowired
	private ProdutoRepository produtoRepo;
	
	//método que recupera do banco de dados todos os registros de produtos existentes 
	@Override
	public List<Produto> listar(){
		return (List<Produto>) produtoRepo.findAll();
	}
		
	//método que busca no banco de dados pelo id do produto
	@Override
	public Optional<Produto> listarPeloId(int idProduto){
		return (Optional<Produto>) produtoRepo.findById(idProduto);	
		
	}
	
}
