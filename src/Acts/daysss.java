package Acts;
import java.util.Scanner;

public class daysss {
    public static void main(String[] args) {
        Scanner enteredmonth = new Scanner(System.in);

        int month = enteredmonth.nextInt();
        if  (month %2 == 0) {
            System.out.print("30 days");
        }
        else if
        (month==2){
            System.out.print("28 or 29 days");
        }
        else {
            System.out.print("31 days");
        }

    }
}
