package Acts;

import java.util.Scanner;

public class EndLoop {
    public static void main(String[] args) {

        String stop= "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 500:");
        while(!stop.equalsIgnoreCase("End")){
            //As long user-input is not equals to the word end, code runs, execute next block of code
            stop = input.nextLine();
            if(!stop.equalsIgnoreCase("End")){
                //As long user-input is not equals to the word end, and is an integer,accept user-input continuously
                int num = Integer.parseInt(stop);
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
    }
}