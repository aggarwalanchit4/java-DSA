//🟢 Challenge 13: Safe Division ⚠️

import java.util.Scanner;
public class SafeDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator : ");
        int numerator = sc.nextInt();
        System.out.println("Enter denominator : ");
        int denominator = sc.nextInt();
    if(denominator == 0){
        System.out.println("Division not possible");
    }else{
        System.out.println("Division = " + (numerator/denominator));
    }    
    }
    
}
