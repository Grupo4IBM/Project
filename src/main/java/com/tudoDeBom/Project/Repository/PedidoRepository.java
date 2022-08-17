package com.tudoDeBom.Project.Repository;

import org.springframework.data.repository.CrudRepository;

import com.tudoDeBom.Project.Model.Pedido;

/** 
 * @Author Cristhiane Barros da Cruz
 * @Version 1.0.0
 * @Since 13/08/2022
 * */

/**
 * 
 * Interface Repository para invocar as bibliotecas do CRUD Repository
 *
 */

public interface PedidoRepository extends CrudRepository<Pedido, Integer>{

}
