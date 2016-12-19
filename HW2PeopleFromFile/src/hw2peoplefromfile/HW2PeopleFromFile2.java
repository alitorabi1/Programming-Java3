package hw2peoplefromfile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HW2PeopleFromFile2 {

    static final String INPUT_FILE_NAME = "input.txt";
    static final String OUTPUT_FILE_NAME = "output.txt";

    static class InvalidAssignemntValueException extends Exception {

        public InvalidAssignemntValueException(String message) {
            super(message);
        }
    }

    static class Person {

        public Person(String name, int age) throws InvalidAssignemntValueException {
            setName(name);
            setAge(age);
        }

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) throws InvalidAssignemntValueException {
            if ((name == null) || (name.length() < 2)) {
                throw new InvalidAssignemntValueException("Name must be at least 2 characters long.");
            }
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) throws InvalidAssignemntValueException {
            if ((age < 0) || (age > 150)) {
                throw new InvalidAssignemntValueException("Age must be between 0 and 150.");
            }
            this.age = age;
        }
    }

    static void writeToFile(String oldestName, int oldestAge) {
        File file = new File(OUTPUT_FILE_NAME);
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(oldestName);
            pw.println(oldestAge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static ArrayList<Person> makePersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        try (Scanner inputFile = new Scanner(new File(INPUT_FILE_NAME))) {
            // TODO code application logic here
            String pName = "";
            int pAge = 0;
            while (inputFile.hasNextLine()) {
                pName = inputFile.nextLine();
                if (pName.isEmpty()) {
                    break;
                }
                pAge = inputFile.nextInt();
                inputFile.nextLine();
                personList.add(new Person(pName, pAge));
            }
        } catch (IOException | InvalidAssignemntValueException ie) {
            ie.printStackTrace();
        }
        return personList;
    }

    public static void main(String[] args) {
        /*
        Read in the contents of the file for every two
        lines creating an instance of Person
        and adding it to ArrayList<Person> personList.
         */
        ArrayList<Person> personList = makePersonList();
        //Find the oldest persons and display their name and age.
        String oldestName = personList.get(0).getName();
        int oldestAge = personList.get(0).getAge();
        for (int i = 0; i < personList.size(); i++) {
            if (oldestAge < personList.get(i).getAge()) {
                oldestAge = personList.get(i).getAge();
                oldestName = personList.get(i).getName();
            }
        }
        System.out.printf("Oldest person is: %s with %d years old.", oldestName, oldestAge);

        //Find the average age of all people.
        int sumAge = 0;
        for (int i = 0; i < personList.size(); i++) {
            sumAge += personList.get(i).getAge();
        }
        System.out.printf("\nThe average year of all persons is: %s.", sumAge / personList.size());
        /*
        Open file 'output.txt' for writing and write to
        it the name and age of the oldest person on two separate lines. Make sure to close the file.
        Use try-with-resources.
         */
        writeToFile(oldestName, oldestAge);
    }
}
