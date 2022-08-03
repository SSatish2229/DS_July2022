import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudent 
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
			
			System.out.println("trying to make a Prepared statment");
			PreparedStatement pst = conn.prepareStatement("UPDATE STUDENT1 SET StudentNAME=?, Birthdate=?, Physics=?, Chemistry=?, Maths=?, Total=?, Grade=? WHERE RolllNumber=?");
			System.out.println("Prepared Statement created : "+pst);
					
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter Student Roll Number : ");
			int eno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from student1 where RolllNumber="+eno);
			
			if(rs.next()) 
			{
			
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter Student name   : ");
				String ename = scan2.next();
				
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter Student Birthday  : ");
				String esal = scan3.next();
				
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter physics Mark");
				int physics = scan4.nextInt();
				
				Scanner scan5 = new Scanner(System.in);
				System.out.println("Enter Chemistry Mark");
				int chemistry = scan5.nextInt();
				
				Scanner scan6 = new Scanner(System.in);
				System.out.println("Enter Maths Mark");
				int maths = scan6.nextInt();
				
				int total = physics+chemistry+maths;
				
				Scanner scan7 = new Scanner(System.in);
				System.out.println("Enter Grade");
				String grade = scan7.next();
				
				pst.setInt(1, eno);
				pst.setString(2, ename);
				pst.setString(3, esal);
				pst.setInt(4, physics);
				pst.setInt(5, chemistry);
				pst.setInt(6, maths);
				pst.setInt(7, total);
				pst.setString(8, grade);

				System.out.println("Trying to execute the prepared statement....");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, updated the records :..."+rows);				
			}
			else 
			{
				StudentAllReadyExitException ex = new StudentAllReadyExitException("This Student number does not exists : "+eno);
				throw ex;
			}
			pst.close();
			conn.close();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}	    
	}
}
