import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    Intern getIntern() {
        return new Intern(getDiscipline());
    }

    @Bean
    Mentor getMentor() {
        return new Mentor(getDiscipline());
    }

    @Bean
    Discipline getDiscipline() {
        return new Discipline();
    }
}
