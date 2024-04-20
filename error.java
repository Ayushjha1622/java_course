
import java.io.*;

class error {

    public static void main(String[] args) {
        try {
            System.out.println("1");
            // FileInputStream abc = new FileInputStream("d:/xyz.txt");
            System.out.println(30 / 0);

            // } catch (ArithmeticException e) {
            // System.out.println("catch block 1");
            // }

            // catch (Exception e) {
            // System.out.println("catch block 2");
        } finally {
            System.out.println("finally");
        }
    }
}