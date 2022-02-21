package main;

public class School {

    public static void main(String[] args) {
        System.out.println("=================");

        StudentList list = new StudentLinkedList();
        Teacher teacher = new Teacher("Teacher");

        list.append(new Student("Bob", teacher));
        list.append(new Student("Jesse", teacher));
        list.prepend(new Student("Ana", teacher));

        // [Ana, Bob, Jesse]

        System.out.println("Student 0: " + list.getStudentAt(0).getName());
        System.out.println("Student 1: " + list.getStudentAt(1).getName());
        System.out.println("Student 2: " + list.getStudentAt(2).getName());

        System.out.println("=================");
    }

}
