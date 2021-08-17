package tn.dari.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.domain.Announcement;
import tn.dari.spring.repository.AnnouncementRepository;
import tn.dari.spring.repository.AppUserRepository;
import tn.dari.spring.service.interfaces.AnnouncementService; 

import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

	@Autowired
	AnnouncementRepository annRep;
	 
	@Autowired
	AppUserRepository userRep;
	
	//returns list of announcements that are verified and still available
	
//	@Override
//	public List<Announcement> loadAllActive(){
//		List<Announcement> announcements = annRep.findByArchivedFalse();
//		announcements.removeIf(a -> a.getVerified()==false);
//		return announcements;
//	}
	
	@Override
	public List<Announcement> loadAnnounceByEstateType(String estateType) {
		return annRep.findByEstateType(estateType);
	}

	@Override
	public List<Announcement> loadAnnounceByPrice(double price) {
		return annRep.findByPrice(price);
	}

	@Override
	public List<Announcement> loadAnnounceBySurface(double surface) {
		return annRep.findBySurface(surface);
	}

	@Override
	public List<Announcement> loadAnnounceByNumberOfRooms(int numberOfRooms) {
		return annRep.findByNumberOfRooms(numberOfRooms);
	}

	/*
	@Override
	public int AddAnnouncement(Announcement announcement, int userId) {
		announcement.setUser(userRep.findByUserId(userId));
		annRep.save(announcement);
		announcementService.announcementPriceUpdate(announcement);
		return announcement.getAnnouncementId();
	}
	
	public void Update(Announcement announcement,int announcementId)   
	{  
		Announcement ann = annRep.findById(announcementId).get();
		announcement.setInterests(ann.getInterests());
		announcement.setNotifications(ann.getNotifications());
		announcement.setRentHistory(ann.getRentHistory());
		announcement.setSaleHistory(ann.getSaleHistory());
		announcement.setUser(ann.getUser());
		announcement.setUserHistory(ann.getUserHistory());
		announcement.setUsers(ann.getUsers());
		announcement.setAnnouncementId(announcementId);
		annRep.save(announcement);
		announcementService.announcementPriceUpdate(announcement);
	}  

	@Override
	public void DeleteAnnouncement(int id) {
		annRep.deleteById(id);
	}
	
	*/

	@Override
	public int countAnnouncements() {
		List<Announcement> announcements = (List<Announcement>) annRep.findAll();
		return announcements.size();
	}
	
	@Override
	public List<Announcement> loadAllAnnouncements() {
		return (List<Announcement>) annRep.findAll();
	}
	
	@Override
	public List<Announcement> loadVerifiedAnnouncements() {
		return (List<Announcement>) annRep.findByVerifiedTrue();
	}

	@Override
	public List<Announcement> loadNotVerifiedAnnouncements() {
		return (List<Announcement>) annRep.findByVerifiedFalse();
	}

	@Override
	public List<Announcement> loadAnnounceByLocation(String location) {
		return (List<Announcement>) annRep.findByLocation(location);
	}

	@Override
	public void Update(Announcement announcement, int announcementId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int AddAnnouncement(Announcement announcement, int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void DeleteAnnouncement(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Announcement> loadAllActive() {
		// TODO Auto-generated method stub
		return null;
	}




}
