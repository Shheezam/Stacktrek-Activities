package Acts;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static Object basicmath(String word) {
        String patternString = "(\\d+(\\.\\d+)?)\\s+(plus|minus|times|divided\\s+by)\\s+(\\d+(\\.\\d+)?)";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(word);

        double result = 0.0;
        try{
        if (matcher.find()) {

            double operand1 = Double.parseDouble(matcher.group(1));
            double operand2 = Double.parseDouble(matcher.group(4));
            String operator = matcher.group(3);

            switch (operator) {
                case "plus":
                    result = operand1 + operand2;
                    break;
                case "minus":
                    result = operand1 - operand2;
                    break;
                case "times":
                    result = operand1 * operand2;
                    break;
                case "divided by":
                    result = operand1 / operand2;
                    break;
            }
        } else {
            return null;
        }
        }catch (Exception e){
            return  null;
        }

        DecimalFormat format = new DecimalFormat("#.##");
        return format.format(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            String result = (String) Solution.basicmath(input);
            System.out.println("Output: " + result);
        }

        scanner.close();
    }
}
