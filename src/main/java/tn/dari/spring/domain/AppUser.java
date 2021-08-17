package tn.dari.spring.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;


@Entity(name = "User")
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String firstName;
	private String lastName;
	public int getUserId() {
		return userId;
	}
	private String email;
	private String password;
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	@Temporal(TemporalType.DATE)
	private Date updatedAt;
	private String adress;
	private int phoneNumber;
	private boolean subscribed;
	private boolean verified;
	 
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "User_Role", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
	private Set<Role> roles;
	 
	@OneToMany(mappedBy = "user")
	private Set<Announcement> announcements;
	@OneToMany(mappedBy = "user")
	private Set<Media> media;
	 
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	 
	 
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	 
	 
	public Set<Announcement> getAnnouncements() {
		return announcements;
	}
	public void setAnnouncements(Set<Announcement> announcements) {
		this.announcements = announcements;
	}
	public Set<Media> getMedia() {
		return media;
	}
	public void setMedia(Set<Media> media) {
		this.media = media;
	}
	public AppUser(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	// public int getUserId() {
	//	return userId;
	// }
	
	
}
