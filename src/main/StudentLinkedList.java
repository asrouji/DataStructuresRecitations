package main;

public class StudentLinkedList implements StudentList {

    private Node head;
    private int size;

    public StudentLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void append(Student student) {
        Node toAppend = new Node(student);
        this.size++;
        // case: list empty
        if (this.head == null) {
            this.head = toAppend;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = toAppend;
    }

    public void prepend(Student student) {
        Node currentHead = this.head;
        this.head = new Node(student);
        this.head.next = currentHead;
        this.size++;
    }

    public Student getStudentAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }
        Node current = this.head;
        while (index > 0) {
            current = current.next;
            index--;
        }
        return current.student;
    }

    private class Node {
        Node next;
        Student student;

        public Node(Student student) {
            this.next = null;
            this.student = student;
        }
    }

}
