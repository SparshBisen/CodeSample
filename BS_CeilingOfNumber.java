/* the condition of a ceiling of a numbers is to find the smallest number which is greater or equal to the target.
now if a found the number which is greater than the ceiling number than I should find the previous number to find the
most potential answer. there might be condition where the middle element is not the smallest number which is greater
than or equal to the target*/

/* Here keep one thing in mind that the whole code is same as of binary search the only thing which is changing that the
return value of the CeilingOfNumber should be start.*/
package Sparsh1;
public class BS_CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,23,45,656,764};
        int target = 4;
        int ans = CeilingOfNUmber(arr, target);
        System.out.println(ans);
    }
        static int CeilingOfNUmber(int[] arr, int target){
            int start = 0;
            int end = arr.length - 1;
            while(start<=end){
    //            int mid = (start + end)/2;    // might be possible exceeds the range of java (for large numbers)
                int mid = start + (end - start)/2; // keep the formula should be correct.
                if(target<arr[mid]) {
                    end = mid - 1;
                }
               else if(target >arr[mid]){
                    start = mid + 1;
                }
               else {
                    return mid;
                }
            }
                return start;
        }
}