import java.util.Scanner;

public class Bank 
{	
	public void display( String a, int b, double c)
	{
		System.out.println("Name: " + a);
		System.out.println("Age: " + b);
		System.out.println("Salary: " + c);
	}
	public static void main(String[] args) 
	{
		System.out.println(":::::::: Banking Strated ::::::::");
		Scanner sa =new Scanner(System.in);
		
		System.out.print("Enter your name: ");    
        String name = sa.next();   
                   
        System.out.print("Enter your age: ");  
        int i = sa.nextInt();  
          
        System.out.print("Enter your salary: ");  
        double d = sa.nextDouble();  
        
        Bank ba = new Bank();
        ba.display(name,i,d);
        
	}
}
