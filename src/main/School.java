package main;

import main.StudentLinkedList.Iterator;

public class School {

    public static void main(String[] args) {
        System.out.println("=================");

        StudentList list = new StudentLinkedList();
        Teacher teacher = new Teacher("Teacher");

        Student ana = new Student("Ana", teacher);
        Student bob = new Student("Bob", teacher);
        Student jesse = new Student("Jesse", teacher);

        list.append(ana);
        list.append(bob);
        list.append(jesse);

        System.out.println("Original: " + list);
        list.removeAt(1);
        System.out.println("New: " + list);
        System.out.println();

        Iterator it = list.getIterator();
        System.out.println("Iterator Current: " + it.getCurrent().getName());
        it.next();
        System.out.println("Iterator Current: " + it.getCurrent().getName());
        it.next();
        System.out.println("Iterator Current: " + it.getCurrent().getName());

        System.out.println("=================");
    }

}
