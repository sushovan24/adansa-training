package com.entity;

import com.entity.Students;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-19T11:39:22")
@StaticMetamodel(Marks.class)
public class Marks_ { 

    public static volatile SingularAttribute<Marks, String> subject;
    public static volatile SingularAttribute<Marks, Integer> id;
    public static volatile SingularAttribute<Marks, Students> studId;
    public static volatile SingularAttribute<Marks, Integer> mark;

}