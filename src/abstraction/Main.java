package abstraction;

public class Main {


    public static void main(String[] args) {

        MyInterface myObject = new MyInterface() {
            @Override
            public void abstractMethod() {
                System.out.println("Implementation of the Abstract Method");
            }
        };

        myObject.abstractMethod();
        myObject.defaultMethod();
        MyInterface.staticMethod();
    }
}
