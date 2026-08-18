//🟢 Challenge 19: Sum of N Numbers 

import java.util.Scanner;

public class SumOfNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int total = 0;
        for(int i = 0 ; i <= number ; i++){
            total = total + i;
        }

        System.out.println("Sum of first " + number + " numbers is " + total);
    }





}