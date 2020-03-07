package incubator.siteoftesting.security;

import incubator.siteoftesting.dao.UserDao;
import incubator.siteoftesting.model.Role;
import incubator.siteoftesting.model.User;
import incubator.siteoftesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthProviderImpl implements AuthenticationProvider {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        User user = userService.getUserByLogin(authentication.getName());

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        String passwordFromUser = authentication.getCredentials().toString();
        if (!passwordEncoder.matches(passwordFromUser, user.getPassword())) {
            throw new BadCredentialsException("Bad credentials");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority( getAuthority(user.getRole())));

        return new UsernamePasswordAuthenticationToken(user, null, authorities);
    }

    private String getAuthority(Role role) {
        String authority;
        if (role.getAdmin() == 1 && role.getTutor() == 0 && role.getUser() == 0) {
            authority = "ADMIN";
        } else if (role.getAdmin() == 0 && role.getTutor() == 1 && role.getUser() == 0) {
            authority = "TUTOR";
        } else if (role.getAdmin() == 0 && role.getTutor() == 0 && role.getUser() == 1) {
            authority = "USER";
        } else {
            authority = "ANONYMOUS";
        }
        return authority;
    }


    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
