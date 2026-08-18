//🟢 Challenge 22: Sum of Digits 🔢

import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = sc.nextInt();
        int total = 0;
        while(number > 0){
            int digit = number % 10;
            number = number/10;
            total = total + digit;
        }
            System.out.println("Sum of digits: " + total);
        
    }
}
