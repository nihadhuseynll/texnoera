package polymorphism;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public String run() {
        return this.getName() + " swimming";
    }
}
