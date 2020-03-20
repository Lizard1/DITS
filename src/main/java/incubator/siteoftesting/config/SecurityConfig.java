package incubator.siteoftesting.config;

import incubator.siteoftesting.security.AuthProviderImpl;
import incubator.siteoftesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@ComponentScan("incubator.siteoftesting.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthProviderImpl authProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/login").anonymous()
                .antMatchers("/hello").authenticated()
                .antMatchers("/admin/**", "stat/**").hasAuthority("ADMIN")
                .antMatchers("/tutor/**").hasAuthority("TUTOR")
                .antMatchers("/user/**").hasAuthority("USER")
                .and()
                    .csrf().disable()
                    .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/hello")
                    .loginProcessingUrl("/login/process")
                    .usernameParameter("login")
                .and().logout();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.authenticationProvider(authProvider);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

/*
* http.authorizeRequests()
                .antMatchers("/login").anonymous()
                .antMatchers("/hello").authenticated()
                .antMatchers("/admin/**", "stat/**").hasAuthority("ADMIN")
                .antMatchers("/tutor/**").hasAuthority("TUTOR")
                .antMatchers("/user/**").hasAuthority("USER")
                .and()
                    .csrf().disable()
                    .formLogin()
                    .loginPage("/login")
                    .loginProcessingUrl("/login/process")
                    .usernameParameter("login")
                    .failureUrl("/login?error=true")
                .and()
                    .exceptionHandling()
                    .accessDeniedPage("/denied")
                .and().logout();
*
* */