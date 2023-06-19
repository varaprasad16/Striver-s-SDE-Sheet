// Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
class Solution {
    public int majorityElement(int[] nums) {
        //Better Solution
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //     if(map.get(nums[i])>nums.length/2)
        //     return nums[i];
        // }
        // return -1;
        
        //Optimal Solution
        int el=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++)
        {
            if(cnt==0)
            {
                cnt=1;
                el=nums[i];
            }
            else if(nums[i]==el)
            cnt++;
            else
            cnt--;
        }
        int cnt1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==el)
            cnt1++;
        }
        if(cnt1>nums.length/2)
        return el;
         else
         return -1;
    }
}
