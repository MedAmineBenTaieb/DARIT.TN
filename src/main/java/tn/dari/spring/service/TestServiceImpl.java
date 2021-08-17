package tn.dari.spring.service;

import tn.dari.spring.domain.Role;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dari.spring.domain.AppUser;
import tn.dari.spring.repository.AppUserRepository;
import tn.dari.spring.repository.RoleRepository;
import tn.dari.spring.service.interfaces.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	RoleRepository roleRep;

	@Override
	public Role addRole(Role role) {
		roleRep.save(role);
		return role;
	}

}
