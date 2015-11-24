package br.com.principal;

import br.com.livraria.produtos.*;
import br.com.livrariaa.*;
import br.com.produto.*;



public class CadastroDeLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LivroFisico livro1 = new LivroFisico();
		livro1.setTitulo  ("Aprendendo Java");
		livro1.setDescriçao("Comine a Linguagem de Programação Java");
		livro1.setValor(59.60);
		livro1.setIsbn("987-87-97867-88-0");
		livro1.mostrarDetalhes();
		//////// POPULANDO AUTOR/////
		
		Autor autor = new Autor();
		
		autor.setNome("Fernando Oliveira");
		autor.setCpf("091-002-334-53");
		autor.setEmail("fernando.vc@gmail.com");
	
		autor.mostrarDetalhes();
		
		LivroFisico novoLivro = new LivroFisico();
		novoLivro.setTitulo("Bibliotecas e API Java");
		novoLivro.setDescriçao("Concheça os principais recursos de Linguagens");
		novoLivro.setValor(48.58);
		novoLivro.setIsbn("654-66-77865-98-9");
		novoLivro.mostrarDetalhes();
		
		////////POPULANDO AUTOR/////
		
		Autor novoAutor = new Autor();
		
		novoAutor.setNome("Paulo Martins"); 
		novoAutor.setCpf("091-042-444-53");
		novoAutor.setEmail("paulo.123@gmail.com");
	
		novoAutor.mostrarDetalhes();
		
		LivroFisico maisUmLivro = new LivroFisico();
		maisUmLivro.setTitulo("Conheça o Java 8");
		maisUmLivro.setDescriçao("Aprenda os novos recursos da Linguagem");
		maisUmLivro.setValor(70.98);
		maisUmLivro.setIsbn("654-76-56421-76-9");
		maisUmLivro.mostrarDetalhes();
		
		////////POPULANDO AUTOR/////
		
		Autor maisUMAutor = new Autor();
		
		maisUMAutor.setNome("Deyvisson Mendes");
		maisUMAutor.setCpf("034-000-334-00");
		maisUMAutor.setEmail("deyvisson.mendes@gmail.com");
	
		maisUMAutor.mostrarDetalhes();
		
		///// POPULANDO EBOOKS //////
		
		Ebook ebooks1 = new Ebook();
		Autor autorEbook = new Autor();
		
		ebooks1.setTitulo("Java 8");
		ebooks1.setDescriçao("Aprimoramento java");
		ebooks1.setFormato("PDF");
		ebooks1.setTamanho(30.5);
		ebooks1.setIsbn("872-345544-2244-22");
		ebooks1.setValor(100.00);
		ebooks1.setMarcaDagua("lançamento");
		ebooks1.mostrarDetalhes();	
		///////POPULANDO OS AUTORES///////////
				
		autorEbook.setNome("Paplo silva");
		autorEbook.setEmail("paplo132@yahoo.com.br");
		autorEbook.setCpf("091-002-234-24");
		ebooks1.mostrarDetalhes();
		autorEbook.mostrarDetalhes();
		
		
		
	}

}
