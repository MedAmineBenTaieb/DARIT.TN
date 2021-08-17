package tn.dari.spring.controller;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.domain.AppUser;
import tn.dari.spring.domain.ConfirmationToken;
import tn.dari.spring.domain.Role;
import tn.dari.spring.repository.AppUserRepository;
import tn.dari.spring.repository.ConfirmationTokenRepository;
import tn.dari.spring.service.EmailSenderService;
import tn.dari.spring.service.interfaces.AnnouncementService;
import tn.dari.spring.service.interfaces.AppUserService;
import tn.dari.spring.service.interfaces.TestService;

@RestController
@RequestMapping("/api")
public class AppUserController {

	@Autowired
	TestService service;

	@Autowired
	AppUserService appUserService;

	@Autowired
	AnnouncementService annService;
	@Autowired
	private ConfirmationTokenRepository confirmationTokenRepository;

	@Autowired
	private EmailSenderService emailSenderService;
	@Autowired
	private AppUserRepository userRep;

	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role r) {
		service.addRole(r);
		return r;
	}

	@PostMapping("/Signup")
	public AppUser register(@RequestBody AppUser appUser) {
		appUserService.addSimpleUser(appUser);
		ConfirmationToken confirmationToken = new ConfirmationToken(appUser);

		confirmationTokenRepository.save(confirmationToken);

		/*
		 * SimpleMailMessage mailMessage = new SimpleMailMessage();
		 * mailMessage.setTo(appUser.getEmail());
		 * mailMessage.setSubject("Complete Registration!");
		 * mailMessage.setFrom("daritn2021@gmail.com");
		 * mailMessage.setText("To confirm your account, please click here : " +
		 * "http://localhost:8081/confirm-account?token=" +
		 * confirmationToken.getConfirmationToken());
		 * emailSenderService.sendEmail(mailMessage);
		 */
		return appUser;
	}

	@PostMapping("confirm-account")
	public void confirmUserAccount(@RequestParam("token") String confirmationToken) {
		ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);

		if (token != null) {
			AppUser user = userRep.findByEmail(token.getUser().getEmail());
			user.setVerified(true);
			appUserService.updateUser(user);
		}

	}

	@PostMapping("/addAdmin")
	public AppUser addAdmin(@RequestBody AppUser appUser) {
		appUserService.addAdmin(appUser);
		return appUser;
	}

	@PostMapping("/addSubscriber")
	public AppUser addSubscribedUser(@RequestBody AppUser appUser) {
		appUserService.addSubscribedUser(appUser);
		return appUser;
	}

	@PostMapping("/delete")
	public void deleteUser(@RequestParam int id) {
		appUserService.deleteUser(id);
	}

	@PostMapping("/update")
	public AppUser updateUser(@RequestBody AppUser appUser) {
		appUserService.updateUser(appUser);
		return appUser;
	}

	@GetMapping("/users")
	public ArrayList<AppUser> getUsers() {
		return appUserService.getUsers();
	}

	@GetMapping("/simpleUsers")
	public ArrayList<AppUser> getSimpleUsers() {
		return appUserService.getSimpleUsers();

	}

	@GetMapping("/subscribedUsers")
	public ArrayList<AppUser> getSubscribedUsers() {
		return appUserService.getSubscribedUsers();

	}

}
