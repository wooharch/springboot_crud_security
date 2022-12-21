package com.kt.edu.thirdproject.employee.repository.sql;

public class QueryEmployeeSqls {

    // h2 db
    //  SELECT hibernate_sequence.nextval FROM  dual; 
    
    private String hibernate_nextval;
    
    @Value("${spring.profiles.active:}") 
    private String activeProfile;
    if activeProfile.equals("prd"){ // maria, mysql
       hibernate_nextval = "SELECT NEXTVAL(hibernate_sequence)";
    } else { // h2 db
       hibernate_nextval = "SELECT hibernate_sequence.nextval FROM  dual"; 
    }  
    
    /*
    public static final String RETV_NEXT_VAL="""
    SELECT NEXTVAL(hibernate_sequence);    
           """;
    */
    
    public static final String RETV_NEXT_VAL=hibernate_nextval;
}
