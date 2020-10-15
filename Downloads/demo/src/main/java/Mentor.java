public class Mentor implements Employee {
    private Discipline discipline;

    public Mentor(Discipline discipline) {
        this.discipline = discipline;
    }

    public Discipline getDiscipline() {
        return discipline;
    }


}
