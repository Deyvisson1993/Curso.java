package br.com.livraria.produtos;
import br.com.livrariaa.*;
import br.com.produto.*;


public class Revista implements Produto {
	
	private String titulo;
	private String descri�ao;
	private double valor;
	private String editora;  //Composi��o da class Editora
	
	
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescri�ao() {
		return descri�ao;
	}
	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
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
