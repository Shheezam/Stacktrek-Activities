package Acts;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegistrationPortal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //FIRST NAME VALIDATION
        String firstname = "";
        while (true) {
            System.out.print("First Name: ");
            firstname = sc.nextLine();
            //no numerals, no special charcaters, limit to 50 characters
            if (firstname.matches("[a-zA-Z ]{1,50}$")) {
                break;
            }
            else {
                System.out.println("Invalid First Name!");
            }

        }

        //LAST NAME VALIDATION
        String lastname = "";
        while (true) {
            System.out.print("Last Name: ");
            lastname = sc.nextLine();
            //no numerals, no special charcaters, limit to 50 characters
            if (lastname.matches("[a-zA-Z ]{1,50}$")) {
                break;
            }
            else {
                System.out.println("Invalid First Name!");
            }

        }

        //BIRTHDAY VALIDATION
        String birthdate = "";
        while (true){
            System.out.print("Birthday (yyyy/mm/dd): ");
           birthdate = sc.nextLine();
            try {
                //checks if entered date format is valid with regex pattern
                Pattern pattern = Pattern.compile("^\\d{4}/\\d{2}/\\d{2}$");
                if (!pattern.matcher(birthdate).matches()){
                    System.out.println("Invalid date format. Please enter in yyyy/mm/dd format!");
                }
                //compute age
                LocalDate bday = LocalDate.parse(birthdate.replace("/", "-"), DateTimeFormatter.ISO_LOCAL_DATE);
                LocalDate datetoday = LocalDate.now();
                Period age = Period.between(bday, datetoday);
                int agecomputed = age.getYears();

                //check if age is acceptable to be in college
                if (agecomputed >= 17 && agecomputed <=25){
                    break;
                }else {
                    System.out.println("Age not acceptable!");
                }

            }catch (Exception e){
                System.out.println("Invalid Date!");
            }
        }

        //COURSE VALIDATION
        String course = "";
        while (true) {
            System.out.print("Course: ");
            course = sc.nextLine();
            //no numerals, limit to 50 characters
            if (course.matches("[a-zA-Z~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]{1,50}$") ){
                break;
            } else {
                System.out.println("Invalid Course!");
            }
        }

        //EMAIL VALIDATION
        String emailadd = "";
        while (true){
            System.out.print("Email Address: ");
            emailadd = sc.nextLine();
            //regex pattern based on common email pattern
            Pattern pattern1 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern1.matcher(emailadd);
            if (matcher.matches()){
                break;
            }
            else {
                System.out.println("Invalid email address!");
            }
        }


       //-----------------CREATE STUDENT NUMBER USING THE VALIDATIONS-------------------//

        //Get the date now using LocalDate class, convert to string and get the value of year
        LocalDate yeardate = LocalDate.now();
        String yeartoDate = String.valueOf(yeardate.getYear());

        //Get the entered bday using LocalDate class, create string for it then follow the format and get the values of month and day
        LocalDate bday = LocalDate.parse(birthdate.replace("/", "-"),DateTimeFormatter.ISO_LOCAL_DATE);
        String bdaymmdd = String.format("%02d", bday.getDayOfMonth());

        //Get surname, using regex, get the first letter of the surname
        String surname = lastname.replaceAll("^(.).*", "$1");

        //----------------------FINAL OUTPUT FORMAT---------------------------------------------//
        String StudentNumber = yeartoDate + "-" + bdaymmdd + "01" + "-" + surname.toLowerCase();
        System.out.println(StudentNumber);

}
}





