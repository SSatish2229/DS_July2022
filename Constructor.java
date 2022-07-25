
public class Constructor
{

	public static void main(String[] args) 
	{


		Employee e = new Employee("SATISH","DEVLOPER","ON CODEING");
		e.printEmployee();
		
		
		System.out.println("------------------------------------------------------------------");
		TeamLeader tl = new TeamLeader("JAYANT", "TEAM LEADER", "ALL EMPOLOYEE WORK WATCHING", "MONDAY", "ON INHERITANCE", "YES");
		tl.printStudent();

		
		System.out.println("------------------------------------------------------------------");
		CompanyFounder cf = new CompanyFounder("MANISH", "FOUNDER", "AS A LEADER", "SUNDAY", "ON REACHER", "YES", "DASSAULT SYSTEAMS", "ANDROID APPLICATION", "YES");
		cf.printEmployee();
	}

}

class Employee
{
	String name;
	String post;
	String access;
	
	
	public Employee( String name, String post,String access) 
	{
		super();
		this.name = name;
		this.post = post;
		this.access = access;
	}

	void printEmployee() {

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
	
	
	public TeamLeader(String name, String post, String access, String meetingDay, String workDistributed, String persenti) 
	{
		super(name, post, access);
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
	public CompanyFounder(String name, String post, String access, String meetingDay, String workDistributed, String persenti,String company,String projectDistributed,String salaryDistributed) 
	{
		super(name, post, access,meetingDay,workDistributed,persenti);
		this.company = company;
		this.projectDistributed = projectDistributed;
		this.salaryDistributed = salaryDistributed;
	}


	void printEmployee() 
	{
		super.printStudent();
		System.out.println("COMPANY: "+company);
		System.out.println("PROJECT DISTRIBUTED : "+projectDistributed);
		System.out.println("SALARY : "+salaryDistributed);
	}

}



