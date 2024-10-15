package Task.task_15102024;

public class Task1 {
    public static void main(String[] args) {
        int a=60;
        int b=50;
        int c=30;
        int result= a>b?a:(b>c?b:(c>a?c:a));
        System.out.println(result);
    }
}
