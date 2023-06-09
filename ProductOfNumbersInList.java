package Array_Recursion;

public class ProductOfNumbersInList {
    static int product(int[] arr, int index){
        if(index < 0 || index >= arr.length){
            return 1;
        }else{
            return arr[index]*product(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(product(arr, 0));
    }
}
