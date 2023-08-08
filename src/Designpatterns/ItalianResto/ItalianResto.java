package Designpatterns.ItalianResto;

public class ItalianResto {

    public static void main (String[] args){
        PastaKitchen kitchen =PastaKitchen.getInstance();

        Pasta carbonara = kitchen.cook ("Carbonara");
        Pasta spaghetti = kitchen.cook ("Spaghetti");
        Pasta alfredo = kitchen.cook("Alfredo");

        carbonara.serve();
        System.out.println("The price of carboanara is: " + carbonara.getPrice());
        System.out.println();
        spaghetti.serve();
        System.out.println("The price of spaghetti is: " + spaghetti.getPrice());
        System.out.println();
        alfredo.serve();
        System.out.println("The price of alfredo is: " + alfredo.getPrice());

    }

}
