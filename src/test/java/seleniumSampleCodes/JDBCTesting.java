package seleniumSampleCodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class JDBCTesting {

	public static void main(String[] args) throws SQLException {

	
		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadbt","root", "898989");
		
		Statement stmStatement = (Statement) con.createStatement();
		

	}

}
