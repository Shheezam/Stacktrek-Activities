package Designpatterns.singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingletonBook {


    //2 private static variable that holds the single instance.
    private static SingletonBook instance;
    private Map<Integer, String> bookMap;


    //1 private constructor of the class. Initializes the bookMap instance variable as a new HashMap
    private SingletonBook() {
        bookMap = new HashMap<>();
    }

    //3 public method that returns the single instance of the SingletonBook class. It checks if null then create new otherwise returns existing instance
    public static SingletonBook getInstance() {
        if (instance == null) {
            instance = new SingletonBook();
        }
        return instance;
    }

    public void addBook(int id, String name) {
        //check first if id already exist by using 'containsKey'
        if ((bookMap.containsKey(id))){
            System.out.println("Book ID is already used");
            return;
        }
        //if id doesn't exist in db then let user add the id to the db
            bookMap.put(id, name);
        System.out.println("Book added successfully");
    }

    public void deleteBook(int id) {
        if (bookMap.containsKey(id)) {
            bookMap.remove(id);
            System.out.println("Book deleted successfully.");
        } else if (bookMap.isEmpty()) {
            System.out.println("No books or book ID found to delete.");
        } else {
            System.out.println("Book ID not found.");
        }
    }

    public void viewBooks() {
        if (bookMap.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
                System.out.println("Book ID: " + entry.getKey() + ", Book Name: " + entry.getValue());
            }
        }
        System.out.println();
    }
}
