package Desktop;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import java.awt.BorderLayout;
import java.awt.Panel;

import ModeloUsuario.*;
import Interface_Usuario.*;
import Repositorio.*;

import javax.swing.*;


public class InterfaceGrafica {
	
	public static void main (String [] args){
			
		
		JFrame frame = new JFrame("Sistema Acadêmico");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		frame.setLocation(200,100);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		JMenuBar barraMenus = new JMenuBar();
		barraMenus.setBounds(0, 0, 410, 21);
		
		JMenu menuAluno = new JMenu("Aluno");
		JMenu menuCurso = new JMenu("Curso");
		JMenu menuDisciplina = new JMenu("Disciplina");
		JMenu menuProfessor = new JMenu("Professor");
		JMenu menuSemestre = new JMenu("Semestre");
		JMenuItem Sobre = new JMenuItem("Sobre");
		JMenuItem Sair = new JMenuItem("Sair");
		
		barraMenus.add(menuAluno);
		barraMenus.add(menuCurso);
		barraMenus.add(menuDisciplina);
		barraMenus.add(menuProfessor);
		barraMenus.add(menuSemestre);
		barraMenus.add(Sobre);
		barraMenus.add(Sair);
		
		// INTENS DA BARRA//////
		
		JMenuItem intemAlunoCadastra = new JMenuItem("Cadastrar");
		JMenuItem intemCursoCadastra = new JMenuItem("Cadastrar");
		JMenuItem intemDisciplinaCadastra = new JMenuItem("Cadastrar");
		JMenuItem intemProfessorCadastra = new JMenuItem("Cadastrar");
		JMenuItem intemSemestreCadastra = new JMenuItem("Cadastrar");
		
		menuAluno.add(intemAlunoCadastra);
		menuCurso.add(intemCursoCadastra);
		menuDisciplina.add(intemDisciplinaCadastra);
		menuProfessor.add(intemProfessorCadastra);
		menuSemestre.add(intemSemestreCadastra);
		
		frame.getContentPane().add(barraMenus);
		frame.setVisible(true);
		
		//////.....AÇÃO PARA O BOTÃO CADASTRA........////////////
	/////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////
		
		intemAlunoCadastra.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				// add o painel Cadastra Aluno.
		
				JDialog caixa = new JDialog(frame);
				caixa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				caixa.setBounds(350,300,300,150);
				caixa.setTitle("Cadastra Aluno");
				caixa.setModal(true);
				caixa.setResizable(false);
				
				JPanel painel = new JPanel();
				painel.setLayout(new GridLayout(5,4));
				caixa.getContentPane().add(painel);
				
				caixa.getContentPane().add(painel);
				
				JLabel lblNewLabel = new JLabel("Nome:");
				painel.add(lblNewLabel);
				
				JTextField textField_1 = new JTextField();
				painel.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("Turno:");
				painel.add(lblNewLabel_1);
				
				JTextField textField_2 = new JTextField();
				painel.add(textField_2);
				textField_2.setColumns(10);
				
				JLabel lblNewLabel_2 = new JLabel("Sexo:");
				painel.add(lblNewLabel_2);
				
				JTextField textField_3 = new JTextField();
				painel.add(textField_3);
				textField_3.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Idade:");
				painel.add(lblNewLabel_3);
				
				JTextField textField_4 = new JTextField();
				painel.add(textField_4);
				textField_4.setColumns(10);
				
////////////////.....AÇÃO PARA O BOTÃO CADASTRA.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				
				JButton btcadastra = new JButton("Cadastra");
				painel.add(btcadastra);
				
				btcadastra.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						String nome_aluno = textField_1.getText();
						String turno_aluno = textField_2.getText();
						String sexo_aluno = textField_3.getText();
						String idade_aluno = textField_4.getText();
						
						Aluno a = new Aluno();
						
						a.setNome_aluno(nome_aluno);
						a.setTurno_aluno(turno_aluno);
						a.setSexo_aluno(sexo_aluno);
						a.setIdade_aluno(idade_aluno);
						
						
						try{
							CadastraAluno.SalvarAluno(a);
						JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
							
						} catch (Exception b){
							
						
						}
						
						caixa.dispose();		
						
					}
				});
				
////////////////.....BOTÃO CANELAR.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				JButton btcancelar = new JButton("Cancelar");
				painel.add(btcancelar);
				caixa.dispose();
				
				btcancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
				int retorno = JOptionPane.showConfirmDialog
					(frame, "Tem Serteza que Deseja Cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (retorno == JOptionPane.YES_OPTION)
					caixa.dispose();
				
					}
				});
			
			caixa.setVisible(true);
			}
		});
		intemCursoCadastra.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				// add o painel Cadastra Cuso.
				
				JDialog caixa1 = new JDialog(frame);
				caixa1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				caixa1.setBounds(350,300,300,150);
				caixa1.setTitle("Cadastra Curso");
				caixa1.setModal(true);
				caixa1.setResizable(false);
				
				JPanel painel1 = new JPanel();
				painel1.setLayout(new GridLayout(3,3));
				caixa1.getContentPane().add(painel1);
				
				caixa1.getContentPane().add(painel1);
				
				JLabel lblNewLabel_4 = new JLabel("Nome Curso:");
				painel1.add(lblNewLabel_4);
				
				JTextField textField_5 = new JTextField();
				painel1.add(textField_5);
				textField_5.setColumns(10);
				
				JLabel lblNewLabel_5 = new JLabel("Turno Curso:");
				painel1.add(lblNewLabel_5);
				
				JTextField textField_6 = new JTextField();
				painel1.add(textField_6);
				textField_6.setColumns(10);
				
