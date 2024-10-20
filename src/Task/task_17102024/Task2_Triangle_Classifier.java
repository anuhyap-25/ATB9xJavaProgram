package Task.task_17102024;

import java.util.Scanner;

public class Task2_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side1: ");
        double s1 = sc.nextDouble();
        System.out.println("Enter the value of side2: ");
        double s2 = sc.nextDouble();
        System.out.println("Enter the value of side3: ");
        double s3 = sc.nextDouble();
        if(s1<=0 || s2<=0 || s3<=0)
        {
            System.out.println("Invalid input: Input should be a positive number");
        } else if (s1==s2 && s1==s3 && s2==s3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (s1 == s2 || s2 == s3 || s3 == s1)
        {
            System.out.println("Isoceles Traingle");
        }
        else
        {
            System.out.println("Scalene Traingle");
        }
        sc.close();
    }
}
