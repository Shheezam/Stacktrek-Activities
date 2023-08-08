package Designpatterns.ItalianResto;

public class PastaKitchen {
    private  static PastaKitchen instance;
    private PastaKitchen(){}

    public  static  synchronized PastaKitchen getInstance(){
        if (instance == null) {
            instance = new PastaKitchen();
        }
        return instance;
    }

    public Pasta cook(String order){
        if (order == null){
            return null;
        }

        if(order.equalsIgnoreCase("carbonara")){
            return new Carbonara();
        } else if (order.equalsIgnoreCase("spaghetti")) {
            return new Spaghetti();
        } else if (order.equalsIgnoreCase("alfredo")) {
            return new Alfredo();
        } else {
            throw new IllegalArgumentException("No pasta type available: " + order);
        }
    }

}
