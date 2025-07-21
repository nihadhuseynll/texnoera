package polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String run() {
        return this.getName() + " running";
    }
}
