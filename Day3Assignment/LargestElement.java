package Day3Assignment;

public class LargestElement {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,5,6,7,8,7,9};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element in the array: " + max);
    }
}
