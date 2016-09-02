package com.hossam.entities;
// Generated Sep 2, 2016 1:29:52 AM by Hibernate Tools 4.3.1


import com.hossam.persistence.abstractEntity.AbstractEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="akars"
    ,catalog="akar"
)
public class Akar extends AbstractEntity implements java.io.Serializable {


     private int id;
     private AkarType akarType;
     private User reviewer;
     private User owner;
     private int price;
     private int area;
     private Double locationLatitude;
     private Double locationLongitude;
     private String address;
     private boolean isActive;
     private int numOfRooms;
     private boolean isFurnished;
     private Date publishingDate;
     private boolean isInsideCompound;

    public Akar() {
    }

	
    public Akar(int id, AkarType akarType, User usersByReviewer, User usersByOwner, int price, int area, boolean isActive, int numOfRooms, boolean isFurnished, Date publishingDate, boolean isInsideCompound) {
        this.id = id;
        this.akarType = akarType;
        this.reviewer = usersByReviewer;
        this.owner = usersByOwner;
        this.price = price;
        this.area = area;
        this.isActive = isActive;
        this.numOfRooms = numOfRooms;
        this.isFurnished = isFurnished;
        this.publishingDate = publishingDate;
        this.isInsideCompound = isInsideCompound;
    }
    public Akar(int id, AkarType akarType, User usersByReviewer, User usersByOwner, int price, int area, Double locationLatitude, Double locationLongitude, String address, boolean isActive, int numOfRooms, boolean isFurnished, Date publishingDate, boolean isInsideCompound) {
       this.id = id;
       this.akarType = akarType;
       this.reviewer = usersByReviewer;
       this.owner = usersByOwner;
       this.price = price;
       this.area = area;
       this.locationLatitude = locationLatitude;
       this.locationLongitude = locationLongitude;
       this.address = address;
       this.isActive = isActive;
       this.numOfRooms = numOfRooms;
       this.isFurnished = isFurnished;
       this.publishingDate = publishingDate;
       this.isInsideCompound = isInsideCompound;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="type", nullable=false)
    public AkarType getAkarType() {
        return this.akarType;
    }
    
    public void setAkarType(AkarType akarType) {
        this.akarType = akarType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="reviewer", nullable=false)
    public User getReviewer() {
        return this.reviewer;
    }
    
    public void setReviewer(User usersByReviewer) {
        this.reviewer = usersByReviewer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="owner", nullable=false)
    public User getOwner() {
        return this.owner;
    }
    
    public void setOwner(User usersByOwner) {
        this.owner = usersByOwner;
    }

    
    @Column(name="price", nullable=false)
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    
    @Column(name="area", nullable=false)
    public int getArea() {
        return this.area;
    }
    
    public void setArea(int area) {
        this.area = area;
    }

    
    @Column(name="location_latitude", precision=22, scale=0)
    public Double getLocationLatitude() {
        return this.locationLatitude;
    }
    
    public void setLocationLatitude(Double locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    
    @Column(name="location_longitude", precision=22, scale=0)
    public Double getLocationLongitude() {
        return this.locationLongitude;
    }
    
    public void setLocationLongitude(Double locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    
    @Column(name="address")
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="is_active", nullable=false)
    public boolean isIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    
    @Column(name="num_of_rooms", nullable=false)
    public int getNumOfRooms() {
        return this.numOfRooms;
    }
    
    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    
    @Column(name="is_furnished", nullable=false)
    public boolean isIsFurnished() {
        return this.isFurnished;
    }
    
    public void setIsFurnished(boolean isFurnished) {
        this.isFurnished = isFurnished;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="publishing_date", nullable=false, length=19)
    public Date getPublishingDate() {
        return this.publishingDate;
    }
    
    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    
    @Column(name="is_inside_compound", nullable=false)
    public boolean isIsInsideCompound() {
        return this.isInsideCompound;
    }
    
    public void setIsInsideCompound(boolean isInsideCompound) {
        this.isInsideCompound = isInsideCompound;
    }




}


