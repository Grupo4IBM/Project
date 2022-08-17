package com.tudoDeBom.Project.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tudoDeBom.Project.Model.Produto;

/** 
 * @Author Cristhiane Barros da Cruz
 * @Version 1.0.0
 * @Since 13/08/2022
 * */

/**
 * 
 * Interface Repository para invocar as bibliotecas do Repositorio CRUD
 *
 */
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

	@Query("SELECT p FROM Produto p WHERE p.idProduto = ?1")
	public Produto encontrarPorId(Integer id);
}
