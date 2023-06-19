// Majority Element II
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        // HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //   map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //   if(map.get(nums[i])>nums.length/3)
        //   {
        //       if(!list.contains(nums[i]))
        //       list.add(nums[i]);
        //   }
        // } 
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(cnt1==0 && el2!=nums[i])
            {
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && el1!=nums[i])
            {
                cnt2=1;
                el2=nums[i];
            }
            else if(el1==nums[i])
            cnt1++;
            else if(el2==nums[i])
            cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }

        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==el1)
            {
                cnt1++;
            }
            if(nums[i]==el2)
            {
                cnt2++;
            }
        }
        if(cnt1>n/3)
        list.add(el1);
        if(cnt2>n/3)
        list.add(el2);
        return list;
    }
}
