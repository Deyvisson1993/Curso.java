package br.com.livraria.produtos;

public class LivroFisico extends Livro{
	
	private double taxaImpressao;

	public double getTaxaImpressao() {
		return taxaImpressao;
	}

	public void setTaxaImpressao(double taxaImpressao) {
		this.taxaImpressao = taxaImpressao;
	}
	
	

	@Override
	public boolean aplicaDescontoDe(double valor) {
		if (valor > 0.1){
			return false;
		}else{
		setValor(getValor() - (getValor() * valor));
		return true;
		}
	}
}
	

