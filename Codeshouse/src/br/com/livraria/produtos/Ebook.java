
package br.com.livraria.produtos;

public class Ebook extends Livro{
	
	private String formato;
	private double tamanho;
	private String marcaDagua;
	
	
	public boolean aplicaDescontoDe(double valor){
		if (valor > 0.1){
			return false;
		}else{
		setValor(getValor() - (getValor() * valor));
		return true;
		}
	}
	public void mostrarDetalhes(){
		
		System.out.println("Titulo:" + getTitulo());
		System.out.println("Descrição:" + getDescriçao());
		System.out.println("Preço:" + getValor());
		System.out.println("ISBN:" +  getIsbn());
		System.out.println("Formato:" + getFormato());
		System.out.println("tamanho:" + getTamanho());
		System.out.println("MarcaDagua:" + getMarcaDagua());
		System.out.println("------------------");
		
		}
	
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarcaDagua() {
		return marcaDagua;
	}
	public void setMarcaDagua(String marcaDagua) {
		this.marcaDagua = marcaDagua;
	}	
}
