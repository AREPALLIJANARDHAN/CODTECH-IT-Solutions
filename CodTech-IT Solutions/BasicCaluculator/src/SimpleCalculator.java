import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("_____________________________________________");
            System.out.println("SimpleCalculator's Menu Addition / Subtraction / Multiplication /Division");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("press 5 for Exit");
            System.out.println("Please make your choice by typing number below");
            int choice = scanner.nextInt();
            if (choice > 0 && choice < 5) {
                System.out.println("please enter your first number");
                double a = scanner.nextDouble();
                System.out.println("please enter your first number");
                double b = scanner.nextDouble();
                switch (choice) {
                    case 1:
                        System.out.println("Result is " + Add(a, b));
                        break;
                    case 2:
                        System.out.println("Result is " + Subtract(a, b));
                        break;
                    case 3:
                        System.out.println("Result is " + Multiply(a, b));
                        break;
                    case 4:
                        try {
                            System.out.println("Result is " + Divide(a, b));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                }

            }
            else {
                    if(choice==5){
                    System.out.println("you choose exit !Bye Bye");
                    break;
                }
            }

        }
        scanner.close();
    }
    public static double Add(double a,double b){
       return a+b;
    }
    public static double Subtract(double a,double b){
        return a-b;
    }
    public static double Multiply(double a,double b){
        return a*b;
    }
    public static double Divide(double a,double b) throws Exception{
        if(b==0){
            throw new Exception("Denominator can't be Zero ! you get Infinity");
        }
      return a/b;
    }

}