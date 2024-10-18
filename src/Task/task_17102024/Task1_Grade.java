package Task.task_17102024;

import java.util.Scanner;

public class Task1_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        char grade = 0;
        if(score >= 90 && score<=100)
        {
            grade = 'A';
        } else if (score<= 89 && score>=80) {
            grade = 'B';
        } else if (score<= 79 && score>=70) {
            grade = 'C';
        } else if (score<=69 && score>=60) {
            grade = 'D';
        } else if (score<=0 || score>100) {
            System.out.println("Enter valid number");
        } else {
            grade = 'F';
        }
        System.out.printf("Your grade is %s", grade);
        sc.close();
    }
}
