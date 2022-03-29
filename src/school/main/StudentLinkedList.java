package school.main;

public class StudentLinkedList implements StudentList {

    private Node head;
    private int size;

    /**
     * Constructs a new empty StudentLinkedList
     */
    public StudentLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Adds a Student to the end of this LinkedList
     * 
     * @param student student to add to end of list
     */
    public void append(Student student) {
        Node toAppend = new Node(student);
        this.size++;
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

    /**
     * Adds a Student to the start of this LinkedList
     * 
     * @param student student to add to start of list
     */
    public void prepend(Student student) {
        Node currentHead = this.head;
        this.head = new Node(student);
        this.head.next = currentHead;
        this.size++;
    }

    /**
     * Returns a reference to the Student at the given index
     * 
     * @param index position in list to return Student at
     * @return Student at the given index
     */
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

    /**
     * Removes the Student at the given index
     * 
     * @param index position to remove Student at
     */
    public void removeAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }
        Node current = this.head;
        Node prev = null;
        while (current != null && index > 0) {
            prev = current;
            current = current.next;
            index--;
        }
        if (current == this.head) {
            this.head = current.next;
        }
        if (prev != null) {
            prev.next = current.next;
        }
        this.size--;
    }

    /**
     * Generates a String representation of the calling StudentLinkedList
     * 
     * @return String representation of the calling StudentLinkedList
     */
    @Override
    public String toString() {
        String str = "[";
        for (Node current = this.head; current != null; current = current.next) {
            String name = current.student.getName();
            str += (current.next == null) ? name + "]" : name + ", ";
        }
        return str;
    }

    /**
     * Returns a new Iterator on the calling StudentLinkedList, beginning at the
     * first element
     * 
     * @throws IllegalStateException if the list is empty
     * @return Iterator on the calling StudentLinkedList
     */
    public Iterator getIterator() {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        return new Iterator(this);
    }

    public class Iterator {

        private StudentLinkedList host;
        private Node current;

        /**
         * Constructs a new Iterator on the calling StudentLinkedList, pointing to the
         * first element
         * 
         * @param host StudentLinkedList to construct Iterator on
         */
        public Iterator(StudentLinkedList host) {
            this.host = host;
            current = host.head;
        }

        /**
         * Returns a reference to the Student at the current iterator position
         * 
         * @return a reference to the Student at the current iterator position
         */
        public Student getCurrent() {
            return this.current.student;
        }

        /**
         * Advances the Iterator to the next Node in the list, returning to the start if
         * at the end
         */
        public void next() {
            current = (current.next == null) ? host.head : current.next;
        }

    }

    private class Node {
        Node next;
        Student student;

        /**
         * Constructs a new Node containing the given Student
         * 
         * @param student Student to contain in this node
         */
        public Node(Student student) {
            this.next = null;
            this.student = student;
        }
    }

}