////////////////.....AÇÃO PARA O BOTÃO CADASTRA.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				
				JButton btcadastra1 = new JButton("Cadastra");
				painel1.add(btcadastra1);
				
				
				btcadastra1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						String  nome_curso = textField_5.getText();
						String turno_curso = textField_6.getText();
						
						
						Curso c = new Curso();
						
						c.setNome_curso(nome_curso);
						c.setTurno_curso(turno_curso);
						
						
						
						try{
							CadastroCurso.SalvarCurso(c);
						JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
							
						} catch (Exception b){
							
						
						}
						
						caixa1.dispose();		
						
					}
				});
				
////////////////.....BOTÃO CANELAR.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				JButton btcancelar2 = new JButton("Cancelar");
				painel1.add(btcancelar2);
				caixa1.dispose();
				
				btcancelar2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					int retorno = JOptionPane.showConfirmDialog
					(frame, "Tem Serteza que Deseja Cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (retorno == JOptionPane.YES_OPTION)
					caixa1.dispose();	
				
					}
				});
				caixa1.setVisible(true);
			}
		});
		
		intemDisciplinaCadastra.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				// add o painel Cadastra Disciplina.
		
				JDialog caixa2 = new JDialog(frame);
				caixa2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				caixa2.setBounds(350,300,300,150);
				caixa2.setTitle("Cadastra Disciplina");
				caixa2.setModal(true);
				caixa2.setResizable(false);
				
				JPanel painel2 = new JPanel();
				painel2.setLayout(new GridLayout(4,4));
				caixa2.getContentPane().add(painel2);
				
				caixa2.getContentPane().add(painel2);
				
				JLabel lblNewLabel5 = new JLabel("Cod Disciplina:");
				painel2.add(lblNewLabel5);
				
				JTextField textField_7 = new JTextField();
				painel2.add(textField_7);
				textField_7.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("Nome Disciplina:");
				painel2.add(lblNewLabel_6);
				
				JTextField textField_8 = new JTextField();
				painel2.add(textField_8);
				textField_8.setColumns(10);
				
				JLabel lblNewLabel_7 = new JLabel("Curso Disciplina:");
				painel2.add(lblNewLabel_7);
				
				JTextField textField_9 = new JTextField();
				painel2.add(textField_9);
				textField_9.setColumns(10);
				
////////////////.....AÇÃO PARA O BOTÃO CADASTRA.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				
				JButton btcadastra3 = new JButton("Cadastra");
				painel2.add(btcadastra3);
		

				btcadastra3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {



						String  cod_disciplina = textField_7.getText();
						String nome_disciplina = textField_8.getText();
						String curso_disciplina = textField_9.getText();


						Disciplina d = new Disciplina();

						d.setCod_disciplina(cod_disciplina);
						d.setNome_disciplina(nome_disciplina);
						d.setCurso_disciplina(curso_disciplina);


						try{
							CadastraDisciplina.SalvarDisciplina(d);
							JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");

						} catch (Exception b){


						}

						caixa2.dispose();		

					}
				});
				
////////////////.....BOTÃO CANELAR.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				
				JButton btcancelar4 = new JButton("Cancelar");
				painel2.add(btcancelar4);
				caixa2.dispose();
				
				btcancelar4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

			int retorno = JOptionPane.showConfirmDialog
			(frame, "Tem Serteza que Deseja Cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	if (retorno == JOptionPane.YES_OPTION)
		caixa2.dispose();	

}
});
	caixa2.setVisible(true);
}
});
		
		intemProfessorCadastra.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				// add o painel Cadastra Professor.
		
				JDialog caixa3 = new JDialog(frame);
				caixa3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				caixa3.setBounds(350,300,300,180);
				caixa3.setTitle("Cadastra Professor");
				caixa3.setModal(true);
				caixa3.setResizable(false);
				
				JPanel painel3 = new JPanel();
				painel3.setLayout(new GridLayout(6,6));
				caixa3.getContentPane().add(painel3);
				
				caixa3.getContentPane().add(painel3);
				
				JLabel lblNewLabel_8 = new JLabel("Nome Professor:");
				painel3.add(lblNewLabel_8);
				
				JTextField textField_10 = new JTextField();
				painel3.add(textField_10);
				textField_10.setColumns(10);
				
				JLabel lblNewLabel_9 = new JLabel("CPF Professor:");
				painel3.add(lblNewLabel_9);
				
				JTextField textField_11 = new JTextField();
				painel3.add(textField_11);
				textField_11.setColumns(10);
				
				JLabel lblNewLabel_10 = new JLabel("Turno Professor:");
				painel3.add(lblNewLabel_10);
				
				JTextField textField_1_1 = new JTextField();
				painel3.add(textField_1_1);
				textField_1_1.setColumns(10);
				
				JLabel lblNewLabel_11 = new JLabel("Especialização:");
				painel3.add(lblNewLabel_11);
				
				JTextField textField_12 = new JTextField();
				painel3.add(textField_12);
				textField_12.setColumns(10);
				
				JLabel lblNewLabel_12 = new JLabel("Sexo Professor:");
				painel3.add(lblNewLabel_12);
				
				JTextField textField_13 = new JTextField();
				painel3.add(textField_13);
				textField_13.setColumns(10);
				
