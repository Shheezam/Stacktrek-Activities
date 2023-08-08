package Acts;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bearing {
    public String speed;
    public String time;
    public float degree;

    public Bearing(String speed, float degree, String time){
        this.speed = speed;
        this.degree = degree;
        this.time = time;

    }

    public float Time_conv(){
        //codehere
        float hour = 0;
        Pattern pattern = Pattern.compile("(\\d+)([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(time);

        if (matcher.find()) {
            int timeVal = Integer.parseInt(matcher.group(1));
            String timeUnit = matcher.group(2);

            switch(timeUnit){
                case "hr":
                    hour = timeVal;
                    break;
                case "min":
                    hour = timeVal/60.0f;
                    break;
                case "sec":
                    hour = timeVal/3600.0f;
                    break;
                default:
                    System.out.println("Invalid time unit: " + timeUnit);
                    System.exit(0); // exit the program if input is invalid
                    break;
            }
        } else {
            System.out.println("Invalid time format: " + time);
           System.exit(0);
        }

        return hour;
    }

    public float Distance(){
        //codehere
        Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)\\s*(knots|km/h)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(speed);

        float speedInKnots = 0;

        if (matcher.find()) {
            float speedVal = Float.parseFloat(matcher.group(1));
            String speedUnit = matcher.group(2);

            if (speedUnit.equals("km/h")) {
                speedInKnots = speedVal / 1.852f;
            } else {
                speedInKnots = speedVal;
            }
        } else {
            System.out.println("Invalid speed unit");
        }

        float timeInHours = Time_conv();
        float distanceInKm = speedInKnots * timeInHours * 1.852f;
        return Math.round(distanceInKm * 100.0f) / 100.0f;
    }

    public String Compass_Bearing(){
        //codehere
        
        String bearing = "";
        if (degree == 0 || degree == 360) {
            return "North";
        } else if (degree == 90) {
            return "East";
        } else if (degree == 180) {
            return "South";
        } else if (degree == 270) {
            return "West";
        } else if (degree > 0 && degree < 90) {
                bearing = "North " + Math.round(Math.abs(90 - degree)* 100.0) / 100.0f + "° East";
        } else if (degree > 90 && degree < 180) {
                bearing = "South " + Math.round(Math.abs(180 - degree)*100.0)/100.0f + "° East";
        } else if (degree > 180 && degree < 270) {
                bearing = "South " + Math.round(Math.abs(degree - 180)* 100.0)/100.0f + "° West";
        } else if (degree > 270 && degree < 360) {
                bearing = "North " + Math.round(Math.abs(360 - degree)* 100.0)/100.0f + "° West";
        } else {
                bearing = "Invalid Degree Value";
        }
            return bearing;
    }


    public String final_answer(){
        //codehere
        float distance = Distance();
        String bearing = Compass_Bearing();
        return String.format("%.2fkm %s", distance,  bearing);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String speed = "";
        while (speed.isEmpty()) {
            System.out.print("Speed: ");
            speed = scanner.nextLine();
        }

        String time = "";
        while (time.isEmpty()) {
            System.out.print("Time: ");
            time = scanner.nextLine();
        }

        float degree = 0;
        while (degree == 0) {
            System.out.print("Degree: ");
            degree = scanner.nextFloat();
        }

        Bearing bearing = new Bearing(speed, degree, time);
        System.out.println(bearing.final_answer());
    }
}
