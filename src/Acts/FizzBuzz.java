package Acts;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 500:");
        int num = number.nextInt();

        if((num >= 0) && (num <=500)){
            if((num % 5 == 0) && (num % 7 == 0) ){
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("Fizz");
            } else if (num % 7 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(num);
            }
        }
        else{
            System.out.println("Invalid number, Enter number between 0 and 500");
        }
    }
}

