class tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }

    public void run(){
        System.out.println("running");
    } 

    public void fire(){
        System.out.println("firing");
    }
}
public class pr_08_05 {
    public static void main(String[] args) {
        tommy player1 = new tommy();

        player1.fire();
        player1.run();
        player1.hit();
    }
    
}
