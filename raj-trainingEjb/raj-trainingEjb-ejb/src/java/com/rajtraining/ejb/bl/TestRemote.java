package com.rajtraining.ejb.bl;

import com.entity.Marks;
import com.entity.Mixture;
import com.entity.StudentDetails;
import com.entity.Students;
import com.rajtraining.ejb.da.TestLocalLocal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Stateless
public class TestRemote implements TestRemoteRemote {

    Students student;
    StudentDetails sdetail;
    Marks marks;

    String name;
    int mark;
    String subject;
    String mobile;

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
        List<StudentDetails> sdList = new ArrayList<>();
        List<Marks> markList = new ArrayList<>();
        for (Mixture m : mix) {
            name = m.getStudName();
            mobile = m.getMobile();
            mark = m.getMark();
            subject = m.getSubject();

            student = new Students();
            student.setName(name);

            sdetail = new StudentDetails();
            sdetail.setMobile(mobile);
            sdetail.setStudentId(student);
            sdList.add(sdetail);

            marks = new Marks();
            marks.setMark(mark);
            marks.setSubject(subject);
            marks.setStudId(student);
            markList.add(marks);

            student.setSdList(sdList);
            student.setmList(markList);
            local.createStudent(student);

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
        try {
            local.findAllStudents();
        } catch (Exception e) {
            System.out.println(e);
        }

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

    @Override
    public void deleteBlankName() {
        local.deleteBlankName();
    }

    @Override
    public void findCascadeStudentsById(int id) {
        local.findCascadeStudentsById(id);
    }

    @Override
    public void printmsg(String code, String name) {
        System.out.println("driven Bean Started for: ");
        TopicConnection tc = null;
        try {

            TopicConnectionFactory tcf = (TopicConnectionFactory) new InitialContext().lookup("jms/demoFactory");
            Topic topic = (Topic) new InitialContext().lookup("jms/demo");
            tc = tcf.createTopicConnection();
            TopicSession ts = tc.createTopicSession(false, 0);
            MessageProducer mp = ts.createProducer(topic);
//            TextMessage message = ts.createTextMessage();
//            message.setText(msg);
//            mp.send(message);

            HashMap map = new HashMap();
            map.put("c", code);
            map.put("n", name);
            ObjectMessage objmsg = ts.createObjectMessage();
            objmsg.setObject(map);
            mp.send(objmsg);

        } catch (JMSException | NamingException e) {
            System.out.println(e);
        } finally {
            if (tc != null) {
                try {
                    tc.close();
                } catch (JMSException ex) {
                    Logger.getLogger(TestRemote.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
