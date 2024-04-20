public class console{
    public static void main(String[] args) {
        String name = System.console().readLine();
        System.out.println("Hello, " + name);
    }
}