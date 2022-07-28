import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileCharacterBasedTest 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Trying to open the file....");
			FileReader fin = new FileReader("C:\\Users\\SJR6\\JavaCodeOnTraningTime\\FileHandlingTest\\C.txt");
			System.out.println("File is open...");
			
			int i =  fin.read(); //A bhishek - read 1st letter, ie A
			
			System.out.println("[");
			while(i!=-1) 
			{
				System.out.print((char)i);
				i = fin.read(); // read successive letters from pos 2
				Thread.sleep(1000); //pause 100 ms
			}
			System.out.println("]");

			System.out.println("Trying to close the file....");
			fin.close();
			System.out.println("File is closed....");
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Problem1 : "+e);
		} 
		catch (IOException e) 
		{
			System.out.println("Problem2 : "+e);
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Problem3 : "+e);
		}
		
	
	}
}
