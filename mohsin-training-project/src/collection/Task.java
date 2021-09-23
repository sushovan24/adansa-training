
package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class TaskR1 {
 
    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "StudentInfo{" + "id=" + id + ", name=" + name + '}';
    }

    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter how many data you want to store");
//        int n = sc.nextInt();
//        System.out.println("Enter  number of student id and name");
        int i;

//        int sid;
//        String sname;
        Student1 s = new Student1();

//        for (i = 0; i < n; i++) {
//            sid = sc.nextInt();
//            sname = sc.next();
//            s.setId(sid);
//            s.setName(sname);
//            list.add(s);
//        }
        s.setId(12);
        s.setName("ram");
        list.add(s);
        System.out.println(list);

        Student1 s1 = new Student1();
        s1.setId(13);
        s1.setName("sonu");
        list.add(s1);
        System.out.println(list);

        Student1 s3 = new Student1();
        s3.setId(15);
        s3.setName("monu");
        list.add(s3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("  ");

    }
}