/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.dp.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author susho
 */
@Entity
@Table(name = "students", catalog = "training", schema = "")
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findById", query = "SELECT s FROM Students s WHERE s.id = :id")
    , @NamedQuery(name = "Students.findByStudentName", query = "SELECT s FROM Students s WHERE s.studentName = :studentName")
    , @NamedQuery(name = "Students.findByPassword", query = "SELECT s FROM Students s WHERE s.password = :password")
    , @NamedQuery(name = "Students.findByDoilCol", query = "SELECT s FROM Students s WHERE s.doilCol = :doilCol")})
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
    @Size(max = 45)
    @Column(name = "doil_col")
    private String doilCol;

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

    public String getDoilCol() {
        return doilCol;
    }

    public void setDoilCol(String doilCol) {
        this.doilCol = doilCol;
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
        return "com.practice.dp.entity.Students[ id=" + id + " ]";
    }
    
}
