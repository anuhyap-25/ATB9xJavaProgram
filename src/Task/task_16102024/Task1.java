package Task.task_16102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Enter the salary: ");
        int salary = scanner.nextInt();

        scanner.close();
    }
}

