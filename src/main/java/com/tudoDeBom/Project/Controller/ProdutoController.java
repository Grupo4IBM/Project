package com.tudoDeBom.Project.Controller;

/** 
 * @author Cristhiane Barros da Cruz
 * @since 15/08/2022
 * @version 1.0.0
 * */

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tudoDeBom.Project.Model.Produto;
import com.tudoDeBom.Project.Repository.ProdutoRepository;
import com.tudoDeBom.Project.Service.ProdutoServiceInterface;

@RestController
public class ProdutoController {

	                //Autowired: INJEÇÃO DE DEPENDÊNCIAS 
	                //não é necessário importar a CLASSE ProdutoService  
	@Autowired  	//para utilizar os métodos que ela implementou
	private ProdutoServiceInterface service;
	
	//READ-lista todos os produtos registrados no banco de dados
	@GetMapping("/produtos")
	private ArrayList<Produto> listar(){
		return service.listar();
	}
	
	//CREATE-cadastrar produto no banco de dados
	@PostMapping("/produtos")   //ResponseEntity retorna uma resposta HTTP, que pode conter algum código ou mensagem
	public ResponseEntity<Produto> cadastrar(@RequestBody Produto novo){
		Produto produto = service.novoProduto(novo);   
		if (produto != null) {
			return ResponseEntity.ok(produto);
		}
		return ResponseEntity.badRequest().build();
	}
	
	//UPDATE - atualizar dados de produto existente
	@PutMapping("/produtos") 
	public ResponseEntity<Produto> editar(@RequestBody Produto dados){
		Produto produto = service.editar(dados);
		if (produto != null) {
			return ResponseEntity.ok(produto);
		}
		return ResponseEntity.badRequest().build();
	}
	
	//DELETE - excluir produto da base de dados
	@DeleteMapping("/produtos/{id}")
	public ResponseEntity<Produto> excluir(@PathVariable Integer id){
		service.excluir(id);
		return ResponseEntity.ok(null);
	}
	
	//READ - buscar por ID
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> listarPeloId(@PathVariable Integer id){
		Produto produto = service.listarPeloId(id);
		if (produto != null) {
			return ResponseEntity.ok(produto);
		}
		return ResponseEntity.notFound().build();
	}

}
