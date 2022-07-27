
public class Latebinding {

	public static void main(String[] args) 
	{
		Dassault ds = new Dassault();
		//ds.project();
		
		KPIT kp = new KPIT();
		kp.project();
		
		Wipro w = new Wipro();
		w.project();
		
		Dassault ref = w;
		ref.project();
		w.project();
	}

}

class Dassault 
{
	void project()
	{
		System.out.println("Many Project are available ...! ");
	}
}

class KPIT extends Dassault
{
	void project()
	{
		System.out.println("No any Projct available ...!");
	}
}


class Wipro extends Dassault
{
	void project()
	{
		System.out.println("1 or 2 Projct available ...!");
	}
}