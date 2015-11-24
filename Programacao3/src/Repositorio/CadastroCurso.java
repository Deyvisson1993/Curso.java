package Repositorio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;

import javax.swing.*;

import ModeloUsuario.*;

public class CadastroCurso {
	
	public static void SalvarCurso(Curso curso) throws Exception{
		
		Connection conn = null;
			PreparedStatement pstmt = null;
			conn = conexao.getConexeao();
			String SQL = "INSERT INTO CURSO(NOME_CURSO,TURNO_CURSO)VALUES(?,?)";
			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, curso.getNome_curso());
			pstmt.setString(2, curso.getTurno_curso());
			
			pstmt.executeUpdate();
			pstmt.close();
			
		}

		public static List<Curso> listarCurso() throws Exception{
		
		List<Curso> listarCurso = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = conexao.getConexeao();
		ResultSet result = null;
		String SQL = "SELECT * FROM CURSO";
		
		pstmt = conn.prepareStatement(SQL);
		result = pstmt.executeQuery();
		listarCurso = new ArrayList<Curso>();
		
		while (result.next()) {
			
			Curso c = new Curso();
			c.setNome_curso(result.getString("Nome_curso"));
			c.setTurno_curso(result.getString("Turno_curso"));
			
			
			listarCurso.add(c);
						
		}
		((ResultSet) listarCurso).close();
		return listarCurso;
		
		}

}
