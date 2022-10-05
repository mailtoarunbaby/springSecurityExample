package com.arun.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebsecurityConf{
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		System.out.println("hi");
		http
			.authorizeHttpRequests((requests) -> {
				try {
					requests
						.antMatchers("/", "/home").permitAll()
//		                .antMatchers("/h2-console/**").permitAll() 
						.anyRequest().authenticated().and().httpBasic();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
		http.csrf().disable();
		http.headers().frameOptions().disable();

		return http.build();
	}

	

}
