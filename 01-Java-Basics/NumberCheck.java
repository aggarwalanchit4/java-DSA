//🟢 Challenge 08: Even, Odd & Divisibility 🔢

public class NumberCheck {
    public static void main(String[] args) {
        int a = 4232432;
    if(a%2 == 0 && a%3 == 0){
        System.out.println(a + " is even and divisible by 3");
    }
    else if(a%2==0 && a%3 != 0){
        System.out.println(a + " is even but not divisible by 3");
    }
    else if(a%2 !=0 && a%3 == 0) {
        System.out.println(a + " is odd and divisible by 3");
    }
    else {
        System.out.println(a + " is odd but not divisible by 3");
    }
    }
    
}
