import java.util.Scanner;

public class ArithmeticOperations {
    double number1;
    double number2;

    ArithmeticOperations(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    double addition() { // метод сложение возвращает число типа double
        return this.number1 + number2;
    }

    double subtraction() { // метод сложение возвращает число типа double
        return this.number2 - number1;
    }

    double multiplication() { // метод сложение возвращает число типа double
        return this.number1 * number2;
    }

    double division() { // метод сложение возвращает число типа double
        return this.number2 / number1;
    }

    public static void main(String[] args)

    {
        System.out.print("Введите два числа через пробел");
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        ArithmeticOperations a = new ArithmeticOperations(number1, number2);
        double result1 = a.addition();
        double result2 = a.subtraction();
        double result3 = a.multiplication();
        double result4 = a.division();
        System.out.println("addition = " + result1);
        System.out.println("subtraction = " + result2);
        System.out.println("multiplication = " + result3);
        System.out.println("division = " + result4);

        if ((result1 % 2) == 0) {
            System.out.println("The addition is even");
        } else {
            System.out.println("The addition is odd");
        }
    }
}
