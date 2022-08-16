package com.tudoDeBom.Project.Repository;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tudoDeBom.Project.Model.Cliente;
/** 
 * @Author Cristhiane Barros da Cruz
 * @Version 1.0.0
 * @Since 13/08/2022
 * 
 * @Author Paulo Henrique de Souza Ribeiro
 * @Version 1.0.1
 * @Since 15/08/2022
 * @Descricao: Implementacao de metodo para busca de cliente por nome
 * */
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	ArrayList<Cliente> findBynomeClienteContaining(String nomeCliente);
	
	
	
}
