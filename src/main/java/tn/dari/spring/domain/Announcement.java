package tn.dari.spring.domain;

import java.time.Instant;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Announcement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int announcementId;
	private String type;
	private String estateType;
	private String location;
	private double price;
	private String description;
	private double surface;
	private int etage;
	private int numberOfRooms;
	@Temporal(TemporalType.DATE)
	private Date dateCreated;
	@Temporal(TemporalType.DATE)
	private Date datePublished;
	private Boolean verified;
	@ManyToOne
	private AppUser user;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEstateType() {
		return estateType;
	}
	public int getAnnouncementId() {
		return announcementId;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDatePublished() {
		return datePublished;
	}
	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	
	public void setEstateType(String estateType) {
		this.estateType = estateType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String localtion) {
		this.location = localtion;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
	public Announcement() {
		super();
		verified=false;
		dateCreated=Date.from(Instant.now());
		
	}
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	



}
