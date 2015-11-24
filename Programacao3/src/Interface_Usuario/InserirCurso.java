package Interface_Usuario;

import Repositorio.*;

import javax.swing.*;

import ModeloUsuario.*;


public class InserirCurso {
	
public static void main(String [] args){
		
		
		Curso c = new Curso();
		
		String nome_curso = JOptionPane.showInputDialog("Informe o Nome do Curso");
		c.setNome_curso(nome_curso);
		
		String turno_curso = JOptionPane.showInputDialog("Informe o Turno do Curso");
		c.setTurno_curso(turno_curso);
		
		
		
		try{
			CadastroCurso.SalvarCurso(c);
			JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
			
		} catch (Exception e){
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}	
	}	
}
