// 3Sum
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.
  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> val=new ArrayList<List<Integer>>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            int t=-a;
            int s=i+1;
            int e=n-1;
            while(s<e)
            {
                if(nums[s]+nums[e]==t)
                {
                    List<Integer> inner=new ArrayList<Integer>();
                    inner.add(nums[i]);
                    inner.add(nums[s]);
                    inner.add(nums[e]);
                    val.add(inner);
                    while(s<e && nums[s]==nums[s+1]) s++;
                    while(s<e && nums[e]==nums[e-1]) e--;
                    s++;
                    e--;
                }
                else if(nums[s]+nums[e]>t)
                {
                    e--;
                }
                else
                {
                    s++;
                }
            }
             while(i+1<n && nums[i]==nums[i+1]) i++;
        }
        return val;
    }
}
