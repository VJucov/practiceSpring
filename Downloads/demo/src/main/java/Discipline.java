import org.springframework.stereotype.Component;

@Component
public class Discipline {
    private String name = "Applications Management";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}