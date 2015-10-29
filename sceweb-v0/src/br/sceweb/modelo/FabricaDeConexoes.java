package br.sceweb.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	public String url = "jdbc:mysql://localhost/sceweb";
	
	public Connection getConnection(){
		
		
		try{
			return DriverManager.getConnection(url, "root", "");
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

}
