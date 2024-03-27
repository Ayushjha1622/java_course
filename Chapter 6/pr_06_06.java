public class pr_06_06 {
    public static void main(String[] args) {
        int arr[] = {1,21,55,89};
        int max=Integer.MIN_VALUE;
        // int max=Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("Max element is "+max);
    }
}
