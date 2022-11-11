package com.kt.edu.thirdproject.employee.repository.sql;

public class QueryEmployeeSqls {

    // h2 db
    //  SELECT hibernate_sequence.nextval FROM  dual; 

    public static final String RETV_NEXT_VAL="""
    SELECT NEXTVAL(hibernate_sequence);    
           """;
}
