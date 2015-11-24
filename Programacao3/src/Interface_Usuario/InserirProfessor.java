package Interface_Usuario;

import Repositorio.*;

import javax.swing.*;

import ModeloUsuario.*;

public class InserirProfessor {
	
public static void main(String [] args){
		
		
		Professor p = new Professor();
		
		String nome_prof = JOptionPane.showInputDialog("Informe o Nome do Professor");
		p.setNome_prof(nome_prof);
		
		String cpf_prof = JOptionPane.showInputDialog("Informe o Cpf do Professor");
		p.setCpf_prof(cpf_prof);
		
		String turno_prof = JOptionPane.showInputDialog("Informe o Turno do Professor");
		p.setTurno_prof(turno_prof);
		
		String especialização = JOptionPane.showInputDialog("Informe a Especialização do Professor");
		p.setEspecialização(especialização);
		
		String sexo_prof = JOptionPane.showInputDialog("Informe o Sexo do Professor");
		p.setSexo_prof(sexo_prof);
		
		try{
			CadastroProfessor.SalvarProfessor(p);
			JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
			
		} catch (Exception e){
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}	
	}	

}
