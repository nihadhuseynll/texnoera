package genericclass;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] integerArray = {1, 3, 5, 7, 9};
        String[] stringArray = {"test", "testr", "tefdrf"};
        Character[] characterArray = {'a', 'b', 'c'};

        Student[] studentArray = {new Student("ad"), new Student("ad2")};

//        IntegerClass.write(integerArray);
//        StringClass.write(stringArray);
//        CharClass.write(characterArray);
//        StudentClass.write(studentArray);
//

        WriteClass<Integer> writeClass = new WriteClass<>();
        WriteClass<String> writeClass2 = new WriteClass<>();
        WriteClass<Character> writeClass3 = new WriteClass<>();
        WriteClass<Student> writeClass4 = new WriteClass<>();

        writeClass.write(integerArray);
        writeClass2.write(stringArray);
        writeClass3.write(characterArray);
        writeClass4.write(studentArray);

        int[] array1 = {1,2,2,1};
        int[] array2 = {2,2};

    }
}
