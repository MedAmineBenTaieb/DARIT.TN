package tn.dari.spring.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Media {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mediaId;
	@Enumerated(EnumType.STRING)
	private MediaType mediaType;
	private String location;  //file_path
	@Temporal(TemporalType.DATE)
	private Date uploadAt;
	@ManyToOne
	private AppUser user;
	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MediaType getMediaType() {
		return mediaType;
	}
	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
	
	
	

}
