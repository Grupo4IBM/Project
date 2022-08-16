package com.tudoDeBom.Project.Service;

/** 
 * @author Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.0
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tudoDeBom.Project.Model.Cliente;
import com.tudoDeBom.Project.Repository.ClienteRepository;

@Service
public class ClienteService implements ClienteServiceInterface {
	
	@Autowired
	private ClienteRepository clienteRepo;

	@Override
	public ArrayList<Cliente> listar() {
		// TODO Auto-generated method stub
		return (ArrayList<Cliente>)clienteRepo.findAll();
	}

	@Override
	public ArrayList<Cliente> listarPeloNome(String nomeCliente) {
		// TODO Auto-generated method stub
		return clienteRepo.findBynomeClienteContaining(nomeCliente);
	}

	@Override
	public Cliente listarPeloId(Integer id) {
		// TODO Auto-generated method stub
		return clienteRepo.findById(id).orElse(null);
	}

	@Override
	public Cliente novo(Cliente novo) {
		// TODO Auto-generated method stub
		return clienteRepo.save(novo);
	}

	@Override
	public Cliente editar(Cliente atualizado) {
		// TODO Auto-generated method stub
		return clienteRepo.save(atualizado);
	}

	@Override
	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		clienteRepo.deleteById(id);
	}
	
	
	
	

}
