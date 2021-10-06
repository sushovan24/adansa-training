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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
<<<<<<< HEAD
 * @author Md mohsin alam
=======
 * @author PANDIT
>>>>>>> 66d2e5401e8ce6df34c9fd711c051954270cf758
 */
@Entity
@Table(name = "marks", catalog = "training", schema = "")
@NamedQueries({
<<<<<<< HEAD
    @NamedQuery(name = "Marks.findAll", query = "SELECT m FROM Marks m")
    , @NamedQuery(name = "Marks.findById", query = "SELECT m FROM Marks m WHERE m.id = :id")
    , @NamedQuery(name = "Marks.findByStudId", query = "SELECT m FROM Marks m WHERE m.studId = :studId")
    , @NamedQuery(name = "Marks.findBySubject", query = "SELECT m FROM Marks m WHERE m.subject = :subject")
    , @NamedQuery(name = "Marks.findByMark", query = "SELECT m FROM Marks m WHERE m.mark = :mark")})
=======
    @NamedQuery(name = "Marks.findAll", query = "SELECT m FROM Marks m"),
    @NamedQuery(name = "Marks.findById", query = "SELECT m FROM Marks m WHERE m.id = :id"),
    @NamedQuery(name = "Marks.findByStudId", query = "SELECT m FROM Marks m WHERE m.studId = :studId"),
    @NamedQuery(name = "Marks.findBySubject", query = "SELECT m FROM Marks m WHERE m.subject = :subject"),
    @NamedQuery(name = "Marks.findByMark", query = "SELECT m FROM Marks m WHERE m.mark = :mark")})
>>>>>>> 66d2e5401e8ce6df34c9fd711c051954270cf758
public class Marks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
<<<<<<< HEAD
    @NotNull
    @Column(name = "stud_id")
    private int studId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
=======
    //@NotNull
    @Column(name = "stud_id")
    private int studId;
    @Basic(optional = false)
    //@NotNull
   // @Size(min = 1, max = 45)
>>>>>>> 66d2e5401e8ce6df34c9fd711c051954270cf758
    @Column(name = "subject")
    private String subject;
    @Column(name = "mark")
    private Integer mark;

    public Marks() {
    }

    public Marks(Integer id) {
        this.id = id;
    }

    public Marks(Integer id, int studId, String subject) {
        this.id = id;
        this.studId = studId;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
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
        if (!(object instanceof Marks)) {
            return false;
        }
        Marks other = (Marks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Marks[ id=" + id + " ]";
    }
    
}
