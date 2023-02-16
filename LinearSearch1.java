package Sparsh1;

public class LinearSearch1 {
    public static void main(String[] args) {
        int nums[] = {23,45,675,433,64,5756};
        int target = 64;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // here we are going to search in the array and return the values (index we will search og the element)
    // else -1 should be printed

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for every element is it + target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
