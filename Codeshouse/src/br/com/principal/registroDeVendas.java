package br.com.principal;

import br.com.livraria.produtos.*;
import br.com.livrariaa.*;
import br.com.produto.*;
import br.com.principal.*;


public class registroDeVendas {
	
	public static void main (String [] args){
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico();
		fisico.setTitulo("Programação Orientada a Testes");
		fisico.setValor(66.6);
		
		Ebook ebook = new Ebook();
		ebook.setTitulo("Programação II");
		ebook.setValor(454.3);
		
//////////////COMPRA DE LIVROS///////////////
		
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	carrinho.adiciona(fisico);
	carrinho.adiciona(ebook);
	
	
	Revista revista = new Revista();
	revista.setTitulo("Veja");
	revista.setValor(59.90);
	
	carrinho.adiciona(revista);
	}
}
