package Repositorio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;

import javax.swing.*;

import ModeloUsuario.Professor;

public class CadastroProfessor {
	
	public static void SalvarProfessor(Professor professor) throws Exception{
		
		Connection conn = null;
			PreparedStatement pstmt = null;
			conn = conexao.getConexeao();
			String SQL = "INSERT INTO PROF(NOME_PROF, CPF_PROF, TURNO_PROF, ESPECIALIZAÇÃO, SEXO_PROF)VALUES(?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,professor.getNome_prof());
			pstmt.setString(2, professor.getCpf_prof());
			pstmt.setString(3, professor.getTurno_prof());
			pstmt.setString(4, professor.getEspecialização());
			pstmt.setString(5, professor.getSexo_prof());
			pstmt.executeUpdate();
			pstmt.close();
			
		}

		public static List<Professor> listarProfessor() throws Exception{
		
		List<Professor> listarProfessor = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = conexao.getConexeao();
		ResultSet result = null;
		String SQL = "SELECT * FROM PROFESSOR";
		
		pstmt = conn.prepareStatement(SQL);
		result = pstmt.executeQuery();
		listarProfessor = new ArrayList<Professor>();
		
		while (result.next()) {
			
			Professor p = new Professor();
			p.setNome_prof(result.getString("Nome_prof"));
			p.setCpf_prof(result.getString("Cpf_prof"));
			p.setTurno_prof(result.getString("Turno_Prof"));
			p.setEspecialização(result.getString("Especialização"));
			p.setSexo_prof(result.getString("Sexo_prof"));
			listarProfessor.add(p);
						
		}
		((ResultSet) listarProfessor).close();
		return listarProfessor;
		
		}
	}
