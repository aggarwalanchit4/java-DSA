//🟢 Challenge 12: User Input — Simple Calculator 🧮

import java.util.Scanner;
public class CalculatorInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        System.out.println("Sum =  " + (number1+ number2));
        System.out.println("Difference = " + (number1 - number2));
        System.out.println("Product = " + (number1*number2));
        System.out.println("Division = " + (number1/number2));
        System.out.println("Remainder = " + (number1%number2));
    }
}
