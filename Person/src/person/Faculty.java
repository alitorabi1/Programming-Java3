package person;

public class Faculty extends Employee {

    private String office = "";
    private double hour;
    private double rank;
    
    @Override
    public String toString() {
        return String.format("Faculty office: %s, hours: %.3f, by the ranking: %.3d",
                office, hour, rank);
    }
}
