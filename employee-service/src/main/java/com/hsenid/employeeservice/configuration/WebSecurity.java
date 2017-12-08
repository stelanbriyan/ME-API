package com.hsenid.employeeservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Stelan Briyan
 */
@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.GET, "/findEmployeeBySkill/**").permitAll()
                .antMatchers(HttpMethod.POST, "/findEmployeeSkill").permitAll()
                .antMatchers(HttpMethod.GET, "/findEmployees").permitAll()
                .antMatchers(HttpMethod.GET, "/skill/findSkill").permitAll()
                .anyRequest().authenticated();
    }

}
