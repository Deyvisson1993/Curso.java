package br.com.livraria.produtos;

import br.com.livrariaa.*;
import br.com.produto.*;
import br.com.principal.*;

public abstract class Livro implements Produto{
	
	private String titulo;
	private String descriçao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public void mostrarDetalhes(){
		
		System.out.println("Titulo:" + titulo);
		System.out.println("Descrição:" + descriçao);
		System.out.println("Preço:" + valor);
		System.out.println("ISBN:" +  isbn);
		System.out.println("------------------");
	
	}

	
	public abstract boolean aplicaDescontoDe(double valor);
		

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescriçao() {
		return descriçao;
	}


	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
}
