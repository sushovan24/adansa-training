
package com.rajdemo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "marks", catalog = "training", schema = "")
@NamedQueries({
    @NamedQuery(name = "Marks.findAll", query = "SELECT m FROM Marks m")
    , @NamedQuery(name = "Marks.findById", query = "SELECT m FROM Marks m WHERE m.id = :id")
    , @NamedQuery(name = "Marks.findByStudId", query = "SELECT m FROM Marks m WHERE m.studId.id = :studId")
    , @NamedQuery(name = "Marks.findBySubject", query = "SELECT m FROM Marks m WHERE m.subject = :subject")
    , @NamedQuery(name = "Marks.findByMark", query = "SELECT m FROM Marks m WHERE m.mark = :mark")})
public class Marks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
//    @Basic(optional = false)
//    @NotNull
    @JoinColumn(name = "stud_id")
    @ManyToOne
    private Students studId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "subject")
    private String subject;
    @Column(name = "mark")
    private Integer mark;

    public Marks() {
    }

    public Marks(Integer id) {
        this.id = id;
    }

    public Marks(Integer id, Students studId, String subject) {
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

    public Students getStudId() {
        return studId;
    }

    public void setStudId(Students studId) {
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
        return "com.rajdemo.entity.Marks[ id=" + id + " ]";
    }
    
}
