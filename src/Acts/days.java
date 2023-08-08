package Acts;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner enteredmonth = new Scanner(System.in);

        int month = enteredmonth.nextInt();
        if (month == 1){
            System.out.print("31 days");
        }
        else if (month == 2) {
            System.out.print("28 or 29 days");
        }
        else if (month==3) {
            System.out.print("31 days");
        }
        else if (month==4) {
            System.out.print("30 days");
        }
        else if (month==5) {
            System.out.print("31 days");
        }
        else if (month==6) {
            System.out.print("30 days");
        }
        else if (month==7) {
            System.out.print("31 days");
        }
        else if (month==8) {
            System.out.print("31 days");
        }
        else if (month==9) {
            System.out.print("30 days");
        }
        else if (month==10) {
            System.out.print("31 days");
        }
        else if (month==11) {
            System.out.print("30 days");
        }
        else if (month==12) {
            System.out.print("31 days");
        }

    }
}