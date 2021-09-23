
package ArrayListToHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
//public class ArrayListHashMapConversion { 
class Student {
	private int studentId;
	private String  studentName;
	private int studentAge;
	public Student(Integer studentId, String studentName, int studentAge) 
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;

	}
	// for student id 
	public int getstudentId()
	{
		return studentId;
	}
	public void setstudentId()
	{
		this.studentId=studentId;
	}
	//for studentName
	public String getstudentName()
	{
		return studentName;
	}
	
	//for student age purpose 
	public void setstudentName()
	{
		this.studentName=studentName;
	}
	
	public int getstudentAge()
	{
		return studentAge;
	}
	public void setstudentAge()
	{
		this.studentAge=studentAge;
	}

}





