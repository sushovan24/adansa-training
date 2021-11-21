package com.demoproject.entity;

import com.demoproject.bl.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Md mohsin alam
 */
@Entity
@Table(name = "rlb_vredis_map", catalog = "training", schema = "")
@NamedQueries({
    @NamedQuery(name = "RlbVredisMap.findAll", query = "SELECT r FROM RlbVredisMap r")
    , @NamedQuery(name = "RlbVredisMap.findById", query = "SELECT r FROM RlbVredisMap r WHERE r.id = :id")
    , @NamedQuery(name = "RlbVredisMap.findByVid", query = "SELECT r FROM RlbVredisMap r WHERE r.vid = :vid")
    , @NamedQuery(name = "RlbVredisMap.findByRedisId", query = "SELECT r FROM RlbVredisMap r WHERE r.redisId = :redisId")
    , @NamedQuery(name = "RlbVredisMap.findByAction", query = "SELECT r FROM RlbVredisMap r WHERE r.action = :action")
    , @NamedQuery(name = "RlbVredisMap.findByModType", query = "SELECT r FROM RlbVredisMap r WHERE r.modType = :modType")
    , @NamedQuery(name = "RlbVredisMap.findByStatus", query = "SELECT r FROM RlbVredisMap r WHERE r.status = :status")
    , @NamedQuery(name = "RlbVredisMap.findByDtCreate", query = "SELECT r FROM RlbVredisMap r WHERE r.dtCreate = :dtCreate")
    , @NamedQuery(name = "RlbVredisMap.findByCid", query = "SELECT r FROM RlbVredisMap r WHERE r.cid = :cid")
    , @NamedQuery(name = "RlbVredisMap.findBySegid", query = "SELECT r FROM RlbVredisMap r WHERE r.segid = :segid")})
public class RlbVredisMap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "vid")
    private Integer vid;
    @Size(max = 45)
    @Column(name = "redisId")
    private String redisId;
    @Size(max = 15)
    @Column(name = "action")
    private String action;
    @Size(max = 5)
    @Column(name = "mod_type")
    private String modType;
    @Column(name = "status")
    private Integer status;
    @Column(name = "dtCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCreate;
    @Column(name = "cid")
    private Integer cid;
    @Column(name = "segid")
    private Integer segid;
// constructur
    public RlbVredisMap(Integer id, Integer vid, String redisId, String action, String modType, Integer status, Date dtCreate, Integer cid, Integer segid) {
        this.id = id;
        this.vid = vid;
        this.redisId = redisId;
        this.action = action;
        this.modType = modType;
        this.status = status;
        this.dtCreate = dtCreate;
        this.cid = cid;
        this.segid = segid;
    }

    public RlbVredisMap() {
    }

    public RlbVredisMap(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getRedisId() {
        return redisId;
    }

    public void setRedisId(String redisId) {
        this.redisId = redisId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getModType() {
        return modType;
    }

    public void setModType(String modType) {
        this.modType = modType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(Date dtCreate) {
        this.dtCreate = dtCreate;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getSegid() {
        return segid;
    }

    public void setSegid(Integer segid) {
        this.segid = segid;
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
        if (!(object instanceof RlbVredisMap)) {
            return false;
        }
        RlbVredisMap other = (RlbVredisMap) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demoproject.bl.RlbVredisMap[ id=" + id + " ]";
    }

}
