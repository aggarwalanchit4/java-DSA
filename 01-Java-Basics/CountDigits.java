//🟢 Challenge 21: Count Digits 🔢

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = 0;
        while(number > 0){
            number = number/10;
            digit = digit + 1;
        }
            System.out.println("Number of digits: " + digit);
        
    }
}
