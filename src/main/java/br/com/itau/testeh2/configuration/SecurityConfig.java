package br.com.itau.testeh2.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.itau.testeh2.filters.SecurityFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private SecurityFilter securityFilter;
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
        .authorizeRequests()
        	.antMatchers("/login")
        	.permitAll()
            .and()
        .authorizeRequests()
        	.anyRequest().authenticated();
    }
}