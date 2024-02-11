//package com.app.security;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity//to enable spring sec frmwork support
//@Configuration //to tell SC , this is config class containing @Bean methods
//@EnableGlobalMethodSecurity(prePostEnabled = true)
////To enable method level authorization support : pre n post authorization
//public class SecurityConfig {
//	//dep : pwd encoder
////	@Autowired
////	private PasswordEncoder enc;
////	@Bean
////	UserDetailsService users() {
////		User admin=new User("Rama",enc.encode("1234"), 
////				List.of(new SimpleGrantedAuthority("ROLE_ADMIN")));
////		User customer=new User("Kiran",enc.encode("2345"), 
////				List.of(new SimpleGrantedAuthority("ROLE_CUSTOMER")));
////		
////		return new InMemoryUserDetailsManager(customer,admin);
////	}
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http
//			.authorizeHttpRequests((requests) -> requests
//				.antMatchers("/","/register","/policy/clientId/{clientId}").permitAll()
//				.anyRequest().authenticated()
//			)
//			.formLogin((form) -> form
//				.loginPage("/login")
//				.permitAll()
//			)
//			.logout((logout) -> logout.permitAll());
//
//		return http.build();
//	}
//}
