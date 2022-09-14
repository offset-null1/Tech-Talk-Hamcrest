public class Parent {
    private final String name;
    private final String place;

    public Parent(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("[");
        strBuilder.append("Name: ");
        strBuilder.append(this.name);
        strBuilder.append(", ");
        strBuilder.append("Place: ");
        strBuilder.append(this.place);
        strBuilder.append("]");

        return strBuilder.toString();
    }

}


