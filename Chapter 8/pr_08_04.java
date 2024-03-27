class rectangle{
    int l;
    int b;

    public int area(){
        return l*b;

    }

    public int perimeter(){
        return 2*(l+b);
    }


}


       

public class pr_08_04 {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.l=4;
        rec.b=5;

        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    

    }
}
