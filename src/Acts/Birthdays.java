package Acts;

import java.util.Scanner;

public class Birthdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,x,p, evbday=0, odbday =0, money = 0, totalmoney=0;
        float amount;

        n = input.nextInt(); //age
        x = input.nextInt(); //washing machine price
        p = input.nextInt(); //price of toy sold
//read the age
        for (int i = 1; i <=n ; i++) {
//if even birthday year count it
            if (i % 2 == 0) {
                    evbday++;
            }
//if odd birthday year count it
            else {
                odbday++;
            }
        }
//even means every even birthday year Shem has 10usd money minus stolen money  of 1usd(-evbday) from brother
// oddbday year will receive a toy and solds them for 'p' price
        for (int i =1; i <= evbday; i++){
            money += i * 10;
            totalmoney = money - evbday;
        }

        amount= totalmoney + (p * odbday);
//determine if Shem will have money left after buying the washing machine,
// or he will not be able to buy and needs more money
        if (amount >= x){
            System.out.printf("Yes! you still have %.2f left", amount - x);
        }
        else {
            System.out.printf("No! you still need %.2f", x - amount);
        }
    }
}
