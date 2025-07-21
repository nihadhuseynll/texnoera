package encapsulation;

public class Calculator {
    public static String calculate(double[] numbers, char operation) {
        if (numbers.length == 0) return "Array boşdur";

        double result = numbers[0];

        switch (operation) {
            case '+':
                result = 0;
                for (double num : numbers) result += num;
                break;
            case '-':
                for (int i = 1; i < numbers.length; i++) result -= numbers[i];
                break;
            case '*':
                result = 1;
                for (double num : numbers) result *= num;
                break;
            case '/':
                for (int i = 1; i < numbers.length; i++) result /= numbers[i];
                break;
            default:
                return "Yanlış əməliyyat!";
        }

        return "Nəticə: " + result;
    }
}