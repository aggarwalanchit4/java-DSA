//🟢 Challenge 09: Grade Calculator 🎓

public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 77;
    if(90 <= marks && marks <=100){
        System.out.println("Grade A");
    }else if(80<=marks && marks <90){
        System.out.println("Grade B");
    }else if(70<= marks  && marks < 80){
        System.out.println("Grade : C");
    }else if(60<= marks && marks < 70){
        System.out.println("Grade : D");
    }else{
        System.out.println("Fail");
    }
    }
}
