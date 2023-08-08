package Designpatterns.singleton;



public class Demo {

    public static void main(String[] args) {

        SingletonDemo singletonDemo = SingletonDemo.getInstance();

        System.out.println(singletonDemo.hashCode());

        SingletonDemo singletonDemo1 = SingletonDemo.getInstance();

        System.out.println(singletonDemo1.hashCode());

    }


}
