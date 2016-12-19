package person;

import java.math.BigDecimal;

public class Employee extends Person {

    private String office = "";
    private BigDecimal salary;
    private int year;
    private int month;
    private int day;
    
    MyDate myDate = new MyDate(year, month, day);
    private String dateHired = String.valueOf(myDate.getYear()).concat("/").concat(String.valueOf(myDate.getMonth())).concat("/").concat(String.valueOf(myDate.getDay()));

    @Override
    public String toString() {
        return String.format("Employee office: %s, salary: %.3f and the hire date: %.3s",
                office, salary, dateHired);
    }
}
