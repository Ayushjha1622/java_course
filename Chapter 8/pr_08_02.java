class cellphone{
    public void ring(){
        System.out.println("ringing....");

    }

    public void vibrate(){
        System.out.println("vibrating....");
    }

    public void callFriend(){
        System.out.println("ayush");
    }
}
public class pr_08_02 {
    public static void main(String[] args) {
        cellphone asus = new cellphone();

        asus.callFriend();
        asus.vibrate();
        asus.ring();
    }
}
