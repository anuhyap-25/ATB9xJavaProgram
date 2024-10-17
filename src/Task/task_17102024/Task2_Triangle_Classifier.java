package Task.task_17102024;

import java.util.Scanner;

public class Task2_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side1: ");
        int s1 = sc.nextInt();
        System.out.println("Enter the value of side2: ");
        int s2 = sc.nextInt();
        System.out.println("Enter the value of side3: ");
        int s3 = sc.nextInt();
        if(s1==s2 && s1==s3)
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
