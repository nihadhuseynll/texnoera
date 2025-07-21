package OverLoading;

public class Main {

    public static void toplama(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void toplama(int a,int b){
        System.out.println(a+b);
    }

    public static void toplama(String a,String b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        toplama(1,3,7);

        toplama(1,2,3);
        toplama("Hello","World");
    }
}
