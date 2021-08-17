package tn.dari.spring.service.interfaces;

import java.util.List;

import tn.dari.spring.domain.Announcement; 

public interface AnnouncementService {
	
	public void Update(Announcement announcement,int announcementId);
	public int AddAnnouncement(Announcement announcement, int userId);
	public void DeleteAnnouncement(int id);
	public int countAnnouncements();
	public List<Announcement> loadAnnounceByEstateType(String estateType);
	public List<Announcement> loadAnnounceByLocation(String location);
	public List<Announcement> loadAnnounceByPrice(double price);
	public List<Announcement> loadAnnounceBySurface(double surface);
	public List<Announcement> loadAnnounceByNumberOfRooms(int numberOfRooms);
	public List<Announcement> loadAllAnnouncements();
	public List<Announcement> loadVerifiedAnnouncements();
	public List<Announcement> loadNotVerifiedAnnouncements();
	public List<Announcement> loadAllActive();
	
}
