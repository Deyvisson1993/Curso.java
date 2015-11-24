package br.com.livrariaa;

public class Autor {
	
	private String nome;
	private String email;
	private String cpf;
	

	public void mostrarDetalhes(){
		System.out.println("Mostra detalhes do Autor");
		System.out.println("Nome do Autor: "+ nome);
		System.out.println("Email do Autor: "+  email);
		System.out.println("CPF do Autor: " + cpf);
		System.out.println("");
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
