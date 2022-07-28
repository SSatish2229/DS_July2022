import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyFileReader
{
	FileInputStream fin;

	MyFileReader(String filename) 
	{
		System.out.println("Trying to open the file....");
		try 
		{
			fin = new FileInputStream(filename);
		} catch (FileNotFoundException e) 
		{
			System.out.println("Problem1 : "+e);
		}
		System.out.println("File is open...");
	}
	
	void readFileData() 
	{
		try 
		{
			byte b = (byte) fin.read(); //A bhishek - read 1st letter, ie A
			System.out.println("[");
			while(b!=-1) 
			{ 
				System.out.print((char)b);
				b = (byte) fin.read(); // read successive letters from pos 2
				Thread.sleep(10); //pause 100 ms
			}
			System.out.println("]");
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
	
	void closeTheFile() 
	{
		System.out.println("Trying to close the file....");
		try 
		{
			fin.close();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File is closed....");

	}
}

public class FileHandlingTest2 
{
	public static void main(String[] args) 
	{
				
		MyFileReader mfr1 = new MyFileReader("C:\\Users\\SJR6\\JavaCodeOnTraningTime\\FileHandlingTest\\A.txt");
		MyFileReader mfr2 = new MyFileReader("C:\\Users\\SJR6\\JavaCodeOnTraningTime\\FileHandlingTest\\B.txt");
		MyFileReader mfr3 = new MyFileReader("C:\\Users\\SJR6\\JavaCodeOnTraningTime\\FileHandlingTest\\C.txt");
		
		mfr1.readFileData();
		mfr2.readFileData();
		mfr3.readFileData();
		
		mfr1.closeTheFile();
		mfr2.closeTheFile();
		mfr3.closeTheFile();
	}
}
