package Array_Recursion;

public class FindHighestElement {
    static int highestelement(int[] arr, int index, int ele){
        if(index == arr.length){
            return ele;
        }
        if(arr[index] > ele){
            ele = arr[index];
        }
        return highestelement(arr, index+1, ele);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,43,65,9,30};
        System.out.println(highestelement(arr, 0, arr[0]));
    }
}
