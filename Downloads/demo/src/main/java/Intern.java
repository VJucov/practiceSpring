import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Intern extends  Mentor{
//    @Autowired
    private Discipline discipline;

    @Autowired
    public Intern(Discipline discipline) {
        super(discipline);
    }

    public Discipline getDiscipline() {
        return discipline;
    }


}
