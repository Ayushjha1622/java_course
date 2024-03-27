// import java.util.*;
// class Rectangle{
//     private int l;
//     private int b;

//     public Rectangle(){
//         this.l=4;
//         this.b=5;
//     }

//     public Rectangle(int l,int b){
//         this.l=l;
//         this.b=b;
//     }

    

//     public int getl(){
//         return l;
//     }

//     public void setl(int l){
//         this.l=l;
//     }

//     public int getb(){
//         return b;

//     }

//     public void setb(int b){
//         this.b = b;
//     }  

//     public double Area(){
//             return 2*(l+b);
//     }
// //     public double Volume(){
// //             return Math.PI*radius*radius*height;
// //     }
// }
// public class pr_09_04{
//     public static void main(String[] args) {
//         Rectangle myrRectangle = new Rectangle(12,9);

//         // myCylinder.setHeight(12);
//         System.out.println(myrRectangle.getl());

//         // myCylinder.setRadius(15);
//         System.out.println(myrRectangle.getb());    

//         System.out.println(myrRectangle.Area());
//         // System.out.println(myCylinder.Volume());
//     }
// }

/**
 * pr_09_04
 */

class Rectangle{
    int l,b;

    Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }

    public int Perimeter(){
        return 2*(l+b);
    }

    public int Area(){
        return l*b;
    }

    public void setL(int l){
        this.l=l;
    }
    public int getL(){
        return l;
    }
    public void setB(int b){
        this.b=b;
    }
    public int getB(){
        return b;
    }

 }
public class pr_09_04 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 6);
        System.out.println(rec.Perimeter());  
        System.out.println(rec.Area());
    }

}


