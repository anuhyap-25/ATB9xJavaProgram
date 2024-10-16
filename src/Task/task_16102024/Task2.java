package Task.task_16102024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int max = a>b ? a:b;

        System.out.println("Largest number is :" + max );
    }
}
