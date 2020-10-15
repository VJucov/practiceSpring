import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mentor implements Employee {
//    @Autowired
    private Discipline discipline;

    @Autowired
    public Mentor(Discipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public Discipline getDiscipline() {
        return discipline;
    }


}
