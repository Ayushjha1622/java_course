import java.util.Scanner;

class Student {
    int id;
    String name;

    void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Marks extends Student {
    float javaMarks, cMarks, cppMarks;

    public void setMarks(float javaMarks, float cMarks, float cppMarks) {
        // super.setData(id, name);
        this.javaMarks = javaMarks;
        this.cMarks = cMarks;
        this.cppMarks = cppMarks;
    }

    public void displayMarks() {
        System.out.println("Java Marks : ");
        System.out.println("cMarks : ");
        System.out.println("cppMarks : ");
    }

}

class Result extends Marks {

    float total, Avg;

    void compute() {
        // super.setMarks(javaMarks, cMarks, cppMarks);
        total = javaMarks + cMarks + cppMarks;
        Avg = total / 3;

    }

    void showResult() {
        System.out.println("Total marks : " + total);
        System.out.println("Average marks : " + Avg);

    }

}

public class practice_inheritance {
    public static void main(String[] args) {
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        float javaMarks = Float.parseFloat(args[2]);
        float cMarks = Float.parseFloat(args[3]);
        float cppMarks = Float.parseFloat(args[4]);

        Result obj = new Result();
        obj.setData(id, name);
        obj.displayData();
        obj.setMarks(javaMarks, cMarks, cppMarks);
        obj.compute();
        obj.showResult();
    }
}