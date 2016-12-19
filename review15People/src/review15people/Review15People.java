package review15people;

/**
 *
 * @author Ali Torabi
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Person extends Object {

    Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person: %s, %d years old.", name, age);
    }
    String name;
    int age;
}

class Teacher extends Person {

    Teacher(String name, int age, String subject, int yoe) {
        super(name, age);
        this.subject = subject;
        this.yearsOfExperience = yoe;
    }

    @Override
    public String toString() {
        return String.format("Teacher: %s, %d years old. Teaches %s, with %d years of experience.",
                name, age, subject, yearsOfExperience);
    }
    String subject;
    int yearsOfExperience;
}

class Student extends Person {

    Student(String name, int age, String program, double gpa) {
        super(name, age);
        this.program = program;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, %d years old. Passed %s with grade %.2f .",
                name, age, program, gpa);
    }
    String program;
    double gpa;
}

public class Review15People {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        try (Scanner fileInput = new Scanner(new File("input.txt"))) {
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] data = line.split(";");

                switch (data[0]) {
                    case "Person":
                        people.add(new Person(data[1], Integer.parseInt(data[2])));
                        break;
                    case "Teacher":
                        people.add(new Teacher(data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4])));
                        break;
                    case "Student":
                        people.add(new Student(data[1], Integer.parseInt(data[2]), data[3], Double.parseDouble(data[4])));
                        break;
                    default:
                        break;
                }
            }
            for (Person p : people) {
                String description = p.toString();
                System.out.println(description);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
