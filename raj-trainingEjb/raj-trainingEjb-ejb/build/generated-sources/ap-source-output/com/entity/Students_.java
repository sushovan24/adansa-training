package com.entity;

import com.entity.Marks;
import com.entity.StudentDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-19T11:39:22")
@StaticMetamodel(Students.class)
public class Students_ { 

    public static volatile SingularAttribute<Students, String> studentName;
    public static volatile SingularAttribute<Students, Integer> id;
    public static volatile ListAttribute<Students, StudentDetails> sdList;
    public static volatile ListAttribute<Students, Marks> mList;

}