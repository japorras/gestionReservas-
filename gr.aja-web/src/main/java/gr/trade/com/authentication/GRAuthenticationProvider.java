package gr.trade.com.authentication;

import gr.trade.com.rest.LoginUserClient;
import gr.trade.com.ws.interfaces.PersonBean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class GRAuthenticationProvider implements UserDetailsService{
	
	@Autowired
	LoginUserClient logonUserClient;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		PersonBean pb = logonUserClient.logonUser(username, "");
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		return new User(
				pb.getNombreUsuario(),
				pb.getPassword().toLowerCase(),
		enabled,
		accountNonExpired,
		credentialsNonExpired,
		accountNonLocked,
		getGrantedAuthorities(pb.getRol()));
		
	}
	
	public static List<GrantedAuthority> getGrantedAuthorities(String rol) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(rol));
		return authorities;
	
	}
	
}