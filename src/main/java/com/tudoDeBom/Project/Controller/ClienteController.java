package com.tudoDeBom.Project.Controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tudoDeBom.Project.Model.Cliente;
import com.tudoDeBom.Project.Repository.ClienteRepository;
import com.tudoDeBom.Project.Service.ClienteServiceInterface;

/**
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.0
 *
 * @Author Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.1 implementação de get, put, post e delete
 */

@Controller
public class ClienteController {

				//Autowired: INJEÇÃO DE DEPENDÊNCIAS 
   @Autowired   //não é necessário importar a CLASSE ProdutoService  
				//para utilizar os métodos que ela implementou
   private ClienteServiceInterface service;
   
   @Autowired
   private ClienteRepository clienteRepo;
   
   
   /**
	 * Método GET utilizado para recuperar dados (Read).
	 * @return  retorna o valor de todos campos listados.
	 * 
	 */   
   @GetMapping("/clientes")
   private ArrayList<Cliente> listar(){
	   return service.listar();
   }
   

   /**
	 * Método POST utilizado para criar registros (Create). 
	 * @param novo
	 * @return Se o envio for bem sucedido ele retorna ok,
	 * caso contrário ele retorna uma mensagem de erro.
	 */
   @PostMapping("/clientes") //ResponseEntity retorna uma resposta HTTP, que pode conter algum código ou mensagem
   public ResponseEntity<Cliente> novo(@RequestBody Cliente novo){
	   Cliente cliente = service.novo(novo);
	   if (cliente != null) {
		   return ResponseEntity.ok(cliente);
	   }
	   return ResponseEntity.badRequest().build();
   }
   
   /**
	 * Método PUT utilizado para atualizar dados (Update).
	 * @param dados
	 * @return Se (cliente) nao for null, atualiza os dados e retorna a atualizacao,
	 * Se (cliente) for null, retorna mensagem de erro.
	 */
   @PutMapping("/clientes")
   public ResponseEntity<Cliente> editar(@RequestBody Cliente dados){
	   Cliente cliente = service.editar(dados);
	   if (cliente != null) {
		   return ResponseEntity.ok(cliente);
	   }
	   return ResponseEntity.badRequest().build();
   }
   
   /**
 	 * Método DELETE utilizado para excluir dados.
 	 * @param id
 	 * @return retorna valor vazio, caso tenha um id valido.
 	 */
 	@DeleteMapping("/clientes/{id}")
 	public ResponseEntity<Cliente> excluir(@PathVariable Integer id){
 		service.excluir(id);
 		return ResponseEntity.ok(null);
 	}
 	
 	/**
	 * Método GET utilizado para listar campos através do id.
	 * @param id
	 * @return Caso True retorna (cliente), caso False retorna notFound.
	 */
	@GetMapping("/clientes/{id}")
	public ResponseEntity<Cliente> listarPeloId(@PathVariable Integer id){
		Cliente cliente = service.listarPeloId(id);
		if (cliente != null) {
			return ResponseEntity.ok(cliente);
		}
		return ResponseEntity.notFound().build();
	}
	
	/**
	 * Método GET utilizado para listar campos através do nome do cliente.
	 * @param nomeCliente
	 * @return retorna (nomeCliente)
	 *  
	 */
	@GetMapping("/clientes/busca")
	public ArrayList<Cliente> listarPeloNome(@RequestParam(name="palavra") String nomeCliente){
		return service.listarPeloNome(nomeCliente);		
	}
}










