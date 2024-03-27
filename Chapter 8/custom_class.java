class Employee {
    int id;
    int salary;
    String name;

    public void printdetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary(){
        return salary;
    }

}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class.");
        Employee ayush = new Employee();
        Employee Saloni = new Employee();

        // setting attributes
        ayush.id = 12;
        ayush.name = "Ayush jha";
        ayush.salary = 6000;

        Saloni.id = 13;
        Saloni.name = "Saloni";
        Saloni.salary = 7000;


        // printing the attributes
        ayush.printdetails();
        Saloni.printdetails();
        int Salary = Saloni.getSalary();
        System.out.println(Salary);
        // System.out.println(ayush.id);
        // System.out.println(ayush.name);
    }
}