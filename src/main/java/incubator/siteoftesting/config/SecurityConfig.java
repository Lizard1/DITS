//package incubator.siteoftesting.config;
//
//import incubator.siteoftesting.security.AuthProviderImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//@ComponentScan("incubator.siteoftesting.security")
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private AuthProviderImpl authProvider;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/adminUI1").anonymous()
//                .antMatchers("users").authenticated()
//                .and().csrf().disable()
//                .formLogin()
//                .loginPage("/adminUI1")
//                .loginProcessingUrl("/login/process")
//                .usernameParameter("email")
//                .and().logout();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authProvider);
//    }
//}
