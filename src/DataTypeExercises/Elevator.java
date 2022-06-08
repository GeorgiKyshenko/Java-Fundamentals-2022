package DataTypeExercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;
        //courses = (int) Math.ceil((double) numberOfPeople / capacity);
        //System.out.println(courses);

        if (numberOfPeople % capacity != 0 || numberOfPeople % capacity == 0) {
            courses = numberOfPeople / capacity;
            if (numberOfPeople % capacity <= capacity && numberOfPeople % capacity != 0) {
                courses++;
            }
            System.out.println(courses);

        }
    }
}


