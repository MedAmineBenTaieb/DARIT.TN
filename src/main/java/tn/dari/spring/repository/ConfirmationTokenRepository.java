package tn.dari.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.dari.spring.domain.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, Long>{
	ConfirmationToken findByConfirmationToken(String confirmationToken);

}
