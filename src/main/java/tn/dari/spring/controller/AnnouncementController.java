package tn.dari.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.domain.Announcement;
import tn.dari.spring.service.interfaces.AnnouncementService;

@RestController
@RequestMapping("/api")
public class AnnouncementController {
	@Autowired
	AnnouncementService annService;
	@PostMapping("/addAnnonce")
	public Announcement AddAnnounc(@RequestBody Announcement ann, @RequestParam("id") int userId){
		annService.AddAnnouncement(ann,userId);
		return ann;
	}
	
	@GetMapping("/getAnnonce")
	public List<Announcement> getAnn(){
		return annService.loadNotVerifiedAnnouncements();
	}
	
	@PutMapping("/updateAnnonce")
	public Announcement Update(@RequestBody Announcement ann, @RequestParam("id") int announcementId){
		annService.Update(ann,announcementId);
		return ann;
	}
}
