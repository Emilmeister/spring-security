package emil.madatov.springsecurityemil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SpringSecurityEmilApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityEmilApplication.class, args);
    }

}
