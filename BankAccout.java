import java.util.Scanner;

class SbiBank
{
	Scanner s =new Scanner(System.in);
	int f ;
	
	void information(String a, int b, double c)
	{
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                              Your Bank Information Is ");
		System.out.println("Name: " + a);
		System.out.println("Age: " + b);
		System.out.println("Salary: " + c);
		System.out.println("Your Total Amount Is : " + c);
	}
	
	void add()
	{
		System.out.println("-------------------------------------------------------------------------");
        System.out.print("Enter Privius payment: ");  
        int i = s.nextInt();
        
        System.out.println("How Much Monye Add in Account : ");  
        int e = s.nextInt();
        
        f = i+e;
        System.out.println("Your Total Balance is "+f);
	}
	
	void withdrow()
	{
		System.out.println("-------------------------------------------------------------------------");
        System.out.println("How Much Monye you want withdrow : ");  
        int e = s.nextInt();
		int z = f-e; 
	    System.out.println("-------------------------------------------------------------------------");
	    System.out.println("Your total money is : "+z);
	}
}
public class BankAccout 
{
	public static void main(String[] args) 
	{
		int a = 0;
		SbiBank b1 = new SbiBank();
		
		System.out.println("---------------------------- Banking Strated -----------------------------");
		Scanner sa =new Scanner(System.in);
		
		System.out.print("Enter your name: ");    
        String name = sa.next();   
                   
        System.out.print("Enter your age: ");  
        int i = sa.nextInt();  
          
        System.out.println("Enter your salary: ");  
        double d = sa.nextDouble();  
        
        b1.information(name,i,d);
        
        b1.add();
        
        b1.withdrow();
		
	}
}
