// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.
class Solution {
    public int longestConsecutive(int[] nums) {
        //BRUTE FORCE
        // int longest=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int cur=nums[i];
        //     int cnt=1;
        //     while(linearSearch(cur+1,nums))
        //     {
        //         cnt+=1;
        //         cur+=1;
        //     }
        //     longest=Math.max(longest,cnt);
        // }
        // return longest;
        
        //BETTER ONE
        // Arrays.sort(nums);
        // int last=Integer.MIN_VALUE;
        // int longest=0;
        // int cnt=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]-1==last)
        //     {
        //         cnt+=1;
        //         last=nums[i];
        //     }
        //     else if(nums[i]!=last)
        //     {
        //         cnt=1;
        //         last=nums[i];
        //     }
        //     longest=Math.max(longest,cnt);
        // }
        // return longest;

        //OPTIMAL CODE
        Set<Integer> set=new HashSet<>();
        int longest=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]-1))
            {
                int cur=nums[i];
                int cnt=1;
                while(set.contains(cur+1))
                {
                    cur=cur+1;
                    cnt=cnt+1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
    static boolean linearSearch(int x,int[] arr)
    {
        for(int num:arr)
        {
            if(x==num)
            return true;
        }
        return false;
    }
}
