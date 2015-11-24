package Interface_Usuario;

import Repositorio.*;
import javax.swing.*;

import ModeloUsuario.*;


public class InserirAluno {
	
public static void main(String [] args){
		
		
		Aluno a = new Aluno();
				
		String nome_aluno = JOptionPane.showInputDialog("Informe o Nome do Aluno");
		a.setNome_aluno(nome_aluno);
		
		String turno_aluno = JOptionPane.showInputDialog("Informe o Turno do Aluno");
		a.setTurno_aluno(turno_aluno);
		
		String sexo_aluno = JOptionPane.showInputDialog("Informe o Sexo do Aluno");
		a.setSexo_aluno(sexo_aluno);
		
		String idade_aluno = JOptionPane.showInputDialog("Informe a Idade do Aluno");
		a.setIdade_aluno(idade_aluno);
		
		try{
			CadastraAluno.SalvarAluno(a);
			JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
			
		} catch (Exception e){
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}	
	}	
}
