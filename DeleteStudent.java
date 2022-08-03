import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteStudent 
{
	public static void main(String[] args) throws StudentAllReadyExitException
	{
		try 
		{
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter Student number to delete  : ");
			int eno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from Student1 where RolllNumber="+eno);
			
			if(rs.next()) 
			{
				
				System.out.println("trying to make a Prepared statment");
				PreparedStatement pst = conn.prepareStatement("DELETE FROM Student1 WHERE RolllNumber=?");
				System.out.println("Prepared Statement created : "+pst);
				pst.setInt(1, eno);
				
				System.out.println("Trying to execute the prepared statement....");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, deleted the records :..."+rows);
					
				
				pst.close();	
				conn.close();
				
			}
			else 
			{
				StudentAllReadyExitException empNotFndEx = new StudentAllReadyExitException("Student NOT found exception : "+eno);
				throw empNotFndEx;
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}   
	}
}