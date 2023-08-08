package design_pattern.observer;

public class BinaryObserver extends Observer {

    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary Observer: " + Integer.toBinaryString(subject.getState()));
    }
}
