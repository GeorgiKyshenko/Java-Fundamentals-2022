package ObjectsAndClasses;

public class Lecture1 {
    static class Student {       // <- Клас.
        int id;
        int age;
        String name;

        Student (String name, int id, int age) {     // инициализиране на стойностите директно при създаването на студент
                                                    // отдолу в скобите. Конструктор.
        this.age = age;
        this.id = id;
        this.name = name;
        }

        void getInfo() {
            System.out.printf("ID: %d, age: %d, Name: %s%n", id, age, name);    // може да добавим this,  пред id,age,name.
        }
    }


    public static void main(String[] args) {
        Student a = new Student("Georgi", 12345678, 29);
        a.getInfo();

        // вариант 2 –>
        // ->>
        Student b = new Student("Somebody", 10101010, 25);        // <- обект.
        b.age = 25;
        b.id = 10101010;
        b.name = "Somebody";
        b.getInfo();
    }
}