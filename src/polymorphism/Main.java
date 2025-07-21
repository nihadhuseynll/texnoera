package polymorphism;

import java.util.ArrayList;

public class Main {

    public static void running(Animal animal){
        System.out.println(animal.run());
    }

    public static void main(String[] args) {
//        Animal animal = new Animal("Animal");
//        System.out.println(animal.run());
//
//        Animal animal2 = new Dog("Dog");
//        System.out.println(animal2.run());
//
//        Animal animal3 = new Cat("Cat");
//        System.out.println(animal3.run());
//
//        Animal animal4 = new Fish("Fish");
//        System.out.println(animal4.run());

        running(new Cat("Cat"));
        running(new Dog("Dog"));
        running(new Bird("Bird"));
        running(new Fish("Fish"));

        Bird animal = new Bird("Bird");

        if(animal instanceof Bird){
            System.out.println("true");
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("bird");
        arrayList.add("fish");

//        System.out.println(arrayList);
//        System.out.println(arrayList.get(2));
//        arrayList.remove("cat");
//        arrayList.remove(2);
//        System.out.println(arrayList);
        arrayList.add(0,"animal");
        System.out.println(arrayList);

    }
}
