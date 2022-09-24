package Day3Assignment;

public class SmallestElement {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,5,6,7,8,7,9};
        int min =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element in the array is : " + min);
    }
}