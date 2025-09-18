package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Olha", 2);
        student.addCourse("Mathematics");
        student.addCourse("Computer Science");
        student.addCourse("Java Programming");
        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount());
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());
        System.out.println(student.getName() + ": заплатив за навчання - " + student.getTuition());

    }
}