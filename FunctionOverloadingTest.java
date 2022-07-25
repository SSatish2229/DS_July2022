
public class FunctionOverloadingTest 
{
	public static void main(String[] args) 
	{
		Bike b1 =new Bike();
		Bike b2 =new Bike("BMW",2000);
		Bike b3 =new Bike("BMW",2000,"Black");
		Bike b4 =new Bike("BMW",2000,"Black","Auto Senser");
		Bike b5 =new Bike("BMW",2000,"Black","Auto Senser",30);
	}
}

class Bike
{
	Bike() 
	{
		System.out.println("----------------There are one Bike is Available---------------- ");
	}
	Bike(String name, int prize) 
	{
		System.out.println("The bike name is  : "+name+" and prize "+prize);
	}
	Bike(String name, int prize, String color) 
	{
		System.out.println("The bike name is  : "+name+" prize "+prize+" and Available Color is "+color);
	}
	
	Bike(String name, int prize, String color , String feature) 
	{
		System.out.println("The bike name is  : "+name+"  prize "+prize+" Available Color "+color+ " and Feature is "+feature);
	}
	Bike(String name, int prize, String color , String feature,int average) 
	{
		System.out.println("The bike name is  : "+name+"  prize "+prize+" Available Color "+color+ "  Feature "+feature+" and Average "+average);
	}
}