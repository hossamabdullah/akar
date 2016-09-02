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
@Table(name="users"
    ,catalog="akar"
)
public class User extends AbstractEntity  implements java.io.Serializable {


     private int id;
     private String username;
     private String password;
     private String email;
     private String profilePicture;
     private boolean isAdmin;
     private Set<Akar> akarsForReviewer = new HashSet<Akar>(0);
     private Set<Akar> akarsForOwner = new HashSet<Akar>(0);

    public User() {
    }

	
    public User(int id, String username, String password, String email, String profilePicture, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.profilePicture = profilePicture;
        this.isAdmin = isAdmin;
    }
    public User(int id, String username, String password, String email, String profilePicture, boolean isAdmin, Set<Akar> akarsesForReviewer, Set<Akar> akarsesForOwner) {
       this.id = id;
       this.username = username;
       this.password = password;
       this.email = email;
       this.profilePicture = profilePicture;
       this.isAdmin = isAdmin;
       this.akarsForReviewer = akarsesForReviewer;
       this.akarsForOwner = akarsesForOwner;
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

    
    @Column(name="username", nullable=false)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="profile picture", nullable=false)
    public String getProfilePicture() {
        return this.profilePicture;
    }
    
    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    
    @Column(name="is_admin", nullable=false)
    public boolean isIsAdmin() {
        return this.isAdmin;
    }
    
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="reviewer")
    public Set<Akar> getAkarsForReviewer() {
        return this.akarsForReviewer;
    }
    
    public void setAkarsForReviewer(Set<Akar> akarsesForReviewer) {
        this.akarsForReviewer = akarsesForReviewer;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="owner")
    public Set<Akar> getAkarsForOwner() {
        return this.akarsForOwner;
    }
    
    public void setAkarsForOwner(Set<Akar> akarsesForOwner) {
        this.akarsForOwner = akarsesForOwner;
    }




}


