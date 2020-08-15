package com.snake.ladder.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Autowired
	public UserPasswordEncoder encoder;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/snakeandladder/*").hasAnyRole(Roles.Player.name())
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	}
	
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails Alex = User.withDefaultPasswordEncoder()
		.username("Alex")
		.password("password123")
		.roles(Roles.Player.name())
		.build();
		
		UserDetails Sam = User.withDefaultPasswordEncoder()
		.username("Sam")
		.password("password123")
		.roles(Roles.Player.name())
		.build();
		
		UserDetails Jack = User.withDefaultPasswordEncoder()
		.username("Jack")
		.password("password123")
		.roles(Roles.Player.name())
		.build();
		
		UserDetails Linda = User.withDefaultPasswordEncoder()
		.username("Linda")
		.password("password123")
		.roles(Roles.Player.name())
		.build();
		
		return new InMemoryUserDetailsManager(Alex, Sam, Jack, Linda);
	}
	
	
	@Bean
	public UserPasswordEncoder getPasswordEncoder() {
		return new UserPasswordEncoder();
	}
}
