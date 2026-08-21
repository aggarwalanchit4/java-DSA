// 🟢 Challenge 27: Count Even & Odd Numbers 🔢

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = sc.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter number " + i + ": ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}