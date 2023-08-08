package Acts;

public class Student {
    private String Name;
    private String Course;

    public Student(String name, String course) {
        Name = name;
        Course = course;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}