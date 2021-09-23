package ArrayListToHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// User define  class 
public class StudentDemo {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<Student>();
         students.add(new Student(101,"mohsin",24));
         students.add(new Student(101,"Raj kumar",22));
         students.add(new Student(101,"raju ",20));
         students.add(new Student(101,"rahul",29));
         students.add(new Student(101,"sonam",27));
         students.add(new Student(101,"priya",30));
         // map conten only key values like map.put(key, values)
         Student s1=new Student(11,"raj", 23);
         Student s2=new Student(12,"raj kumar", 20);
         Student s3=new Student(13,"mohsin", 24);
         Student s4=new Student(14,"dinga", 27);
         Map<Integer,Student> map=new HashMap<Integer,Student>();
         
         map.put(s1.getstudentId(), s1);
         map.put(s2.getstudentId(), s2);
         map.put(s3.getstudentId(), s3);
         map.put(s4.getstudentId(), s4);
         
         for(Map.Entry<Integer, Student> entry:map.entrySet()) {
        	 Student s=entry.getValue();
        	 System.out.println(entry.getKey()+" "+s.getstudentName()+" "+s.getstudentAge());
         }
         
         Student ss1=map.get(12);
         System.out.println(ss1.getstudentId()+" "+ss1.getstudentName()+" "+ss1.getstudentAge());
         //System.out.println(map);
         // eception handling
         try
         {
         Student ss2=map.get(3);
         System.out.println(ss2.getstudentId()+" "+ss2.getstudentName()+" "+ss2.getstudentAge());
         }
         catch(Exception e)
         {
        	 //System.out.println(e);
        	 System.out.println(" please correct key values");
         }
         
         List<Student> students1=new ArrayList<Student>();
         students1.add(new Student(101,"mohsin",24));
         students.add(new Student(101,"Raj kumar",22));
         students.add(new Student(101,"raju ",20));
         students.add(new Student(101,"rahul",29));
         students.add(new Student(101,"sonam",27));
         students.add(new Student(101,"priya",30));
         
         //map<Integer,List<Student>>
         //map.put(1,students)[[students],[students2]]
         //map.put(2, students2);
         
         
        
}
}
