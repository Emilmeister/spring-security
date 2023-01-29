package emil.madatov.springsecurityemil.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserManagementConfig {

    @Bean
    UserDetailsService getUserDetailService() {
        InMemoryUserDetailsManager userDetailService = new InMemoryUserDetailsManager();
        UserDetails user = User.withUsername("emil").password("1234").authorities("read").build();
        userDetailService.createUser(user);
        return userDetailService;
    }

    @Bean
    PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
