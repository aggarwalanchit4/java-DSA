//🟢 Challenge 16: Electricity Bill Calculator ⚡

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter electricity units consumed: ");
        int units = sc.nextInt();
        System.out.println("Total units consumed: " + units);
    if(units<0){
        System.out.println("Invalid units please check again");
    }
    else if(units>=0 && units <= 100){
        System.out.println("Total bill : " + (units*5));
    }else if(units> 100 && units <=200 ){
        System.out.println("Total bill : " + ((100*5) + ((units - 100)*7)));
    }else if(units> 200 && units <=300 ){
        System.out.println("Total bill : " + ((100*5) + ((units - 100)*7) + ((units - 200)*10)));
    }
    else{
        System.out.println("Total bill : " + ((100*5) + ((units - 100)*7) + ((units - 200)*10) + ((units-300)*15)));
    }
    }
}
