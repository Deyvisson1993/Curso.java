package Interface_Usuario;

import Repositorio.*;

import javax.swing.*;

import ModeloUsuario.*;

public class InserirSemestre {
	
public static void main(String [] args){
		
		
		Semestre s = new Semestre();
		
		String numero_semestre = JOptionPane.showInputDialog("Imforme o numero do Semestre");
		s.setNumero_semestre(numero_semestre);
		
		String ano_semestre = JOptionPane.showInputDialog("Informe o Nome do Aluno");
		s.setAno_semestre(ano_semestre);
				
		try{
			CadastroSemestre.SalvarSemestre(s);
			JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
			
		} catch (Exception e){
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}	
	}	

}
