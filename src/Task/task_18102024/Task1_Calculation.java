package Task.task_18102024;

import java.util.Scanner;

public class Task1_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/,%): ");
        String op = sc.next();
        switch(op){
            case "+":
                System.out.println("Result = " +(num1+num2));
                break;
            case "-":
                System.out.println("Result = " +(num1-num2));
                break;
            case "*":
                System.out.println("Result = " +(num1*num2));
                break;
            case "/":
                System.out.println("Result = " +(num1/num2));
                break;
            case "%":
                System.out.println("Result = " +(num1%num2));
                break;
            default:
                System.out.println("Select a valid operator.");
        }
        sc.close();
    }
}
