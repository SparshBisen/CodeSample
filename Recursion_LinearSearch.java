package Sparsh1;

public class Recursion_LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,34,5};
        System.out.println(find(arr,89,0));

    }

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
}
