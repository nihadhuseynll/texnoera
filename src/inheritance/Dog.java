package inheritance;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void doRun(int speed){
        super.doRun(speed);
        System.out.println("Dog run");
    }
}
