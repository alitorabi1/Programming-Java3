import java.util.ArrayList;

class Person extends Object {
    Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person: %s, %d", name, age);
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
        return String.format("Teacher: %s, %d, %s, %d",
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
        return String.format("Student: %s, %d, %s, %.2f",
                name, age, program, gpa);
    }
    String program;
    double gpa;
}

public class Review14Inheritance {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        // Polymorphism
        people.add(new Person("Jerry", 33));
        people.add(new Person("Lalala", 22));
        people.add(new Teacher("Jimmy", 44, "PhysEd", 15));
        people.add(new Teacher("Martha", 55, "Nursing", 25));
        people.add(new Student("Marry", 24, "Engineering", 4.1));
        people.add(new Student("Michel", 39, "Math", 3.8));
        //
        System.out.println(people.toString());
        for (Person p : people) {
            if (p instanceof Student) {
                Student s = (Student) p;
                System.out.printf("WOO HOO (%s) ", s.program);
            }
            String description = p.toString();
            System.out.println(description);
        }
    }
    
}