
package BinarySearchInterview;
import java.util.*;
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,3,3,3,4,4,5};
        System.out.println(Arrays.toString(searchRangelinear(nums, 2)));
    }


    static int[] searchRangelinear(int[] nums , int target){
        int[] range = new int[nums.length];
        int occurence = 0;
        int index = 0;
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]){
                size++;
            }
            if(target == nums[i] && occurence <1){ //when the target first occurs then the if condition runs
                range[i] = i; //the target is found at index i , hence we store the index of the target in the range array
                index = i;
                occurence++; //the target has been found once (first occurence) 
            }
        }
        for (int i = index; i < nums.length; i++) {
            if(target != nums[i] && target == nums[i-1]){ //1,2,3,3,4
                range[i-1] = i-1; 
            }
        }
        if(size > 1){
            size = 2;
        }else{
            size = 1;
        }
        int[] ans = new int[size];
        int k = 0;
        for (int i = 0; i < range.length; i++) {
            if(range[i] != 0){
                ans[k] = range[i];
                k++;
            }
        }
        return ans;
    } 
    
}
