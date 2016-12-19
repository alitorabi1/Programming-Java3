package person;

public class Staff extends Employee {

    private String title = "";

    public String toString(double args) {
        return String.format("Staff title is: %s", title);
    }
}
