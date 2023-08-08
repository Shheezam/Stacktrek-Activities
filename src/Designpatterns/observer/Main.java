package design_pattern.observer;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        System.out.println(subject.getState()); // 0

        binaryObserver.update();
        hexaObserver.update();
        octalObserver.update();


        System.out.println("----------");

        subject.setState(20);

        System.out.println(subject.getState());

        subject.notifyAllObservers();



    }
}
