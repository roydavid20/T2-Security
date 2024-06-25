package com.example.dawii_t1_jaimes_cerna_roy_david.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {


  @Bean
  public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {

    return httpSecurity
      .csrf(csrf -> csrf.disable()) //  Cross-Site Request Forgery
      .httpBasic(Customizer.withDefaults())
      .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
      /*.authorizeHttpRequests(http -> {
        http.requestMatchers(HttpMethod.GET, "auth/message").permitAll();
        http.requestMatchers(HttpMethod.GET, "auth/messageSecurity").authenticated();
        http.requestMatchers(HttpMethod.GET, "auth/messageSuperSecurity").hasAuthority("ALL");

        http.anyRequest().authenticated();

      })*/
      .build();

  }

  @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {

    return authenticationConfiguration.getAuthenticationManager();
  }

  @Bean
  public AuthenticationProvider authenticationProvider (){
    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
    provider.setPasswordEncoder(passwordEncoder());
    provider.setUserDetailsService(userDetailsService());
    return provider;
  }

  @Bean
  public PasswordEncoder passwordEncoder(){
    return NoOpPasswordEncoder.getInstance();

  }

  @Bean
  public UserDetailsService userDetailsService(){
    List<UserDetails> users = new ArrayList<>();
    users.add(User.withUsername("empleado")
      .roles("ADMIN")
      .authorities("ALL", "CREATE")
      .password("123456")
      .build());

    users.add(User.withUsername("emp2")
      .roles("USER")
      .authorities("CREATE")
      .password("milk")
      .build());
    return  new InMemoryUserDetailsManager(users);
  }

}
