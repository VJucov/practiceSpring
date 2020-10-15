import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Intern internBean = context.getBean(Intern.class);
        System.out.println(internBean.getDiscipline().getName());
    }
}
