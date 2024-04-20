import java.util.Scanner;

public class class_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {

            int c = a / b;
            System.out.println(c);
            System.out.println("exception occurs");
        } catch (Exception e) {
            System.out.println("exception occurs");
        }

    }
}