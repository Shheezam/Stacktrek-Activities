package design_pattern.observer;

public class HexaObserver extends Observer {

    private Subject subject;

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex Observer: " + Integer.toHexString(subject.getState()));
    }
}
