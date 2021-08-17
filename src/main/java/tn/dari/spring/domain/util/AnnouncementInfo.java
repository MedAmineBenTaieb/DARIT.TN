package tn.dari.spring.domain.util;

import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.Set;

import tn.dari.spring.domain.AnnouncementType; 

public class AnnouncementInfo {

	private int AnnouncementId;
	private AnnouncementType type;
	private String estateType;
	private String location;
	private double price;
	private String description;
	private double surface;
	private int numberOfFloors;
	private int numberOfRooms;
	private Date dateCreated;
	private Date datePublished;
	DoubleSummaryStatistics stats;
	 
	
	
	public DoubleSummaryStatistics getStats() {
		return stats;
	}
	public void setStats(DoubleSummaryStatistics stats) {
		this.stats = stats;
	}
	 
	public AnnouncementType getType() {
		return type;
	}
	public void setType(AnnouncementType type) {
		this.type = type;
	}
	public String getEstateType() {
		return estateType;
	}
	public void setEstateType(String estateType) {
		this.estateType = estateType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
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
	public AnnouncementInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnnouncementInfo(int AnnouncementId, AnnouncementType type, String estateType, String location, double price, String description,
			double surface, int numberOfFloors, int numberOfRooms, Date dateCreated, Date datePublished,
			DoubleSummaryStatistics stats) {
		super();
		this.AnnouncementId = AnnouncementId;
		this.type = type;
		this.estateType = estateType;
		this.location = location;
		this.price = price;
		this.description = description;
		this.surface = surface;
		this.numberOfFloors = numberOfFloors;
		this.numberOfRooms = numberOfRooms;
		this.dateCreated = dateCreated;
		this.datePublished = datePublished;
		this.stats = stats;
	 
	}
	public int getAnnouncementId() {
		return AnnouncementId;
	}
	public void setAnnouncementId(int announcementId) {
		AnnouncementId = announcementId;
	}
	
	
	
	

}
