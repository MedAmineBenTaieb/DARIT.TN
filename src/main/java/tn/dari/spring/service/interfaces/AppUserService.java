package tn.dari.spring.service.interfaces;

import java.util.ArrayList;
import java.util.Set;

import tn.dari.spring.domain.AppUser;
import tn.dari.spring.domain.Role;

public interface AppUserService {
	public AppUser loadUserByEmail(String email);

	public AppUser addSimpleUser(AppUser a);
	public AppUser addSubscribedUser(AppUser a);

	public AppUser addAdmin(AppUser a);

	public void deleteUser(int id);

	public ArrayList<AppUser> getUsers();

	public ArrayList<AppUser> getSimpleUsers();

	public ArrayList<AppUser> getSubscribedUsers();

	public AppUser updateUser(AppUser a);

	Role addRole(Role role);
}
