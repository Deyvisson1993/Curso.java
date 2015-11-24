package Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.*;

public class conexao {
	
	public static Connection getConexeao() throws Exception{
		
		Connection conn = null;
			
	String url_conection = "jdbc:mysql://localhost:3306/escola";
	String usuario = "root";
	String senha ="8896";
	
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	
	
	return conn = DriverManager.getConnection(url_conection,usuario,senha);
		
	}
}
