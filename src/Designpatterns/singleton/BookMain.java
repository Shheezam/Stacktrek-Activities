package Designpatterns.singleton;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        SingletonBook bookdb = SingletonBook.getInstance();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter '1' to add book, '2' to view books, '3' to delete book, or '4' to exit:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter book ID:");
                int id = scanner.nextInt();
                System.out.println("Enter book name:");
                String name = scanner.next();
                bookdb.addBook(id, name);
            } else if (choice == 2) {
                bookdb.viewBooks();
            } else if (choice == 3) {
                System.out.println("Enter book ID to delete:");
                int id = scanner.nextInt();
                bookdb.deleteBook(id);
            } else if (choice == 4) {
                System.exit(0);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
