package Acts;

public class Basic {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 4;
       /* System.out.println(c);
       // System.out.print(a);
        if((a==b) && (a==c)){
            System.out.println("This is true");
        }*/
        switch (c){
            case 1:
                System.out.println("First Place");
                break;
            case 2:
                System.out.println("Second Place");
                break;
            case 3:
                System.out.println("Third Place");
                break;
            default:
                System.out.println("Consolation");
        }
        System.out.println("Continue Coding");

        String basketbal = "KURIKONG";
        switch (basketbal)
        {
            case "KURIKONG":
                System.out.println("CHAMPION");
                break;
            case "LEBRON":
                System.out.println("GOAT");
                break;
            case "JORDAN":
                System.out.println("GOATEST");
                break;
            default:
                System.out.println("booh");
        }
    }
}
