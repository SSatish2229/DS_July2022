class Village
{
	float curent_hinjewadi =0, swarget = 40  ,katarj= 35;
	void besicInfo()
	{
		System.out.println("Curent_Location_is_hinjewadi : "+curent_hinjewadi);
		System.out.println("Swarget : "+swarget);
		System.out.println("Katarj : "+katarj);
		System.out.println("thay Are All SubVillage In Pune City");
		System.out.println("----------------------------------------------------------------------------");
	}
	
	void addVillageCalDist(String x , int y)
	{
		
		System.out.println("Curent_Location_is_hinjewadi : "+curent_hinjewadi);
		System.out.println("Swarget : "+swarget);
		System.out.println("Katarj : "+katarj);
		float newLocation = katarj+y;
		System.out.println("Your new Location Is"+x+" and Distance is "+newLocation);
		System.out.println("thay Are All SubVillage In Pune City");
		System.out.println("----------------------------------------------------------------------------");
	}
	
	float finalLocation(String x)
	{
		System.out.println("Curent_Location_is_hinjewadi : "+curent_hinjewadi);
		System.out.println("Swarget : "+swarget);
		System.out.println("Katarj : "+katarj);
		System.out.println("you goes to katarj and return to Hinjewadi than total distance is "+(katarj+katarj));

		System.out.println("Your new Location Is"+x+" and fanal location is "+curent_hinjewadi);
		System.out.println("----------------------------------------------------------------------------");
		return curent_hinjewadi;
	}
	
	String overAllInforamtion()
	{
		System.out.println("Thay Are All SubVillage In Pune City And Enjoy Your Todays Day...!");
		return "Hello Friend";
	}
}
public class Assignment1 
{
	public static void main(String[] args) 
	{
		Village cl = new Village();
		cl.besicInfo();
		cl.addVillageCalDist("Padmavati",5);
		cl.finalLocation("hinjavdi");
		cl.overAllInforamtion();
	}
}
