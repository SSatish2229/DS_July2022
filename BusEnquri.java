
 import java.util.Scanner;

 class BusStation
 {
 	Scanner s =new Scanner(System.in);
 	int f ;
 	
 	void information(String a, int b, String c)
 	{
 		System.out.println("-------------------------------------------------------------------------");
 		System.out.println("                              Your Bus Information Is ");
 		System.out.println("Name: " + a);
 		System.out.println("Age: " + b);
 		System.out.println("Place: " + c);
 	}
 	
 	void perches()
 	{
 		System.out.println("-------------------------------------------------------------------------");
 		System.out.println("Sangli");
 		System.out.println("Pune");
 		System.out.println("Satara");
 		System.out.println("Mumbia");
 		System.out.println("Select one Place: ");  
        int i = s.nextInt();
         
        System.out.println(" Pay a Payment : ");  
        int e = s.nextInt();
         
 		System.out.println("Your place is: "+i);
 		System.out.println("your pay Payment is "+e);
 		
        System.out.println(" Thank You For select this place "+i);  
 	}
 	
 	/*void withdrow()
 	{
 		System.out.println("-------------------------------------------------------------------------");
         System.out.println("How Much Monye you want withdrow : ");  
         int e = s.nextInt();
 		int z = f-e; 
 	    System.out.println("-------------------------------------------------------------------------");
 	    System.out.println("Your total money is : "+z);
 	}*/
 }
 public class BusEnquri 
 {
 	public static void main(String[] args) 
 	{
 		int a = 0;
 		BusStation b1 = new BusStation();
 		
 		System.out.println("---------------------------- Bus Information -----------------------------");
 		Scanner sa =new Scanner(System.in);
 		
 		System.out.println("Enter your name: ");    
        String name = sa.next();   
                    
        System.out.println("Enter your age: ");  
        int i = sa.nextInt();  
           
        System.out.println("Enter your place: ");  
        String name1 = sa.next();  
         
        b1.information(name,i,name1);
         
        b1.perches();
         
       // b1.withdrow();
 		
 	}
 }
