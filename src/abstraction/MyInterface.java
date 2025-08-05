package abstraction;

interface MyInterface {
    void abstractMethod();// Public abstract method

    default void defaultMethod()// Default method using a private method
    {
        System.out.println("Default Method");
        privateMethod();
    }

    static void staticMethod()// Static method using a private method
    {
        System.out.println("Static Method");
        privateStaticMethod();
    }

    private void privateMethod()// Private method for default methods
    {
        System.out.println("Private Method used in a Default Method");
    }

    private static void privateStaticMethod()// Private static method for static methods
    {
        System.out.println("Private Static Method used in a Static Method");
    }
}

