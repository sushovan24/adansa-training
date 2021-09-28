

//Class:: Student [int id, String name];
//Insert different value in this class.
//add different value in List<Student>.
//Print this value...

        package collection;
	import java.util.*;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	public class Student1 {
	    private int id;
	    private String name;
	    private String course;
            
            public void studentDisplay()
            {

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public String getCourse()
	    {
	        return course;
	    }
	    public void setCourse(String course)
	    {
	        this.course =course;
	    }

	    @Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
		}    
                
	    //
	        List<Student1> list = new ArrayList<>();
//	      
	        int i;

	        Student1 s = new Student1();
	        s.setId(101);
	        s.setName("ram");
	        s.setCourse("java");
	        list.add(s);
	        System.out.println(list);

	        Student1 s1 = new Student1();
	        s1.setId(102);
	        s1.setName("Dinga");
	        s1.setCourse("adndroid");
	        list.add(s1);
	        System.out.println(list);

	        Student1 s3 = new Student1();
	        s3.setId(15);
	        s3.setName("dingi");
	        s3.setCourse("springboot");
	        list.add(s3);
	        System.out.println(list);
	        System.out.println(list.size());
	        System.out.println("  ");

	    }
      }
        
	    

	


