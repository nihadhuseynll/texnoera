package polymorphism;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String run() {
        return this.getName() + " running";
    }
}
