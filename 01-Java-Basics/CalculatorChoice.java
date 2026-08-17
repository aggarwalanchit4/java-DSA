//🟢 Challenge 15: Calculator with Operation Choice

import java.util.Scanner;

public class CalculatorChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("Choose operation ");
        String  operation = sc.next();
    if(operation.equals("+")){
        System.out.println("Sum of num1 and num2 is " + (num1 + num2));
    }
    else if(operation.equals("*")){
        System.out.println("Product of num1 and num2 is " + (num1 * num2));
    }
     
    else if(operation.equals("-")){
        System.out.println("Difference of num1 and num2 is " + (num1 - num2));
    }
    else if(operation.equals("/")){
    if(num2 == 0){
        System.out.println("Cannot divide by zero");
    } else {
        System.out.println("Division of num1 and num2 is " + (num1 / num2));
    }
    }
    else {
    System.out.println("Invalid operation");
    }
     
        
    }
}
