package person;

public class Student extends Person {

    final String FRESHMAN = "freshman";
    final String SOPHOMORE = "sophomore";
    final String JUNIOR = "junior";
    final String SENIOR = "senior";

    @Override
    public String toString() {
        return String.format("Student freshman : %s, sophomore: %s, junior: %d and senior is: %s",
                FRESHMAN, SOPHOMORE, JUNIOR, SENIOR);
    }
}
