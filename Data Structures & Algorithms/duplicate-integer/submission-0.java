class Solution {
    public boolean hasDuplicate(int[] nums)
    {   boolean ans=false;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            for(int j=i+1;j<=nums.length-1;j++)
            {
                if(temp==nums[j])
                {
                    count++;
                    ans=true;
                    return true;
                }

            }
            
            
        }
        if(count==0)
            {
                ans=false;
                return false;
            }
    return ans;
    }
}