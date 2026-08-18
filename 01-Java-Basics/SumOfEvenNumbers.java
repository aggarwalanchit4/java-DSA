//🟢 Challenge 20: Sum of Even Numbers 🔢

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int total = 0;
        for(int i = 0 ; i <= number ; i++){
            if(i%2 ==0){

            
            total = total + i;
            }
        }

        System.out.println("Sum of even numbers up to " + number + " is " + total);
    }
}
