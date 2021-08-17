package tn.dari.spring.service;

import java.io.Console;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import tn.dari.spring.domain.AppUser;
import tn.dari.spring.domain.Role;
import tn.dari.spring.repository.AppUserRepository;
import tn.dari.spring.repository.RoleRepository;
import tn.dari.spring.service.interfaces.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	AppUserRepository userRep;
	@Autowired
	RoleRepository roleRep;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public AppUser loadUserByEmail(String email) {
		return userRep.findByEmail(email);
	}

	@Override
	public AppUser addSimpleUser(AppUser a) {
		if (userRep.findByEmail(a.getEmail()) != null)
			throw new RuntimeException("User already exists");
		Role r = roleRep.findByRoleName("SIMPLE_USER");
		a.setRoles(new HashSet<>(Arrays.asList(r)));
		a.setCreatedAt(Date.from(Instant.now()));
		a.setUpdatedAt(Date.from(Instant.now()));
		String pwd = bCryptPasswordEncoder.encode(a.getPassword());
		a.setPassword(pwd);
		userRep.save(a);
		return a;
	}

	@Override
	public void deleteUser(int id) {
		AppUser appUser = userRep.findByUserId(id);
		if (appUser == null)
			throw new RuntimeException("User doesn't exists");

		userRep.delete(appUser);

	}

	@Override
	public ArrayList<AppUser> getUsers() {
		return (ArrayList<AppUser>) userRep.findAll();
	}

	@Override
	public ArrayList<AppUser> getSimpleUsers() {
		ArrayList<AppUser> users=this.getUsers();
		ArrayList<AppUser> simpleUsers=new ArrayList<AppUser>() ;
		
		for(AppUser au : users)
		{
			boolean b=false;
			Set<Role> roles=au.getRoles();
			for(Role r:roles)
			{
				if(r.getRoleName().equals("SIMPLE_USER"))
				{
					b=true;
				}
			}
			if(b&&(roles.size()==1)) simpleUsers.add(au);
		}
		return simpleUsers;

	}

	@Override
	public ArrayList<AppUser> getSubscribedUsers() {
		ArrayList<AppUser> users=this.getUsers();
		ArrayList<AppUser> subscriberUsers=new ArrayList<AppUser>() ;
		
		for(AppUser au : users)
		{
			boolean b=false;
			Set<Role> roles=au.getRoles();
			for(Role r:roles)
			{
				if(r.getRoleName().equals("SUBSCRIBED_USER"))
				{
					b=true;
				}
			}
			if(b&&(roles.size()==2)) subscriberUsers.add(au);
		}
		return subscriberUsers;
	}

	@Override
	public AppUser updateUser(AppUser a) {
		if (userRep.findByEmail(a.getEmail()) == null)
			throw new RuntimeException("User doesn't exists");
		userRep.save(a);
		return a;
	}

	@Override
	public AppUser addAdmin(AppUser a) {
		if (userRep.findByEmail(a.getEmail()) != null)
			throw new RuntimeException("User already exists");
		Role r = roleRep.findByRoleName("ADMIN");
		a.setRoles(new HashSet<>(Arrays.asList(r)));
		String pwd = bCryptPasswordEncoder.encode(a.getPassword());
		a.setPassword(pwd);
		userRep.save(a);
		return a;
	}


	@Override
	public Role addRole(Role role) {
		roleRep.save(role);
		return role;
	}

	@Override
	public AppUser addSubscribedUser(AppUser a) {
		if (userRep.findByEmail(a.getEmail()) != null)
			throw new RuntimeException("User already exists");
		Role r = roleRep.findByRoleName("SIMPLE_USER");
		Role r1= roleRep.findByRoleName("SUBSCRIBED_USER");
		a.setRoles(new HashSet<>(Arrays.asList(r,r1)));
		a.setCreatedAt(Date.from(Instant.now()));
		a.setUpdatedAt(Date.from(Instant.now()));
		String pwd = bCryptPasswordEncoder.encode(a.getPassword());
		a.setPassword(pwd);
		a.setSubscribed(true);
		userRep.save(a);
		return a;
	}


}
