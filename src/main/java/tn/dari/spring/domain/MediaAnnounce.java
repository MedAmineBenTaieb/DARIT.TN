package tn.dari.spring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MediaAnnounce {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private String extension;
	private String path;
	private String filename;
	@ManyToOne
	private Announcement announcement;
	public MediaAnnounce() {
		super();
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
}
