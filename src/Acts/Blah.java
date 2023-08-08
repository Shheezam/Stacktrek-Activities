package Acts;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Blah {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String firstname = validateName("First Name");
        String lastname = validateName("Last Name");
        String birthdate = validateBirthday();
        String course = validateCourse();
        String emailadd = validateEmail();
        String surname = extractFirstletter(lastname);
        String studentNumber = createStudentNumber(birthdate, lastname);


        System.out.println(studentNumber);
    }
    //---------------------------------------------METHODS------------------------------------------------//


    //FIRST AND LAST NAME VALIDATION
    public static String validateName(String firstname_lastname) {
        String name = "";
        while (true) {
            System.out.print(firstname_lastname + ": ");
            name = sc.nextLine();
            if (name.matches("[a-zA-Z ]{1,50}$")) {
                break;
            } else {
                System.out.println("Invalid " + firstname_lastname + "!");
            }
        }
        return name;
    }

    //BIRTHDAY VALIDATION
    public static String validateBirthday() {
        String birthdate = "";
        while (true) {
            System.out.print("Birthday (yyyy/mm/dd): ");
            birthdate = sc.nextLine();
            try {
                //checks if entered date format is valid with regex pattern
                Pattern pattern = Pattern.compile("^\\d{4}/\\d{2}/\\d{2}$");
                if (!pattern.matcher(birthdate).matches()) {
                    System.out.println("Invalid date format. Please enter in yyyy/mm/dd format!");
                }
                //compute age
                LocalDate bday = LocalDate.parse(birthdate.replace("/", "-"), DateTimeFormatter.ISO_LOCAL_DATE);
                LocalDate datetoday = LocalDate.now();
                Period age = Period.between(bday, datetoday);
                int agecomputed = age.getYears();

                //check if age is acceptable to be in college
                if (agecomputed >= 17 && agecomputed <= 25) {
                    break;
                } else {
                    System.out.println("Age not acceptable!");
                }
            } catch (Exception e) {
                System.out.println("Invalid Date!");
            }
        }
        return birthdate;
    }

    //COURSE VALIDATION
    public static String validateCourse() {
        String course = "";
        while (true) {
            System.out.print("Course: ");
            course = sc.nextLine();
            if (course.matches("[a-zA-Z~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]{1,50}$")) {
                break;
            } else {
                System.out.println("Invalid Course!");
            }
        }
        return course;
    }

    //EMAIL VALIDATION
    public static String validateEmail() {
        String emailadd = "";
        while (true) {
            System.out.print("Email Address: ");
            emailadd = sc.nextLine();
            Pattern pattern1 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern1.matcher(emailadd);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("Invalid email address!");
            }
        }
        return emailadd;
    }


    //EXTRACT FIRST LETTER FROM SURNAME
    public static String extractFirstletter(String lastnamee){
        Pattern pattern = Pattern.compile("^\\w");
        Matcher matcher = pattern.matcher(lastnamee);
        if (matcher.find()){
            String firstlettersurname = matcher.group().toLowerCase();
            return firstlettersurname;
        }
        System.out.println("No match found");
        return "";
    }



    //CREATE STUDENT NUMBER USING THE VALIDATIONS
    public static String createStudentNumber(String birthdate, String lastname) {

        //Get the date now using LocalDate class, convert to string and get the value of year
        LocalDate yeardate = LocalDate.now();
        String yeartoDate = String.valueOf(yeardate.getYear());

        //Get the entered birthday using LocalDate class and parsing the birthdate then follow the format and get the value of day
        LocalDate bday = LocalDate.parse(birthdate.replace("/", "-"), DateTimeFormatter.ISO_LOCAL_DATE);
        String bdaymmdd = String.format("%02d", bday.getDayOfMonth());

        //Get the passed return value of lastname which is the extracted first letter from the public extractfirstletter method
        String surname = extractFirstletter(lastname);

        //FINALLY, RETURN THE RESULT  FROM THE VALIDATIONS
        return yeartoDate + "-" + bdaymmdd + "01" + "-" + surname;
    }

}
