//🟢 Challenge 23: Reverse a Number 🔄

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = sc.nextInt();
        int reverse = 0;
        while(number > 0){
            int digit = number % 10;
            number = number/10;
            reverse = reverse * 10 + digit;
        }
            System.out.println("Reverse number : " + reverse);
        
    }
    
}
