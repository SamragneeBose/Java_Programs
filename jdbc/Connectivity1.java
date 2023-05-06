package jdbc;
import java.sql.*;

public class Connectivity1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			String conn_string="jdbc:mysql://localhost.test?"+"user=root&password=1234";
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1234");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery("SELECT * FROM Student");
			while(rs.next())
			{
				System.out.println();
			}
		}
		
		catch(SQLException e)
		{
			System.out.println("SQLException: "+e.getMessage());
			System.out.println("SQLState: "+e.getSQLState());
			System.out.println("VendorError: "+e.getErrorCode());
		}
		
		finally
		{
			if(rs!=null && stmt!=null)
			{
				rs.close();
				stmt.close();
				rs=null;
				stmt=null;
				
			}
			conn.close();
		}

	}

}
