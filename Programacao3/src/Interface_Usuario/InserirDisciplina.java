package Interface_Usuario;

import Repositorio.*;

import javax.swing.*;

import ModeloUsuario.*;

public class InserirDisciplina {
	
public static void main(String [] args){
		
		
		Disciplina d = new Disciplina();
		
		String cod_disciplina = JOptionPane.showInputDialog("Informe o Cod Da Diciplina");
		d.setCod_disciplina(cod_disciplina);
		
		String nome_disciplina = JOptionPane.showInputDialog("Informe o Nome da Disciplina");
		d.setNome_disciplina(nome_disciplina);
		
		String curso_disciplina = JOptionPane.showInputDialog("Informe o Curso da Disciplina");
		d.setCurso_disciplina(curso_disciplina);
				
		try{
			CadastraDisciplina.SalvarDisciplina(d);
			JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
			
		} catch (Exception e){
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}	
	}	

}
