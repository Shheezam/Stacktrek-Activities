package Acts;

import java.util.Scanner;

public class MinMaxDiversity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, num, largest=0, lowest=0, divisible =0;

        for (i =0; i <10; i++) {
            num = input.nextInt();
            if (num > largest){
                largest = num;
            }
            if(i==0&&num>0)
                lowest=num;
            if (num < lowest){
                lowest= num;
            }
            if(num % 3 == 0){
               divisible = divisible +1;
            }
        }
        System.out.println("Highest: " + largest);
        System.out.println("Lowest: " + lowest);
        System.out.print(divisible + " numbers divisible by 3");
    }
}
