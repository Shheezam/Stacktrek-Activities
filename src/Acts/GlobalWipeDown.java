package Acts;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GlobalWipeDown {
    public static void main(String[] args) {

        String SizeofFile= "1gb";
        String Speed = "15mbps";

        //Return the download time (result)
        Object result = downloadtime(SizeofFile, Speed);
        if (result == null) {
            System.out.println("Invalid file size format.");
        } else {
            double downloadTimeInMinutes = (double) result;
            DecimalFormat df = new DecimalFormat();
            System.out.println(df.format(downloadTimeInMinutes));
        }

    }
    public static Object downloadtime(String filesize, String speed){
        double fileSizeInBits = getFileSizeInBits(filesize);
        if (Double.isNaN(fileSizeInBits)) {
            return null;
        }

        Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)\\s*(\\S+)");
        Matcher matcher = pattern.matcher(speed);
        if (!matcher.matches()) {
            return null;
        }

        String speedUnit = matcher.group(2).toLowerCase();
        if (!speedUnit.equals("mbps")) {
            return null;
        }

        double speedInMbps = Double.parseDouble(matcher.group(1));
        double downloadTimeInMinutes = fileSizeInBits / (speedInMbps * 1000000 * 60);
        DecimalFormat df = new DecimalFormat("#.###");
        return Double.parseDouble(df.format(downloadTimeInMinutes));

    }

    private static double getFileSizeInBits(String fileSize) {
        // Use regex to extract numeric value and unit of measurement
        Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)\\s*(\\S+)");
        Matcher matcher = pattern.matcher(fileSize);

        // If pattern matches, extract numeric value and unit of measurement
        if (matcher.find()) {
            double value = Double.parseDouble(matcher.group(1));
            String unit = matcher.group(2).toLowerCase();

            // Convert file size to bits
            if (unit.matches("kb")){
                return value * 1000 * 8;
            } else if (unit.matches("mb")) {
                return value * 1000 * 1000 * 8;
            } else if (unit.matches("gb")) {
                return value * 1000 * 1000 * 1000 * 8;
            }
            else {
                return Double.NaN;
            }
        }

        // If pattern does not match or unit of measurement is not recognized, return null
        return Double.NaN;
    }

}