package com.model.personal.dto;
// Generated Jun 18, 2013 3:23:07 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * District generated by hbm2java
 */
@Entity
@Table(name="district"
    ,catalog="km"
)
public class District  implements java.io.Serializable {


     private Integer did;
     private String name;

    public District() {
    }

    public District(String name) {
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="did", unique=true, nullable=false)
    public Integer getDid() {
        return this.did;
    }
    
    public void setDid(Integer did) {
        this.did = did;
    }
    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


