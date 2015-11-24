package br.com.principal;

import br.com.livraria.produtos.*;
import br.com.livrariaa.*;
import br.com.produto.*;
import br.com.principal.*;


public class RegrasDeDesconto {
	
	public static void main (String [] args){
		
		LivroFisico livro = new LivroFisico();
		livro.setValor(59.90);
		
		System.out.println("Valor atual : " + livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.1)){
			System.out.println("Desconto nao pode ser maior que 30%");
		}else{
			System.out.println("valor com desconto: " + livro.getValor());
		}
		
	}
}	


