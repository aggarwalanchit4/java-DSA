//🟢 Challenge 18: Number Countdown 🔢


import java.util.Scanner;


public class Countdown{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int countdown = sc.nextInt();
    for (int i = countdown; i >= 1; i--) {
    System.out.println(i);
    }
}
}

