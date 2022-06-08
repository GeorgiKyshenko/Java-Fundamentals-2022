import java.util.*;


public class ListInClass {
    public static void main(String[] args) {
        Student a = new Student();
        a.modules = new ArrayList<>();
        a.getModules().add("Basics");
        a.getModules().add("Fundamentals");
        for (int i = 0; i < a.getModules().size(); i++) {
            System.out.print(a.getModules().get(i));
            if (i < a.getModules().size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        a.getInfo();

    }

    public static class Student {
        String name;
        int age;
        List<String> modules;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public List<String> getModules() {
            return modules;

        }

        void getInfo() {
            System.out.print(getModules());
        }
    }
}

