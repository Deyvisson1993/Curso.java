package br.com.principal;

import br.com.livraria.produtos.*;
import br.com.livrariaa.*;
import br.com.produto.*;
import br.com.principal.*;

public class CarrinhoDeCompras {
	
	private double total;
	private Produto [] produtos = new Produto[10];
	private int contador = 0;
	
	public double getTotal(){
		return total;
	}
	
	
	public void adiciona(Produto produto){
		System.out.println("Adicionando:  " + produto);
		this.produtos[contador] = produto;
		contador++;
		this.total += produto.getValor();
		System.out.println("Total:  " + this.total);
	}
}