////////////////.....AÇÃO PARA O BOTÃO CADASTRA.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				
				JButton btcadastra5 = new JButton("Cadastra");
				painel3.add(btcadastra5);
						

				btcadastra5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {



					String nome_prof = textField_10.getText();
					String cpf_prof = textField_11.getText();
					String turno_prof = textField_1_1.getText();
					String especialização = textField_12.getText();
					String sexo_prof = textField_13.getText();

					Professor p = new Professor();

					p.setNome_prof(nome_prof);
					p.setCpf_prof(cpf_prof);
					p.setTurno_prof(turno_prof);
					p.setEspecialização(especialização);
					p.setSexo_prof(sexo_prof);


					try{
						CadastroProfessor.SalvarProfessor(p);
					JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
					
					} catch (Exception b){
					
					
					}
					
					caixa3.dispose();		
					
					}
					});
									
									
				
////////////////.....BOTÃO CANELAR.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				
				JButton btcancelar6 = new JButton("Cancelar");
				painel3.add(btcancelar6);
				caixa3.dispose();
				
				btcancelar6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						int retorno = JOptionPane.showConfirmDialog
				(frame, "Tem Serteza que Deseja Cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (retorno == JOptionPane.YES_OPTION)
				caixa3.dispose();	

}
});
				caixa3.setVisible(true);
}
});
		
		
		intemSemestreCadastra.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				// add o painel Cadastra Semestre.
				
				JDialog caixa4 = new JDialog(frame);
				caixa4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				caixa4.setBounds(350,300,300,150);
				caixa4.setTitle("Cadastra Semestre");
				caixa4.setModal(true);
				caixa4.setResizable(false);
				
				JPanel painel4 = new JPanel();
				painel4.setLayout(new GridLayout(3,3));
				caixa4.getContentPane().add(painel4);
				
				caixa4.getContentPane().add(painel4);
				
				JLabel lblNewLabel_13 = new JLabel("Numero Semestre:");
				painel4.add(lblNewLabel_13);
				
				JTextField textField_14 = new JTextField();
				painel4.add(textField_14);
				textField_14.setColumns(10);
				
				JLabel lblNewLabel_14 = new JLabel("Ano Semestre:");
				painel4.add(lblNewLabel_14);
				
				JTextField textField_15 = new JTextField();
				painel4.add(textField_15);
				textField_15.setColumns(10);
				
				JButton btcadastra7 = new JButton("Cadastra");
				painel4.add(btcadastra7);
				
			////////////////.....AÇÃO PARA O BOTÃO CADASTRA.....////////////////////////////////
				//////////////////////////////////////////////////////////////////////
					
					btcadastra7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
					
					
					String  numero_semestre = textField_14.getText();
					String ano_semestre = textField_15.getText();
					
					
					Semestre s = new Semestre();
					
					s.setNumero_semestre(numero_semestre);
					s.setAno_semestre(ano_semestre);
					
					
					
					try{
						CadastroSemestre.SalvarSemestre(s);
					JOptionPane.showMessageDialog(null, "Registro gravado com Sucesso");
					
					} catch (Exception b){
					
					
					}
					
					caixa4.dispose();		
					
					}
					});
				
////////////////.....BOTÃO CANELAR.....////////////////////////////////
//////////////////////////////////////////////////////////////////////
				
				JButton btcancelar8 = new JButton("Cancelar");
				painel4.add(btcancelar8);
				caixa4.dispose();

				btcancelar8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					int retorno = JOptionPane.showConfirmDialog
					(frame, "Tem Serteza que Deseja Cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (retorno == JOptionPane.YES_OPTION)
					caixa4.dispose();	
					}
				});
				caixa4.setVisible(true);
			}
		});
		
////////////////AÇAO PARA O BOTAO SAIR E SOBRE 
		Sair.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
               int retorno = JOptionPane.showConfirmDialog(frame, "Tem serteza que deseja sair?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (retorno == JOptionPane.YES_OPTION)
					System.exit(0);			
			}
			});
		
		Sobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int retorno = JOptionPane.showConfirmDialog(frame, "Programa Desenvolvido Por: Deyvisson Mendes De Araujo", "Sobre o Sistema ",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
										
			}
		});
	 }

}
