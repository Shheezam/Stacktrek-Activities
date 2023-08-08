package Designpatterns.ItalianResto;

public class Alfredo implements Pasta{
    @Override
    public int getPrice() {
        return 185;
    }

    @Override
    public void serve() {
        System.out.println("Serving Alfredo to the table!");
    }
}
