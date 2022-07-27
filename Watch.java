
public class Watch 
{
	public static void main(String args[])
	{
		SmartWatch sm = new SmartWatch();
		
	}
}

class SmartWatch extends Watch
{
	int prize;
	String brand;
	
	public SmartWatch(int prize, String brand)
	{
		
		this.prize = prize;
		this.brand = brand;
	}

	public SmartWatch() {
		// TODO Auto-generated constructor stub
	}
	
	
}

class Call 
{
	String mobileName;
	String Name;
	
	public Call(String mobileName, String name) 
	{
		this.mobileName = mobileName;
		Name = name;
	}	
	
	public void printCall()
	{
		System.out.println("Mobile Name : "+mobileName);
		System.out.println("Name : "+Name);
	}
		
}

class Message 
{
	String text;

	public Message(String text) 
	{
		this.text = text;
	}	
	
	void printMessage()
	{
		System.out.println("Text Message : "+text);	
	}
}

class GMail 
{
	String Destination;
	String Text;
	public GMail(String destination, String text) 
	{
		Destination = destination;
		Text = text;
	}	
	
	void printGMail()
	{
		System.out.println("Destination : "+Destination);
		System.out.println("Text : "+Text);
	}
}