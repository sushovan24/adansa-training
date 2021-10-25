package com.rajdemo.bl;

import com.rajdemo.da.TestLocal;
import com.rajdemo.entity.Marks;
import com.rajdemo.entity.StudentDetails;
import com.rajdemo.entity.Students;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean

public class TestRemote implements TestRemoteImpl {

    Students s;
    StudentDetails sd;
    Marks m;

    @EJB
    private TestLocal local;

    @Override
    public boolean saveUser(String name, String password, String subject, String mobile, int mark) {

        boolean f = false;

        List<StudentDetails> stdList = new ArrayList<>();
        List<Marks> markList = new ArrayList<>();

        String encryptPass = encriptPassword(password);

        s = new Students();

        sd = new StudentDetails();
        sd.setMobile(mobile);
        sd.setStudentId(s);
        stdList.add(sd);

        m = new Marks();
        m.setSubject(subject);
        m.setMark(mark);
        m.setStudId(s);
        markList.add(m);

        s.setMarkList(markList);
        s.setSdList(stdList);
        s.setStudentName(name);
        s.setPassword(encryptPass);

        boolean valid = local.saveUser(s);
        if (valid) {
            f = true;
        }

        return f;
    }

    @Override
    public Students logIn(String name, String password) {
        String encryptPass = encriptPassword(password);
        Students s = local.LogIn(name, encryptPass);
        return s;
    }

    @Override
    public List<Students> getLoginData(String name) {
        return local.getLoginData(name);
    }

    @Override
    public List<Students> findAllData() {
        List<Students> data = local.findAllData();
        return data;
    }

    public String encriptPassword(String password) {
        String encryptPass = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] b = md.digest(password.getBytes());
            BigInteger num = new BigInteger(1, b);
            encryptPass = num.toString(16);
            while (encryptPass.length() < 32) {
                encryptPass = "0" + encryptPass;
            }
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return encryptPass;
    }
}
