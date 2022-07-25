class MethodType
{
	void method1()
	{
		System.out.println("Method 1st type is called ");
		System.out.println("-----------------------------------");
	}
	
	void method2(int x, float y, double z)
	{
		System.out.println("Method 2nd type is called ");
		System.out.println("ID : "+x);
		System.out.println("Salary : "+y);
		System.out.println("Mobile Number : "+z);
		System.out.println("-----------------------------------");		
	}
	
	double method3(String x, int y, float z)
	{
		System.out.println("Method 3rd type is called ");
		System.out.println("Name : "+x);
		System.out.println("ID : "+y);
		System.out.println("Salary : "+z);
		System.out.println("-----------------------------------");	
		return z;
	}
	
	int method4()
	{
		System.out.println("Method 4th type is called ");
		System.out.println("-----------------------------------");
		return 12;
		
	}
}
public class FunctionTypeTest 
{	
	public static void main(String[] args) 
	{
		MethodType mt = new MethodType();
		mt.method1();
		mt.method2(52,10435453,615165.45);
		mt.method3("Satish", 1000, 1651656);
		mt.method4();
	}

}
