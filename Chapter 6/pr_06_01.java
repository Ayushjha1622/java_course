public class pr_06_01 {
    public static void main(String[] args) {
        float [] marks = {45.5f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;

        for(float element:marks){
            sum+=element;
        }
        System.out.println("the value of sum is " + sum);
    }
}
