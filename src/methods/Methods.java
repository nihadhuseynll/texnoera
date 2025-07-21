package methods;

public class Methods {

    public static int getTest(int a,int b){
        return a+b;
    }

    public static int add(int a,int b){
        return a*b;
    }

    public static int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {

        System.out.println( getTest(add(sub(3,9),9),8));
    }


}
