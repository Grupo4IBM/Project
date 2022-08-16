package com.tudoDeBom.Project.Service;

import java.util.ArrayList;
import java.util.List;

import com.tudoDeBom.Project.Model.Cliente;

/**
 * @Author: Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.0
 * 
 * @Author: Paulo Henrique de Souza Ribeiro
 * @Since 15/08/2022
 * @Version 1.0.1
 * @Descricao Atualizacao de metodo listarPeloNome
 */

public interface ClienteServiceInterface {
	
	//listar todos os clientes cadastrados
	public ArrayList<Cliente> listar();
	
	//buscar pelo nome
	public ArrayList<Cliente> listarPeloNome(String nomeCliente);
	
	//buscar pelo ID
	public Cliente listarPeloId(Integer id);
	
	//cadastrar novo cliente
	public Cliente novo (Cliente novo);
	
	//atualizar cliente
	public Cliente editar(Cliente atualizado);
	
	//excluir cliente
	public void excluir(Integer id);
}
