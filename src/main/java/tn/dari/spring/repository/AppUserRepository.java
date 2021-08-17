package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.dari.spring.domain.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, Integer>{
	public AppUser findByEmail(String email);
	public AppUser findByUserId(int id);
	public AppUser findByEmailIgnoreCase(String email);
}
