class Mythread1 extends thread{
    @override
    public void run(){
        while(true){
        System.out.println("Thread is running");
        System.out.println("I am happy");
    }
}
}


class Mythread2 extends thread{
    @override
    public void run(){
        while(true){
        System.out.println("Thread 2 is running");
        System.out.println("I am sad");
    }
}
}


public class threads{
    
public static void main(String[] args) {
    Mythread1 t1 = new Mythread1();
    Mythread2 t2 = new Mythread2();
    t1.start();
    t2.start();

}   
}