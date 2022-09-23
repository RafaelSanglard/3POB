package br.nom.belo.marcio.agendatel.factory;
import java.sql.*;
public class ConnectionFactory 
{
	//nome
	private static final String USERNAME = "root";
	
	//senha
	private static final String PASSWORD = "";
	
	//path, porta, nome do bd
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/agenda";
	//"jbdc:mysql://localhost:8080/agenda"
	//conexão
	
	public static Connection createConnectionToMySQL() throws Exception
	{
		//faz a JVM carregar a classe
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		return connection;
	}
	public void testaconn() throws Exception
	{
		Connection con = createConnectionToMySQL();
		if(con!=null) 
		{
			System.out.println("Sucesso");
			con.close();
		}
		
	}

	
	
	

}
