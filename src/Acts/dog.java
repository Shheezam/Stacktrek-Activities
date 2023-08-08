package Acts;

import java.util.Scanner;

public class dog {
    public static void main(String[] args) {
        Scanner enterage = new Scanner(System.in);
        int humanyrs = enterage.nextInt();
        int dogyrs;

        if(humanyrs <0 ){
            System.out.print("invalid human year");
        } else if (humanyrs <=2) {
            float first2humanyrs  = (float) (humanyrs * 10.5);
            System.out.print(first2humanyrs);
        } else {
            dogyrs = (humanyrs -2) * 4 + 21 ;
            System.out.print(dogyrs);
        }
    }
}
