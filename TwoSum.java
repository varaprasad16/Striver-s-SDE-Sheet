// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int a[]=new int[2];
     for(int i=0;i<nums.length;i++)
     {
         int rem=target-nums[i];
         if(map.containsValue(rem))
         {
             for (Map.Entry<Integer,Integer> entry: map.entrySet())
             {
              if (rem==entry.getValue()) {
               a[0]=entry.getKey();
               break;
             }
        }
             a[1]=i;
         }
         else
         map.put(i,nums[i]);
     }   
     return a;
    }
}
