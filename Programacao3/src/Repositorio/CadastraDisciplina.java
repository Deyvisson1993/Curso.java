package Repositorio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;

import javax.swing.*;

import ModeloUsuario.*;

public class CadastraDisciplina {
	
public static void SalvarDisciplina(Disciplina disciplina) throws Exception{
		
		Connection conn = null;
			PreparedStatement pstmt = null;
			conn = conexao.getConexeao();
			String SQL = "INSERT INTO DISCIPLINA(COD_DISCIPLINA,NOME_DISCIPLINA,CURSO_DISCIPLINA)VALUES(?,?,?)";
			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, disciplina.getCod_disciplina());
			pstmt.setString(2, disciplina.getNome_disciplina());
			pstmt.setString(3, disciplina.getCurso_disciplina());
			
			pstmt.executeUpdate();
			pstmt.close();
			
		}

		public static List<Disciplina> listarDisciplina() throws Exception{
		
		List<Disciplina> listarDisciplina = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = conexao.getConexeao();
		ResultSet result = null;
		String SQL = "SELECT * FROM DISCIPLINA";
		
		pstmt = conn.prepareStatement(SQL);
		result = pstmt.executeQuery();
		listarDisciplina = new ArrayList<Disciplina>();
		
		while (result.next()) {
			
			Disciplina d = new Disciplina();
			d.setCod_disciplina(result.getString("Cod_disciplina"));
			d.setNome_disciplina(result.getString("Nome_disciplina"));
			d.setCurso_disciplina(result.getString("Curso_disciplina"));
			
			listarDisciplina.add(d);
						
		}
		((ResultSet) listarDisciplina).close();
		return listarDisciplina;
		
		}

}
