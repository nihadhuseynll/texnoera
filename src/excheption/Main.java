package excheption;

import java.util.Scanner;

public class Main {

    public static void enterClub(int age){
        if(age<18){
            throw new InvalidAgeException("Invalid age");
        }else {
            System.out.println("true");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        try {
            enterClub(age);
        }catch (InvalidAgeException e){

        }
    }



}
