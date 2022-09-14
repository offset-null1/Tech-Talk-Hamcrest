public class Daughter extends Parent {

    private boolean student;

    public Daughter(String name, String place, boolean student) {
        super(name, place);
        this.student = student;
    }

    public boolean isStudent() {
        return this.student;
    }
}
