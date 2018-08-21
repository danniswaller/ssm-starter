package com.github.danniswaller.ssmstarter.config;

import com.github.danniswaller.ssmstarter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration @EnableWebSecurity public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserService userService;


  @Override public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/static/**");
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  //~ ------------------------------------------------------------------------------------------------------------------


  @Override protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
    provider.setUserDetailsService(userService);
    auth.authenticationProvider(provider);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  @Override protected void configure(HttpSecurity http) throws Exception {
    http.rememberMe()

    //
    .and().authorizeRequests()

    //
    .anyRequest().authenticated()

    //
    .and().formLogin()               //
    .loginPage("/login")             //
    .loginProcessingUrl("/login")    //
    .defaultSuccessUrl("/home")      //
    .failureUrl("/login?error=true") //
    .permitAll()

    //
    .and().logout()              //
    .logoutUrl("/logout")        //
    .logoutSuccessUrl("/login")  //
    .invalidateHttpSession(true) //
    .permitAll();
  }
}
