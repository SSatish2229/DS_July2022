public class AbstractTest 
{
	public static void main(String[] args) 
	{		
			GeometricalShape gs ;			
			Circle2 c  = new Circle2();		
			Rectangle rect = new Rectangle();			
			Hexagon hex = new Hexagon();
			c.draw();
			rect.draw();
			hex.draw();		
	}
}

abstract class GeometricalShape  
{
	abstract void draw(); //no-body - partial - incomplete 
	abstract void calcArea();
	abstract void calcPerimeter();
}

class Hexagon extends GeometricalShape
{
	void draw() 
	{
		System.out.println("Drawing a hexagon..");
	}
	void calcArea() 
	{	
	}
	void calcPerimeter() 
	{	
	}
}

class Circle2 extends GeometricalShape
{
	void draw() 
	{
		System.out.println("Drawing a Circle...");
	}


	void calcArea() 
	{
		
	}


	void calcPerimeter() 
	{
		
	}
}
class Square extends GeometricalShape
{
	int side;

	
	void calcArea() 
	{
		
	}

	void calcPerimeter() 
	{
		
	}
	
	void draw() 
	{
		System.out.println("Drawing a sqaure....");
	}
}

class Rectangle extends Square //isA
{
	int side2;
}
class Doctor
{
	void diagnose() 
	{
		
	}
	void prescribe() 
	{ 
			
	}
}

class Surgeon extends Doctor
{		
	void doSurgery() 
	{
			
	}
	void diagnose() 
	{ 
			
	}		
}
class HeartSurgeon extends Surgeon
{
	void doHeartSurgery() 
	{ 
			
	}
}

	
abstract class MusicalInstrument
{
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}

class Guitar extends StringBasedMusicalInstrument
{
	void tuneStrings()
	{
		
	}
	void play() 
	{
		
	}
}
class ElectronicGuitar extends Guitar
{
	
}
	
	
	
	
	












