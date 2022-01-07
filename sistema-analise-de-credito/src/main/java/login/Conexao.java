//package login;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class Conexao {
//
//public static Connection getConexao() {
//		
//		String connectionURL = "jdbc:mysql://localhost:3306/bancocliente";
//		String user = "root";
//		String password = "";
//		
//		try {
//			return DriverManager.getConnection(connectionURL, user, password);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//						
//		}
//		return null;
//		
//	}
//
//public static void closeConnection(Connection connection, PreparedStatement stmt, ResultSet rs) {
//	try {
//		if(connection != null) 
//			connection.close();
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//	}
//	
//}
//
//}
