package br.com.livraria.produtos;
import br.com.livrariaa.*;
import br.com.produto.*;


public class Revista implements Produto {
	
	private String titulo;
	private String descriçao;
	private double valor;
	private String editora;  //Composição da class Editora
	
	
	
	
	
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
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
	
	
	

}
