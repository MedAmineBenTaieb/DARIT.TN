package tn.dari.spring.service.interfaces;


import java.util.List;
import java.util.Set;

import tn.dari.spring.domain.Announcement;
import tn.dari.spring.domain.AppUser;
import tn.dari.spring.domain.Profile;

public interface FavouriteAnnoucementService {
public void addToFavourite(int iduser,int idann);
public void deleteFromFavourite(int iduser,int idann);
public Set<Announcement> fetchFavouriteAnnouncements(int iduser);
public Set<Profile> fetchProfilesByFavouriteAnnouncement(int annId);
public List<AppUser> fetchUsersByFavouriteAnnouncement(int annId);
}
