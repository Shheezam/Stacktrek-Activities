package Acts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gas {


        public static Object Consumption (String gasLoad, String distance, String remaining){

            // Use Matcher to extract numeric values and units of measurement from input strings
            Pattern pattern = Pattern.compile("(\\d+\\.?\\d*)([A-Za-z]+)");
            Matcher matcher1 = pattern.matcher(gasLoad);
            Matcher matcher2 = pattern.matcher(distance);
            Matcher matcher3 = pattern.matcher(remaining);

            // Check if all inputs contain valid numeric values and units of measurement
            if (!matcher1.matches() || !matcher2.matches() || !matcher3.matches()) {
                return null;
            }
            String gasUnit = matcher1.group(2);
            String distUnit = matcher2.group(2);
            String remUnit = matcher3.group(2);

            if (!"L".equals(gasUnit) || !"km".equals(distUnit) || !"L".equals(remUnit)) {
                return null;
            }


            // Parse numeric values from input strings
            double gas = Double.parseDouble(matcher1.group(1));
            double dist = Double.parseDouble(matcher2.group(1));
            double rem = Double.parseDouble(matcher3.group(1));

            // Check if gas load is less than remaining fuel
            if (gas < rem) {
                return null;
            }
            // Check if gas load is equal to remaining fuel
            if (gas == rem) {
                return null;
            }
            if (gas <0){
                return null;
            }

            if (dist < 0) {
                return null;
            }
            // Calculate fuel consumption
            double fuelConsumption = (gas - rem) / dist;


            // Format output string to two decimal places
            String result = String.format("%.2fL/km", fuelConsumption);

            return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gas load: ");
        String gasLoad = scanner.nextLine().trim();

        System.out.print("Enter distance traveled: ");
        String distance = scanner.nextLine().trim();

        System.out.print("Enter remaining fuel: ");
        String remaining = scanner.nextLine().trim();

        Object result = Consumption(gasLoad, distance, remaining);
        if (result == null) {
            System.out.println("Null");
        } else {
            System.out.println(result);
        }
    }

}
