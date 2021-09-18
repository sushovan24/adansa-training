
package SortingInCollections;
import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>{
    String name;
    Student(String name){
        this.name=name;
    }
    
    @Override
    public int compareTo(Student person){
        return name.compareTo(person.name);
    }
}

public class TestSort2 {
    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("rohan"));
        list.add(new Student("sohan"));
        list.add(new Student("mohan"));
        list.add(new Student("jagmohan"));
        
        Collections.sort(list);
       
        list.forEach((s) -> {
            System.out.println(s.name);
        });
        
    }
}
