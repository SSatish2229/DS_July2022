
public class HR extends EmployeeDetails1 {
	private int salary;
	private String performance;

	
	public void confidentialDetails(int s,String p) {
		this.salary=s;
		this.performance=p;
		System.out.println("salary=="+salary);
		System.out.println("performance=="+performance);
	}

	public static void main(String[] args) {
		HR hr =new HR();
		hr.confidentialDetails(5000,"good");
	}

}


public abstract class EmployeeDetails1 
{
	private String name;
	private int emp_ID;

	public void commonEmpDetaills()
	{
		System.out.println("Name"+name);
		System.out.println("emp_ID"+emp_ID);
	}
	public abstract void confidentialDetails(int s,String p);

}