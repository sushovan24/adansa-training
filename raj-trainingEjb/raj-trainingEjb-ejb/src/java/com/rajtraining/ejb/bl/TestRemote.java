package com.rajtraining.ejb.bl;

import com.entity.Marks;
import com.entity.Mixture;
import com.entity.StudentDetails;
import com.entity.Students;
import com.rajtraining.ejb.da.TestLocalLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class TestRemote implements TestRemoteRemote {

    @EJB
    private TestLocalLocal local;

    @Override
    public void print(String msg) {
        try {
            System.out.println("stateless => " + local);
            local.printMessage(msg);
        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }

    }

    @Override
    public void createStudent(Students student) {
        local.createStudent(student);
    }

    @Override
    public void saveStudentDetails(StudentDetails sd) {
        local.addStudentDetails(sd);
    }

    @Override
    public void saveMarks(Marks marks) {
        local.saveMarks(marks);
    }

    @Override
    public void getMixture(List<Mixture> mix) {
        for (Mixture m : mix) {

        }
    }

    @Override
    public void findMarksDetails(int id) {
//        try {
        local.findMarksDetails(id);
//        } catch (NullPointerException ex) {
//            System.out.println(ex);
//        }

    }

    @Override
    public void findStudents(int id) {
        local.findStudents(id);
    }

    @Override
    public List<Students> fetchStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findAllStudents() {
        local.findAllStudents();
    }

    @Override
    public void findAllStudentsData() {
        local.findAllStudentsData();
    }

    @Override
    public void findStudentsById(int id) {
        local.findStudentsById(id);
    }

    @Override
    public void findStudentsByName(String name) {
        local.findStudentsByName(name);
    }

    @Override
    public void findStudentsByIddata(int id) {
        local.findStudentsByIddata(id);
    }

    @Override
    public void findStudentsByNamedata(String name) {
        local.findStudentsByNamedata(name);
    }

    @Override
    public void findStudentsDataOrderbyNameAsc() {
        local.findStudentsDataOrderByNameAsc();
    }

    @Override
    public void insertedByNameAsc() {
        local.insertedByNameAsc();
    }
}
