import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigClass {
    @Bean
    @Qualifier("Testing")
    public Intern getIntern() {
        Discipline discipline = new Discipline();
        discipline.setName("Testing");
        return new Intern(discipline);
    }

    @Bean
    @Qualifier("Development")
    public Intern getIntern2() {
        Discipline discipline = new Discipline();
        discipline.setName("Development");
        return new Intern(discipline);
    }

    @Bean
    public Discipline getDiscipline() {
        Discipline discipline = new Discipline();
        discipline.setName("Applications Management");
        return discipline;
    }

    @Bean
    public Mentor getMentor() {
        return  new Mentor(getDiscipline());
    }
}
