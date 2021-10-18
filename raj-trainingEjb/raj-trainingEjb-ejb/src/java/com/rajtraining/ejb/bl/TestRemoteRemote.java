package com.rajtraining.ejb.bl;

import com.entity.Marks;
import com.entity.Mixture;
import com.entity.StudentDetails;
import com.entity.Students;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface TestRemoteRemote {

    void print(String msg);

    void createStudent(Students student);

    void saveStudentDetails(StudentDetails sd);

    void saveMarks(Marks marks);

    void getMixture(List<Mixture> mix);

    void findMarksDetails(int id);

    //void findMarksDetails(HashMap<Integer,Integer> map);
    void findStudents(int id);

    List<Students> fetchStudents();
    void findAllStudents();
    void findAllStudentsData();
    void findStudentsById(int id);
    void findStudentsByName(String name);
    void findStudentsByIddata(int id);
    void findStudentsByNamedata(String name);
    void findStudentsDataOrderbyNameAsc();
    void insertedByNameAsc();
}
