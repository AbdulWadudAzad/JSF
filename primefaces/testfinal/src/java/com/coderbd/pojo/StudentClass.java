package com.coderbd.pojo;
// Generated Feb 1, 2018 4:35:58 PM by Hibernate Tools 4.3.1



/**
 * StudentClass generated by hbm2java
 */
public class StudentClass  implements java.io.Serializable {


     private int id;
     private String className;
     private String note;

    public StudentClass() {
    }

	
    public StudentClass(int id) {
        this.id = id;
    }
    public StudentClass(int id, String className, String note) {
       this.id = id;
       this.className = className;
       this.note = note;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getClassName() {
        return this.className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


