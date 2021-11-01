package com.demoproject.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students", catalog = "training", schema = "")
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findById", query = "SELECT s FROM Students s WHERE s.id = :id")
    , @NamedQuery(name = "Students.findByStudentName", query = "SELECT s FROM Students s WHERE s.studentName = :studentName")
    , @NamedQuery(name = "Students.findByPassword", query = "SELECT s FROM Students s WHERE s.password = :password")})
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "student_name")
    private String studentName;
    @Size(max = 45)
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "studentId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<StudentDetails> stdentdetaillist;

    public List<StudentDetails> getStdentdetaillist() {
        return stdentdetaillist;
    }

    public void setStdentdetaillist(List<StudentDetails> stdentdetaillist) {
        this.stdentdetaillist = stdentdetaillist;
    }

    @OneToMany(mappedBy = "studId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Marks> sdmarks;

    public List<Marks> getSdmarks() {
        return sdmarks;
    }

    public void setSdmarks(List<Marks> sdmarks) {
        this.sdmarks = sdmarks;
    }
    
    public Students() {
    }

    public Students(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demoproject.entity.Students[ id=" + id + " ]";
    }

    public void setSdList(List<StudentDetails> stdlist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
