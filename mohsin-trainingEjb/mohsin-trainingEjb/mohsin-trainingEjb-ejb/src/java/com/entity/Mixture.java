package com.entity;

import java.util.Objects;

public class Mixture {
  private int studId;
  private String studName;
  private String mobile;
  private String subject;
  private int marks;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Mixture{" + "studId=" + studId + ", studName=" + studName + ", mobile=" + mobile + ", subject=" + subject + ", marks=" + marks + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.studId;
        hash = 97 * hash + Objects.hashCode(this.studName);
        hash = 97 * hash + Objects.hashCode(this.mobile);
        hash = 97 * hash + Objects.hashCode(this.subject);
        hash = 97 * hash + this.marks;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mixture other = (Mixture) obj;
        if (this.studId != other.studId) {
            return false;
        }
        if (this.marks != other.marks) {
            return false;
        }
        if (!Objects.equals(this.studName, other.studName)) {
            return false;
        }
        if (!Objects.equals(this.mobile, other.mobile)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        return true;
    }
}
