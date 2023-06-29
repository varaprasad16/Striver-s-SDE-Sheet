//  Remove Duplicates from Sorted Array
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the unique elements in the order they 
// were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        //Optimal
            // int i=0;
            // int n=nums.length;
            // for(int j=1;j<n;j++)
            // {
            //     if(nums[j]!=nums[i])
            //     {
            //         nums[i+1]=nums[j];
            //         i++;
            //     }
            // }
            // return i+1;
        //Better
        Set<Integer> set=new TreeSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int index=0;
        for(Integer num:set)
        {
            nums[index]=num;
            index++;
        }
        return index;
    }
}
