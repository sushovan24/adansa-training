package com.demoproject.entity;

import com.demoproject.entity.Marks;
import com.demoproject.entity.StudentDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-26T13:01:35")
@StaticMetamodel(Students.class)
public class Students_ { 

    public static volatile SingularAttribute<Students, String> password;
    public static volatile ListAttribute<Students, StudentDetails> stdentdetaillist;
    public static volatile SingularAttribute<Students, String> studentName;
    public static volatile ListAttribute<Students, Marks> sdmarks;
    public static volatile SingularAttribute<Students, Integer> id;

}