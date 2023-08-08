package Designpatterns.ItalianResto;

public class Carbonara implements Pasta{

    @Override
    public int getPrice() {
            return 160;
    }

    @Override
    public void serve()  {
        System.out.println("Serving Carbonara to the table!");
    }
}
