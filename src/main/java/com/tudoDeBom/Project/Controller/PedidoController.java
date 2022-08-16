package com.tudoDeBom.Project.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tudoDeBom.Project.Model.Pedido;
import com.tudoDeBom.Project.Repository.PedidoRepository;
import com.tudoDeBom.Project.Service.PedidoServiceInterface;

@RestController
public class PedidoController {

	@Autowired
	private PedidoServiceInterface service;

	@GetMapping("/pedidos/{numero}")
	public ResponseEntity<Pedido> recuperarPeloNumero(@PathVariable Integer numero){
		Pedido res = service.recuperarPeloNumero(numero);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();
		
	}
	@GetMapping("/pedidos")
	private ArrayList<Pedido> listar(){
		return service.listar();
	}
/*
	@PostMapping("/pedidos")
	public ResponseEntity<Pedido> inserirNovo(@RequestBody Pedido novo) {
		return ResponseEntity.ok(service.inserirNovo(novo));
	}
	*/
}
