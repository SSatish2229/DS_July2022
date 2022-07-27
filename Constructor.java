
public class Constructor
{

	public static void main(String[] args) 
	{


		Employee1 e = new Employee1("SATISH","DEVLOPER","ON CODEING");
		e.printEmployee1();
		
		
		System.out.println("------------------------------------------------------------------");
		TeamLeader tl = new TeamLeader('M', "JAYANT", 35, "TEAM LEADER", "ALL EMPOLOYEE WORK WATCHING", 'A', "MONDAY", "ON INHERITANCE", 0, "YES", null, null);
		tl.printStudent();

		
		System.out.println("------------------------------------------------------------------");
		CompanyFounder cf = new CompanyFounder('m', "MANISH", 30, "FOUNDER", "AS A LEADER", 'A', "SUNDAY", "ON REACHER", 0, "YES", "DASSAULT SYSTEAMS", "ANDROID APPLICATION", "YES", null, null);
		cf.printEmployee();
	}

}

class Employee1
{
	String name;
	String post;
	String access;
	
	
	public Employee1( String name, String post,String access) 
	{
		super();
		this.name = name;
		this.post = post;
		this.access = access;
	}

	void printEmployee1() {

		System.out.println("NAME   : "+name);
		System.out.println("Post   : "+post);
		System.out.println("Work   : "+access);
		
	}
}

class TeamLeader extends Employee
{

	String meetingDay;
	String workDistributed;
	String persenti;
	
	
	

	public TeamLeader(char gender, String name, int age, String college, String qualification, char grade,
			String company, String job, double salary, String meetingDay, String workDistributed, String persenti) {
		super(gender, name, age, college, qualification, grade, company, job, salary);
		this.meetingDay = meetingDay;
		this.workDistributed = workDistributed;
		this.persenti = persenti;
	}




	void printStudent() 
	{
		super.printEmployee();
		System.out.println("Meeting Day: "+meetingDay);
		System.out.println("Work Distributed   : "+workDistributed);
		System.out.println("Persenti  : "+persenti);

	}

}

class CompanyFounder extends TeamLeader
{
	String company;
	String projectDistributed;
	String salaryDistributed;
	


	public CompanyFounder(char gender, String name, int age, String college, String qualification, char grade,
			String company, String job, double salary, String meetingDay, String workDistributed, String persenti,
			String company2, String projectDistributed, String salaryDistributed) {
		super(gender, name, age, college, qualification, grade, company, job, salary, meetingDay, workDistributed,
				persenti);
		company = company2;
		this.projectDistributed = projectDistributed;
		this.salaryDistributed = salaryDistributed;
	}



	void printEmployee1() 
	{
		super.printStudent();
		System.out.println("COMPANY: "+company);
		System.out.println("PROJECT DISTRIBUTED : "+projectDistributed);
		System.out.println("SALARY : "+salaryDistributed);
	}

}



