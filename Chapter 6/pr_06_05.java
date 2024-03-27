public class pr_06_05 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(arr.length, 2);
        for (int i = 0; i < n; i++) {
            // swap a[i] and a[l-i-1]
                //  a   b
            //  |3| |4| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for (int element:  arr) {
            System.out.println(element + " ");
            
        }
    }
    
}
