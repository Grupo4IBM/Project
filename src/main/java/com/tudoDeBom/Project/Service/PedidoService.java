package com.tudoDeBom.Project.Service;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tudoDeBom.Project.Model.ItemPedido;
import com.tudoDeBom.Project.Model.Pedido;
import com.tudoDeBom.Project.Model.Produto;
import com.tudoDeBom.Project.Repository.PedidoRepository;
import com.tudoDeBom.Project.Repository.ProdutoRepository;

/**
 * @author Caio Henrique Negrão da Silva
 * @since 15/08/2022
 * @version 1.0.0
 * 
 * @author Cristhiane Barros da Cruz
 * @since 16/08/2022
 * @version 1.0.1
 */

@Service
public class PedidoService implements PedidoServiceInterface {

	@Autowired
	private PedidoRepository pedidoRepo;
	
	@Autowired
	private ProdutoRepository produtoRepo;
	
	@Override
	public Pedido recuperarPeloNumero(Integer numero) {
		return pedidoRepo.findById(numero).orElse(null);
}

	@Override
	public List<Pedido> listar() {
		// TODO Auto-generated method stub
		return (List<Pedido>)pedidoRepo.findAll();
	}

	@Override
	public Pedido inserirNovo(Pedido novo) {
		
		Double valorBrutoGenerico = (double) 0;
		Double valorBruto = (double) 0;
		Double valorBrutoTotal = (double) 0;
		Double valorLiquido = (double) 0;
		Double desconto = (double) 0;
		Double soma = (double)0;
		Double soma2 = (double)0;


		
		for(ItemPedido item: novo.getItens()) {
			Produto produto = produtoRepo.encontrarPorId(item.getProduto().getIdProduto());
			item.setPedido(novo);
			
			//Calculando o desconto de 20% para medicamentos genéricos e configurando o valor final do item
			Double porcentagem = (Double) 0.2;

			//condicional if: aplica-se o desconto somente caso o produto seja genérico
			if ("s".equals(produto.getFlagGenerico())) {
				
				for (int i=1; i <= item.getQuantidade(); i++) {
					desconto = desconto + (produto.getPreco() * porcentagem); 
					valorBrutoGenerico = valorBrutoGenerico + produto.getPreco(); 
				}
				//arredondando o preço para apenas 2 casas decimais
				desconto = (double) (Math.round(desconto*100.0)/100.0);
				valorBrutoGenerico = (double) (Math.round(valorBrutoGenerico*100.0)/100.0);
				
				soma2 = valorBrutoGenerico - desconto;
				soma2 = (double) (Math.round(soma2*100.0)/100.0);

				item.setPrecoFinal(soma2);
			} 
			else {
				//Caso não seja genérico, à variável 'preco' é adicionada apenas o valor integral do objeto 'produto'
				for(int i=1; i <= item.getQuantidade(); i++) {
					
					soma = soma + produto.getPreco();
					soma = (double) (Math.round(soma*100.0)/100.0);
				}
				item.setPrecoFinal(soma);
			}
			
			//Alterando a quantidade de produtos em estoque
			produto.setEstoque(produto.getEstoque() - item.getQuantidade());
			produtoRepo.save(produto);

		}
		valorLiquido = valorLiquido + soma + soma2;
		
		valorBrutoTotal = soma + valorBrutoGenerico;

		novo.setValorBruto(valorBrutoTotal);
		novo.setValorLiquido(valorLiquido);
		novo.setDesconto(desconto);
		
		return pedidoRepo.save(novo);		
	}
	
}
