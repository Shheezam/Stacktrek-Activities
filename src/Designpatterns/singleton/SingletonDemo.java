package Designpatterns.singleton;

public class SingletonDemo {

    private static SingletonDemo instance; // 2

    private SingletonDemo() { // 1

    }

    public static SingletonDemo getInstance() { // 3
        if (instance == null) {
            instance = new SingletonDemo();
        }

        return instance;
    }
}
