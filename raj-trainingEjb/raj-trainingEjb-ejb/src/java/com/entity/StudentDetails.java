/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

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
 * @author DELL
 */
@Entity
@Table(name = "student_details", catalog = "training", schema = "")
@NamedQueries({
    @NamedQuery(name = "StudentDetails.findAll", query = "SELECT s FROM StudentDetails s")
    , @NamedQuery(name = "StudentDetails.findById", query = "SELECT s FROM StudentDetails s WHERE s.id = :id")
    , @NamedQuery(name = "StudentDetails.findByStudentId", query = "SELECT s FROM StudentDetails s WHERE s.studentId = :studentId")
    , @NamedQuery(name = "StudentDetails.findByMobile", query = "SELECT s FROM StudentDetails s WHERE s.mobile = :mobile")})
public class StudentDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "student_id")
    private Integer studentId;
    @Size(max = 45)
    @Column(name = "mobile")
    private String mobile;

    public StudentDetails() {
    }

    public StudentDetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        if (!(object instanceof StudentDetails)) {
            return false;
        }
        StudentDetails other = (StudentDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.StudentDetails[ id=" + id + " ]";
    }
    
}
