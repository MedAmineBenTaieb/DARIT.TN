package tn.dari.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.domain.Announcement;
import tn.dari.spring.domain.AppUser;
import tn.dari.spring.domain.Role;
import tn.dari.spring.service.interfaces.AnnouncementService;
import tn.dari.spring.service.interfaces.AppUserService;
import tn.dari.spring.service.interfaces.TestService;
import java.util.List;

@RestController
@RequestMapping()
public class TestController {
	
	@Autowired
	TestService service;
	
	@Autowired 
	AppUserService appUserService;
	
	@Autowired
	AnnouncementService annService;
	
	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role r)
	{
		service.addRole(r);
		return r;
	}
	
	@PostMapping("/addSimpleUser")
	public AppUser addSimpleUser(@RequestBody AppUser appUser)
	{
		appUserService.addSimpleUser(appUser);
		return appUser;
	}
	
//	@PostMapping("/addAnnonce")
//	public Announcement AddAnnounc(@RequestBody Announcement ann){
//		annService.AddAnnouncement(ann);
//		return ann;
//	}
//	
	@GetMapping("/getann")
	public List<Announcement> getAnn(){
		return annService.loadNotVerifiedAnnouncements();
	}


}
