
public class InheritanceTest 
{
	public static void main(String[] args) 
	{
		Father gf = new Father();
	}
}

class GrandFather
{
	public GrandFather() 
	{
		System.out.println("GrandFather");
	}
}

class Father extends GrandFather
{
	public Father() 
	{
		System.out.println("Father");
	}
}

class Child extends Father
{
	Child()
	{
		System.out.println("Child");
	}
}