public class sum_arrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum=0;
        for(int element: arr){
            sum=sum+element;
            System.out.println(sum);
        }
    }
}
