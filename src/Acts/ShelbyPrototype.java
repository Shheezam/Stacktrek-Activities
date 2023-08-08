package Acts;

import java.text.DecimalFormat;

public class ShelbyPrototype {

    private final double diameter;
    private final int rotation;

    public ShelbyPrototype(double diameter, int rotation) {
        this.diameter = diameter;
        this.rotation = rotation;
    }

    public double circumference() {
        double circumf = diameter * Math.PI;
        return Double.parseDouble(new DecimalFormat("#.##").format(circumf));


    }

    public String calculate(){
        double circumference = circumference();
        double cirConv = circumference * 0.0254;
        double traveledDistance = Math.round(cirConv * rotation / 1000.0);
        String distanceStr = String.format("%06d", (int) traveledDistance);
        String result = "";
        for (int i = 0; i < distanceStr.length(); i++) {
            result += "[" + distanceStr.charAt(i) + "]";
        }
        return  result;
    }

    public static void main(String[] args) {
        ShelbyPrototype res = new ShelbyPrototype (19, 457752);
        double circumference = res.circumference();
        String traveledDistance = res.calculate();
        System.out.println(circumference);
        System.out.println(traveledDistance);
    }

}
