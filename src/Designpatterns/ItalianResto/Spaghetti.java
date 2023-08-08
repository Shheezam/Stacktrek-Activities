package Designpatterns.ItalianResto;

public class Spaghetti implements Pasta{
    @Override
    public int getPrice() {
        return 115;
    }

    @Override
    public void serve() {
        System.out.println("Serving Spaghetti to the table!");
    }
}
