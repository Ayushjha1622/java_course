// public class exception_ways {
//     public static void main(String[] args) {
//         try {
//             System.out.println("1");
//             System.out.println("2");
//             System.out.println("3");
//             System.out.println("4");
//             System.out.println(100 / 0);
//         }
//         // System.out.println("10");
//         catch (ArithmeticException e) {
//             System.out.println("Arithmetic exception is raised");
//         }
//         System.out.println("6");
//         System.out.println("7");
//         System.out.println("8");
//     }
// }

class exceptions_ways {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println(100 / 0);
        }
        // System.out.println("10");
        catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());

        }
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
    }
}