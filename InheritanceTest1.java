import java.time.LocalDate;

public class InheritanceTest1 
{

	public static void main(String[] args) 
	{

		AadharCard aadharCard1 = new AadharCard();
		AadharCard aadharCard2 = new AadharCard();
		AadharCard aadharCard3 = new AadharCard();
		
		PanCard pancard1 = new PanCard();
		PanCard pancard2 = new PanCard();
		PanCard pancard3 = new PanCard();
		
		aadharCard1.setAdhaarCard("1234 1234 1234", "Janet Robert Dsouza","Govt Of India", "Mumbai", LocalDate.of(2002, 12, 25), "8876345678");
		aadharCard2.setAdhaarCard("5234 6234 9234", "Robert Peter Dmello","Govt Of India", "Pune", LocalDate.of(2003, 11, 20), "7776342618");
		aadharCard3.setAdhaarCard("6234 7234 3254", "Julie Smith Pareira","Govt Of India", "Nasik", LocalDate.of(2004, 10, 21), "66876345178");
		
		pancard1.setPanCard("SYJHF3443D", "Sichit Kamble", "Govt Of India","Mumbai", LocalDate.of(2002, 12, 25));
		pancard1.setPanCard("HDHHD9843W", "Satish Jaykar", "Govt Of India","Pune", LocalDate.of(2000, 10, 28));
		pancard1.setPanCard("EJVFC0543R", "Sanket Patil", "Govt Of India","Nasik", LocalDate.of(2005, 04, 05));
		
		Person thePersonObj = new Person('F',"Janet", 25, aadharCard1,pancard1);
		thePersonObj.printPerson();
		System.out.println("-----------");
		
		
		Student theStudentObj = new Student('M', "Robert", 24, aadharCard2, "Bits Pilani", "MBA", 'A',pancard2);
		
		theStudentObj.printStudent();
		System.out.println("-----------");
		
		Employee empObj = new Employee('F', "Julie", 22, aadharCard3, "IIT", "Mtech", 'A', "Google", "Analyst", 25000,pancard3);
		empObj.printEmployee();
		
		
	}

}

class AadharCard
{
	String aadharNumber;
	String nameOnAdhaar;
	String issuedBy;
	String address;
	LocalDate birthdate;
	String phoneNumber;
	
	public void setAdhaarCard(String aadharNumber, String name, String issuedBy, String address, LocalDate birthdate, String phoneNumber) 
	{
		
		this.aadharNumber = aadharNumber;
		this.nameOnAdhaar = name;
		this.issuedBy = issuedBy;
		this.address = address;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
	}
	
	void printAdhaarCard() 
	{
		System.out.println("Aadhar Card : "+aadharNumber);
		System.out.println("Aadhar Name : "+nameOnAdhaar);
		System.out.println("Issued By   : "+issuedBy);
		System.out.println("Address     : "+address);
		System.out.println("Birthdate   : "+birthdate);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("-------");
	}
	
}

class PanCard
{
	String panNumber;
	String nameOnpanCard;
	String issuedBy;
	String address;
	LocalDate birthdate;
	
	public void setPanCard(String panNumber, String nameOnpanCard, String issuedBy, String address, LocalDate birthdate) 
	{
		
		this.panNumber = panNumber;
		this.nameOnpanCard = nameOnpanCard;
		this.issuedBy = issuedBy;
		this.address = address;
		this.birthdate = birthdate;

	}
	
	void printPanCard() 
	{
		System.out.println("Pan Card : "+panNumber);
		System.out.println("Pan Name : "+nameOnpanCard);
		System.out.println("Issued By   : "+issuedBy);
		System.out.println("Address     : "+address);
		System.out.println("Birthdate   : "+birthdate);
		System.out.println("-------");
	}
}
class Person
{
	char gender; //hasA 1
	String name; //hasA 2
	int age;     //hasA 3
	AadharCard aadharCard; //hasA 4 ( 5 )
	PanCard panCard;
   //PanCard
//VotingCard
	//DL
	
	public Person(char gender, String name, int age) 
	{
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	

	public Person(char gender, String name, int age, AadharCard aadharCard,PanCard panCard) 
	{
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.aadharCard = aadharCard;
		this.panCard = panCard;
	}


	void printPerson() 
	{
		System.out.println("GENDER : "+gender);
		System.out.println("AGE    : "+age);
		System.out.println("NAME   : "+name);
		if(aadharCard!=null || panCard!=null) 
		{
			aadharCard.printAdhaarCard();
			panCard.printPanCard();
			
		}
		else 
		{
			System.out.println("No Aadhar Card Info");
			System.out.println("No Pan Card Info");
		}
	}	
}

class Student extends Person //isA
{
//	3 fields from the Person  + 
	String college; //hasA
	String qualification; //hasA
	char grade; //hasA
	
	public Student(char gender, String name, int age, String college, String qualification, char grade) 
	{
		super(gender, name, age);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}
	
	public Student(char gender, String name, int age, AadharCard aadharCard, String college, String qualification,char grade,PanCard panCard) 
	{
		super(gender, name, age, aadharCard,panCard);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}



	void printStudent() 
	{
		super.printPerson();
		System.out.println("COLLEGE: "+college);
		System.out.println("QUAL   : "+qualification);
		System.out.println("GRADE  : "+grade);

	}
}

class Employee extends Student //isA
{
	String company; //hasA
	String job; //hasA
	double salary; //hasA
	
	public Employee(char gender, String name, int age, String college, String qualification, char grade, String company,String job, double salary) 
	{
		super(gender, name, age, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}
	
	public Employee(char gender, String name, int age, AadharCard aadharCard, String college, String qualification,char grade, String company, String job, double salary,PanCard panCard) 
	{
		super(gender, name, age, aadharCard, college, qualification, grade,panCard);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}

	void printEmployee() 
	{
		super.printStudent();
		System.out.println("COMPANY: "+company);
		System.out.println("JOB    : "+job);
		System.out.println("SALARY : "+salary);
	}
	
}


