//package com.proejct.end_to_end.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.proejct.end_to_end.services.UserService;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class UserConfig {
//
//	@Autowired
//	private UserService service;
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider daoAuth = new DaoAuthenticationProvider();
//		daoAuth.setUserDetailsService(service);
//		daoAuth.setPasswordEncoder(passwordEncoder());
//		return daoAuth;
//	}
//
//}
