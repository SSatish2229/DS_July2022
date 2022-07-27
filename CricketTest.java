public class CricketTest {
	public static void main(String[] args) {

		
		
		
		Cricketer cricketer1 = new Cricketer('1', "Gautham",05);
		cricketer1.bat();
		
		Batting b = new Batsman('3', "Virat", 28);
		b.bat();
		b.hitSixer();
		b.hitFourRuns();
		
		
		Bowler bb = new Bowler('0', "Irfan", 55);
		bb.bowl();
		bb.howIsThat();
		
	}
}
abstract class Player extends Person
{
	public Player(char gender, String name, int age) {
		super(gender, name, age);
		// TODO Auto-generated constructor stub
	}

	abstract void play();
}

class Cricketer extends Player
{
	public Cricketer(char gender, String name, int age) {
		super(gender, name, age);
		// TODO Auto-generated constructor stub
	}
	void playCricket() {
		System.out.println("Playing cricket....");
	}
	public void bat() {
		// TODO Auto-generated method stub
		
	}
	void play() {
		System.out.println("Enjoying cricket.....");
	}
}

interface Batting
{
	void bat();
	int hitSixer();
	int hitFourRuns();
}
interface Bowling
{
	void bowl();
}
interface WicketKeeping
{
	void keepWicket();
}

class Team
{
	
}
class CricketTeam extends Team
{
	Cricketer cricketer1 = new Cricketer('1', "Gautham",05 );
	Cricketer cricketer2 = new Cricketer('2', "Sachin", 10);
	Cricketer cricketer3 = new Cricketer('3', "Virat", 28);
	Cricketer cricketer4 = new Cricketer('4', "Suresh", 48);
	Cricketer cricketer5 = new Cricketer('5', "Dhoni", 07);
	Cricketer cricketer6 = new Cricketer('6', "Jadeja", 88);
	Cricketer cricketer7 = new Cricketer('7', "Pandya", 44);
	Cricketer cricketer8 = new Cricketer('8', "Ashish", 15);
	Cricketer cricketer9 = new Cricketer('9', "patel", 22);
	Cricketer cricketer10 = new Cricketer('0', "Irfan", 55);
	Cricketer cricketer11 = new Cricketer('1', "Zahir", 75);
	
	
}

class Stadium
{
	
}

class CricketStadium
{
	CricketTeam teamIndia = new CricketTeam();
	CricketTeam teamAus =  new CricketTeam();
	
}

class Bat
{
	
}

class Batsman extends Cricketer implements Batting
{
	public Batsman(char gender, String name, int age) {
		super(gender, name, age);
		// TODO Auto-generated constructor stub
	}

	Bat b = new Bat(); //hasA
	
	public void bat() {
		System.out.println("The batsman is batting....");
	}
	
	public int hitSixer() {
		System.out.println("hitting sixer....");
		return 6;
	}
	
	public int hitFourRuns() {
		System.out.println("hitting...four runs...");
		return 4;
	}
	
}

class WicketKeeper extends Cricketer implements WicketKeeping
{
	public WicketKeeper(char gender, String name, int age) {
		super(gender, name, age);
		// TODO Auto-generated constructor stub
	}
	public void keepWicket() {
		System.out.println("Wicket keeper is keeping the wicket...");
	}
	public void stumpOut() {
		System.out.println("Stump out....");
	}
}
class Bowler extends Cricketer implements Bowling
{
	public Bowler(char gender, String name, int age) {
		super(gender, name, age);
		// TODO Auto-generated constructor stub
	}
	public void bowl() {
		System.out.println("Bowler is bowling...");
	}
	public void throwYorker() {
		System.out.println("throwing yorker....");
	}
	boolean howIsThat() {
		System.out.println("how is that??????");
		return true;
	}
}
interface Spinning
{
	void spin();
}

class Spinner extends Bowler implements Spinning
{
	public Spinner(char gender, String name, int age) {
		super(gender, name, age);
		// TODO Auto-generated constructor stub
	}

	public void spin() {
		System.out.println("Spinner is spinning....");
	}
}