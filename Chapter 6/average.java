public class average {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum=0;
        for(int element: arr){
            sum=sum+element;

        }
        int average = sum/arr.length;
        System.out.println(average);
    }
}
