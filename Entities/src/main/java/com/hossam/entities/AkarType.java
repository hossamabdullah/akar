package com.hossam.entities;
// Generated Sep 2, 2016 1:29:52 AM by Hibernate Tools 4.3.1


import com.hossam.persistence.abstractEntity.AbstractEntity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="akar_types"
    ,catalog="akar"
)
public class AkarType extends AbstractEntity  implements java.io.Serializable {


     private int id;
     private String name;
     private Set<Akar> akars = new HashSet<Akar>(0);

    public AkarType() {
    }

	
    public AkarType(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public AkarType(int id, String name, Set<Akar> akars) {
       this.id = id;
       this.name = name;
       this.akars = akars;
    }
   
    @Override
    @Id
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="akarType")
    public Set<Akar> getAkars() {
        return this.akars;
    }
    
    public void setAkars(Set<Akar> akars) {
        this.akars = akars;
    }




}


