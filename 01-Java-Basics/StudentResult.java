//🟢 Challenge 17: Student Result & Division 🎓

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String result;

        System.out.println("Enter marks in maths: ");
        int maths = sc.nextInt();

        System.out.println("Enter marks in physics: ");
        int physics = sc.nextInt();

        System.out.println("Enter marks in chemistry: ");
        int chemistry = sc.nextInt();

        int total = maths + physics + chemistry;
        double percentage = (total / 300.0) * 100;
         
        
        System.out.println("Total marks obtained: " + total +  " out of 300");
        System.out.println("Percentage obtained: " + percentage);

        if(maths >= 33 && chemistry >= 33 && physics >= 33){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println("Result status: " + (result));
        if(result.equals("Passed") && percentage >= 60){
            System.out.println("Passed with first division");
        }
        else if(result.equals("Passed") && percentage < 60 && percentage >= 45){
            System.out.println("Passed with second division");
        }
        else if(result.equals("Passed") && percentage < 45 && percentage >= 33) {
            System.out.println("passed with third division");
        }
        else{
            System.out.println("No division");
        }
    }
    
}
