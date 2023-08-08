package Acts;

import java.time.LocalDate;

public class RegistryForm {
    private String FirstName;
    private String LastName;
    private LocalDate BirthDate;
    private String Course;
    private String EmailAddress;

    public RegistryForm(String firstName, String lastName, LocalDate birthDate, String course, String emailAddress) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.BirthDate = birthDate;
        this.Course = course;
        this.EmailAddress = emailAddress;
    }
}
