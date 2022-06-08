package ObjectsAndClasses.Exercises;

public class Example {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Georgi";
        st1.score = 5.90;
        st1.courses = new String[] {"java", "python"};
        System.out.println(st1.name);
        System.out.printf("%.2f%n", st1.score);
        for (String c : st1.courses) {
            System.out.print(c + " ");
        }
    }
    public static class Student {
        String name;
        double score;
        String[] courses;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String[] getCourses() {
            return courses;
        }

        public void setCourses(String[] courses) {
            this.courses = courses;
        }

        Student() {

        }
    }

}





