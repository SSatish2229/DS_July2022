import java.time.LocalDate;
public class OOPSConcepts 
{
	public static void main(String[] args) 
	{
		College c1 = new College("Walchand", 10000, 100, null, 70.23);
		System.out.println(" College Information "+c1);
	}
}

class College
{
	private String collegeName;
	private int totalStudent;
	private int totalTeacher;
	private LocalDate startingDate;
	private double totalArea;
	@Override
	public String toString() 
	{
		return "College [collegeName=" + collegeName + ", totalStudent=" + totalStudent + ", totalTeacher="
				+ totalTeacher + ", startingDate=" + startingDate + ", totalArea=" + totalArea + "]";
	}

	public College(String collegeName, int totalStudent, int totalTeacher, LocalDate startingDate, double totalArea) 
	{
		super();
		this.collegeName = collegeName;
		this.totalStudent = totalStudent;
		this.totalTeacher = totalTeacher;
		this.startingDate = startingDate;
		this.totalArea = totalArea;
	}
	
}