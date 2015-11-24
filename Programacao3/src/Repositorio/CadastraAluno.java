package Repositorio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import javax.swing.*;
import ModeloUsuario.*;

public class CadastraAluno {
	
public static void SalvarAluno(Aluno aluno) throws Exception{
		
	Connection conn = null;
		PreparedStatement pstmt = null;
		conn = conexao.getConexeao();
		String SQL = "INSERT INTO ALUNO(NOME_ALUNO,TURNO_ALUNO, SEXO_ALUNO, IDADE_ALUNO) VALUES (?,?,?,?)";
		
		pstmt = conn.prepareStatement(SQL);
		
		pstmt.setString(1, aluno.getNome_aluno());
		pstmt.setString(2, aluno.getTurno_aluno());
		pstmt.setString(3, aluno.getSexo_aluno());
		pstmt.setString(4, aluno.getIdade_aluno());
		pstmt.executeUpdate();
		pstmt.close();
		
	}

	public static List<Aluno> listarAluno() throws Exception{
	
	List<Aluno> listarAluno = null;
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	conn = conexao.getConexeao();
	ResultSet result = null;
	String SQL = "SELECT * FROM ALUNO";
	
	pstmt = conn.prepareStatement(SQL);
	result = pstmt.executeQuery();
	listarAluno = new ArrayList<Aluno>();
	
	while (result.next()) {
		
		Aluno a = new Aluno();
		a.setCod_aluno(result.getInt("Cod_aluno"));
		a.setNome_aluno(result.getString("Nome_aluno"));
		a.setTurno_aluno(result.getString("Turno_aluno"));
		a.setSexo_aluno(result.getString("Sexo_aluno"));
		a.setIdade_aluno(result.getString("Idadealuno"));
		
		listarAluno.add(a);
					
	}
	
	((ResultSet) listarAluno).close();
	return listarAluno;
	
	}
}



