package br.sceweb.modelo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class FabricaDeConexoes {
public Connection getConnection(){
	String url="jdbc:mysql://localhost/sceweb";
	try{
		return (Connection) DriverManager.getConnection(url,"root","aluno");
	}catch(SQLException e){
		throw new RuntimeException(e);
	}
}
}
