package school.main;

import school.main.StudentLinkedList.Iterator;

public interface StudentList {

    public void append(Student student);

    public void prepend(Student student);

    public Student getStudentAt(int index);

    public void removeAt(int index);

    public Iterator getIterator();

}
