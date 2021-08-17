package tn.dari.spring.repository;


import org.springframework.data.repository.CrudRepository;

import tn.dari.spring.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
public Role findByRoleName(String roleName);
}
