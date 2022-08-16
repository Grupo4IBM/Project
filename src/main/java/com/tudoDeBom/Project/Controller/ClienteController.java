package com.tudoDeBom.Project.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tudoDeBom.Project.Model.Cliente;
import com.tudoDeBom.Project.Repository.ClienteRepository;
import com.tudoDeBom.Project.Service.ClienteServiceInterface;

/**
 * 
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.0
 *
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.1 implementação de get, put, post e delete
 */

@RestController
public class ClienteController {

				//Autowired: INJEÇÃO DE DEPENDÊNCIAS 
   @Autowired   //não é necessário importar a CLASSE ProdutoService  
				//para utilizar os métodos que ela implementou
   private ClienteServiceInterface service;
   
   @Autowired
   private ClienteRepository clienteRepo;
   
   //READ-Lista todos os produtos registrados no banco de dados
   @GetMapping("/clientes")
   private ArrayList<Cliente> listar(){
	   return service.listar();
   }
   
   //CREATE - Cadastrar cliente no banco de dados
   @PostMapping("/clientes") //ResponseEntity retorna uma resposta HTTP, que pode conter algum código ou mensagem
   public ResponseEntity<Cliente> novo(@RequestBody Cliente novo){
	   Cliente cliente = service.novo(novo);
	   if (cliente != null) {
		   return ResponseEntity.ok(cliente);
	   }
	   return ResponseEntity.badRequest().build();
   }
   
   //UPDATE - Atualizar dados de produto existente
   @PutMapping("/clientes")
   public ResponseEntity<Cliente> editar(@RequestBody Cliente dados){
	   Cliente cliente = service.editar(dados);
	   if (cliente != null) {
		   return ResponseEntity.ok(cliente);
	   }
	   return ResponseEntity.badRequest().build();
   }
   
   //DELETE - excluir produto da base de dados
 	@DeleteMapping("/clientes/{id}")
 	public ResponseEntity<Cliente> excluir(@PathVariable Integer id){
 		service.excluir(id);
 		return ResponseEntity.ok(null);
 	}
 	
 	//READ - buscar por ID
	@GetMapping("/clientes/{id}")
	public ResponseEntity<Cliente> listarPeloId(@PathVariable Integer id){
		Cliente cliente = service.listarPeloId(id);
		if (cliente != null) {
			return ResponseEntity.ok(cliente);
		}
		return ResponseEntity.notFound().build();
	}
	
	//READ - buscar por NOME
	@GetMapping("/clientes/busca")
	public ArrayList<Cliente> listarPeloNome(@RequestParam(name="palavra") String nomeCliente){
		return service.listarPeloNome(nomeCliente);		
	}
}










