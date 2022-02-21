package main;

public interface StudentList {

    public void append(Student student);

    public void prepend(Student student);

    public Student getStudentAt(int index);

}
