package com.rajdemo.entity;

import com.rajdemo.entity.Marks;
import com.rajdemo.entity.StudentDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-23T17:24:59")
@StaticMetamodel(Students.class)
public class Students_ { 

    public static volatile SingularAttribute<Students, String> password;
    public static volatile SingularAttribute<Students, String> studentName;
    public static volatile ListAttribute<Students, Marks> markList;
    public static volatile SingularAttribute<Students, Integer> id;
    public static volatile ListAttribute<Students, StudentDetails> sdList;

}