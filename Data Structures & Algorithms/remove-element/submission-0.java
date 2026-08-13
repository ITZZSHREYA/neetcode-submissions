class Solution {
    public int removeElement(int[] nums, int val)
    {
        int n=nums.length;
        //int j=0;
        int index=0,ans=0;
        //int[] res=new int[n];
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
                nums[index]=nums[i];
                index++; 

            }
             
        }
    return index;
    }
}