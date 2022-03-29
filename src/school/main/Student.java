package school.main;

import java.util.Objects;

public class Student extends Person {

    // Fields
    private Teacher teacher;

    // Constructor
    public Student(String name, Teacher teacher) {
        super(name);
        this.teacher = teacher;
    }

    // Methods
    public String getTeacherName() {
        return this.teacher.getName();
    }

    @Override
    public boolean equals(Object other) { // parameter of type "Object" will accept any object
        if (this.getClass() != other.getClass()) {
            return false;
        }

        return this.getName().equals(((Student) other).getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }

}
