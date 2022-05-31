package Exercises;

import java.util.Scanner;

public class ConditionalStatementExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double BMI = Double.parseDouble(scanner.nextLine());
//        if (BMI<18.5){
//            System.out.println("underweight");
//        } else if (BMI >= 18.5 && BMI < 25) {
//            System.out.println("normal");
//        } else if (BMI >= 25 && BMI < 30) {
//            System.out.println("overweight");
//        } else if (BMI >= 30) {
//            System.out.println("obese");
//        }
//        int a = Integer.parseInt(scanner.nextLine());
//        if (a < 0){
//            System.out.println("negatif");
//        }else if (a>0){
//            System.out.println("pozitif");
//        } else {
//            System.out.println("nötr");
//        }
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a > b) {
            if (a > c) {
                System.out.println("enbüyüksayı =" + a);
            } else if (c > a) {
                System.out.println("enbüyüksayı = " + c);
            }
        } else if (a < b) {
            if (b > c) {
                System.out.println("enbüyüksayı =" + b);
            } else if (c > b) {
                System.out.println("enbüyüksayı =" + c);
            }
        }
    }
}
