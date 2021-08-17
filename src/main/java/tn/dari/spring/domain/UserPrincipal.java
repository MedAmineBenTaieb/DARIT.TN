package tn.dari.spring.domain;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AppUser appUser;
	

	public UserPrincipal(AppUser appUser) {
		this.appUser = appUser;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		appUser.getRoles().forEach(r -> {
			authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
		});
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return appUser.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return appUser.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
