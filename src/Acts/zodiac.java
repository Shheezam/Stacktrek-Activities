package Acts;

import java.util.Scanner;

public class zodiac {
    public static void main (String [] args){
        Scanner enteryr = new Scanner(System.in);
        int yr = enteryr.nextInt();


        if (yr <0){
            System.out.print("Invalid Year");
        }
        else if (yr  % 12 == 0) {
           System.out.print("Monkey");
        }
        else if (yr  % 12 == 1) {
            System.out.print("Roster");
        }
        else if (yr  % 12 == 2) {
            System.out.print("Dog");
        }
        else if (yr  % 12 == 3) {
            System.out.print("Pig");
        }
        else if (yr % 12 == 4) {
            System.out.print("Rat");
        }
        else if (yr % 12 == 5) {
            System.out.print("Ox");
        }
        else if (yr % 12 == 6) {
            System.out.print("Tiger");
        }
        else if (yr  % 12 == 7) {
            System.out.print("Hare");
        }
        else if (yr % 12 == 8) {
            System.out.print("Dragon");
        }
        else if (yr % 12 == 9) {
            System.out.print("Snake");
        }
        else if (yr  % 12 == 10) {
            System.out.print("Horse");
        }
        else if (yr  % 12 == 11) {
            System.out.print("Sheep");
        }
        else {
            System.out.print("Invalid Year");
        }
    }
}
