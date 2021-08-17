package tn.dari.spring.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import tn.dari.spring.domain.Announcement;
import tn.dari.spring.domain.AnnouncementType;

public interface AnnouncementRepository extends CrudRepository<Announcement, Integer>{
	
	
	public List<Announcement> findByEstateType(String estateType);
	public List<Announcement> findByLocation(String location);
	public List<Announcement> findByPrice(double price);
	public List<Announcement> findBySurface(double surface);
	public List<Announcement> findByNumberOfRooms(int numberOfRooms);
	public List<Announcement> findByNumberOfRoomsGreaterThan(int numberOfRooms);
	public List<Announcement> findByNumberOfRoomsLessThan(int numberOfRooms);
	public List<Announcement> findByVerifiedTrue();
	public List<Announcement> findByVerifiedFalse();
//	public List<Announcement> findByArchivedTrue();
//	public List<Announcement> findByArchivedFalse();
//	public List<Announcement> findByType(AnnouncementType announcementType);
//	public List<Announcement> findByNumberOfFloors(int etage);
//	public List<Announcement> findByNumberOfFloorsGreaterThan(int etage);
//	public List<Announcement> findByNumberOfFloorsLessThan(int etage);
	
}
