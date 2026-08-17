//🟢 Challenge 10: User Input — Number Check ⌨️

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    System.out.println("The number is: " + number );
    if(number>0){
        System.out.println(number + " is positive");
    }else if(number<0){
        System.out.println(number + " is negative");
    }else{
        System.out.println("number is 0");
    }
    }
}
