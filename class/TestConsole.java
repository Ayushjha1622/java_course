public class TestConsole {
 public static void main(String[] args) {
    Console console = System.console();
    System.out.println("console="+console);
    console.writer().println("hello from console");
 }   
}
