import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = sc.nextInt();
        int original = number;
        int reverse = 0;
        while(number > 0){
            int digit = number % 10;
            number = number/10;
            reverse = reverse * 10 + digit;
        }
        if(original == reverse){
            System.out.println(original + " is palindrome");
        }  else{
            System.out.println(original + " is not palindrome");
        }     
    }
    
    
}
