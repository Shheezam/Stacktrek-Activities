package Acts;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        Scanner entmag = new Scanner(System.in);
        float mag = entmag.nextFloat();


        if (mag <2.0){
            System.out.print("Micro");
        }
        else if (mag >= 2.0 && mag < 3.0) {
            System.out.print("Very minor");
        }
        else if (mag >= 3.0 && mag < 4.0) {
            System.out.print("Minor");
        }
        else if (mag >= 4.0 && mag < 5.0) {
            System.out.print("Light");
        }
        else if (mag >=5.0 && mag < 6.0) {
            System.out.print("Moderate");
        }
        else if (mag >= 6.0 && mag <7.0) {
            System.out.print("Strong");
        }
        else if (mag >= 7.0 && mag < 8.0) {
            System.out.print("Major");
        }
        else if (mag >= 8.0 && mag < 10.0) {
            System.out.print("Great");
        }
        else if (mag >=10.0) {
            System.out.print("Meteoric");
        }
        else {
            System.out.print("Invalid Magnitude");
        }


    }
}
