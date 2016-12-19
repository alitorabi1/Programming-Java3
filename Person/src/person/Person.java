package person;

public class Person {

    private String name = "";
    private String address = "";
    private int phoneNumber;
    private String emailAddress;

    public String toString(String name, String address, int phone, String email) {
        return String.format("Person name: %s, address: %s, phone number: %d and email is: %s",
                name, address, phoneNumber, emailAddress);
    }
    
    public static void main(String[] args) {
        /*
        A faculty member has office hours and a rank. 
        A staff member has a title. Override the toString method in
        each class to display the class name and the person’s name.
        Write a test program that creates a Person, Student, Employee, Faculty, 
        and Staff, and invokes their toString() methods.        
        */
    }

}
