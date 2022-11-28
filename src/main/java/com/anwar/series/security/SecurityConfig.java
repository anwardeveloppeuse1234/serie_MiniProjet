package com.anwar.series.security;


import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		//List all candidates
		http.authorizeRequests().antMatchers("/api/all/**").hasAnyAuthority("ADMIN", "USER");
		
		//Consult candidate per id
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/**").hasAnyAuthority("ADMIN", "USER");
		
		//Add candidate
		http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/**").hasAuthority("ADMIN");
		
		//Modify candidate
		http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/**").hasAuthority("ADMIN");
		
		//Delete candidate
		http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/**").hasAuthority("ADMIN");
		
		http.authorizeRequests().anyRequest().authenticated();
		
		http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
		
		
	}

	
	
}
