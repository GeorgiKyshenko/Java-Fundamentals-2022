package AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        students.put(123, new Student(123, "Georgi", 29));
        students.put(456, new Student(456, "Ivan", 27));
        students.put(789, new Student(789, "Petko", 32));

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Student result = students.get(number);

        if (result != null) {
            System.out.println(result.getName());
        } else {
            System.out.println("No such student!");
        }
    }

    static class Student {
        int facultyNumber;
        String name;
        int age;

        public Student(int facultyNumber, String name, int age) {
            this.facultyNumber = facultyNumber;
            this.name = name;
            this.age = age;
        }

        public int getFacultyNumber() {
            return facultyNumber;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
