package com.tudoDeBom.Project.Service;

/** 
 * @author Cristhiane Barros da Cruz
 * @since 15/08/2022
 * @version 1.0.0
 * */

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tudoDeBom.Project.Model.Produto;
import com.tudoDeBom.Project.Repository.ProdutoRepository;

@Service
public class ProdutoService implements ProdutoServiceInterface {

	@Autowired
	private ProdutoRepository produtoRepo;

	@Override      //READ-Retorna todos os registros de produtos
	public ArrayList<Produto> listar() {
		// TODO Auto-generated method stub
		return (ArrayList<Produto>)produtoRepo.findAll();
	}

	@Override      //CREATE-Registra um novo produto
	public Produto novoProduto(Produto novo) {
		// TODO Auto-generated method stub
		return produtoRepo.save(novo);
	}

	@Override      //UPDATE-Atualiza produto existente no banco de dados
	public Produto editar(Produto atualizado) {
		// TODO Auto-generated method stub
		return produtoRepo.save(atualizado);
	}

	@Override     //DELETE-Excluir produto da database
	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		produtoRepo.deleteById(id);
	}

	@Override    //READ-buscar se no banco de dados existe produto com esse código
	public Produto listarPeloId(Integer id) {
		// TODO Auto-generated method stub
		//caso não seja encontrado produto com esse ID, ele retorna null
		return produtoRepo.findById(id).orElse(null);
	}
	
}
