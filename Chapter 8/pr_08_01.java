class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getname(){
        return name;
    }

    public void setname(String n){
        name = n;
    } 
}


public class pr_08_01 {
    
    public static void main(String[] args) {
        Employee ayush = new Employee();

        ayush.salary = 6000;
        System.out.println(ayush.getSalary());
        
        ayush.setname("Ayush jha");
        System.out.println(ayush.getname());
    }
}
