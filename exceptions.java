import java.util.Scanner;
import java.util.*;

public class exceptions {
    public static void main(String[] args) {
        // int index;
        int[] numbers = { 897, 56, 78, 79, 67, 57, 76 };
        System.out.println("Elments in the array are: ");
        System.out.println(Arrays.toString(numbers));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of the required element: ");
        int index = sc.nextInt();
        if (index <= 7) {
            System.out.println("elemnt in the given index :: " + numbers[index]);
        } else {
            try {
                System.out.println("out of range");
            } catch (Exception e) {
                // System.out.println("out of range");
            }

        }
    }
}
