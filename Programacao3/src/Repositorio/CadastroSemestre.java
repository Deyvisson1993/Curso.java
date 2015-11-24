package Repositorio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;

import javax.swing.*;

import ModeloUsuario.*;

public class CadastroSemestre {
	
public static void SalvarSemestre(Semestre semestre) throws Exception{
		
		Connection conn = null;
			PreparedStatement pstmt = null;
			conn = conexao.getConexeao();
			String SQL = "INSERT INTO SEMESTRE(NUMERO_SEMESTRE,ANO_SEMESTRE)VALUES(?,?)";
			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, semestre.getNumero_semestre());
			pstmt.setString(2, semestre.getAno_semestre());
			
			pstmt.executeUpdate();
			pstmt.close();
			
		}

		public static List<Semestre> listarSemestre() throws Exception{
		
		List<Semestre> listarSemestre = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = conexao.getConexeao();
		ResultSet result = null;
		String SQL = "SELECT * FROM SEMESTRE";
		
		pstmt = conn.prepareStatement(SQL);
		result = pstmt.executeQuery();
		listarSemestre = new ArrayList<Semestre>();
		
		while (result.next()) {
			
			Semestre c = new Semestre();
			c.setNumero_semestre(result.getString("Numero_semestre"));
			c.setAno_semestre(result.getString("Ano_semestre"));
			
			
			listarSemestre.add(c);
						
		}
		((ResultSet) listarSemestre).close();
		return listarSemestre;
		
		}

}
