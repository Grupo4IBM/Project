package com.tudoDeBom.Project.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tudoDeBom.Project.Model.Produto;
import com.tudoDeBom.Project.Repository.ProdutoRepository;
import com.tudoDeBom.Project.Service.ProdutoServiceInterface;

@Controller
@RequestMapping(path="/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoServiceInterface produtoService;
	
	@Autowired
	private ProdutoRepository produtoRepo;
	
	//página inicial de Produto que lista todos os itens em estoque
	@GetMapping("/")
	public ArrayList<Produto> getProdutos() {
		ArrayList<Produto> estoque;
		//
		estoque = (ArrayList<Produto>)produtoService.listar();
		return estoque;
	}
	
}
