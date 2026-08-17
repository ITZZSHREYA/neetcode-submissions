class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        //using exor optimised
        int index=0;
        for(int i=0;i<n;i++)
        {
            index^=nums[i];
        }
        return index;
}
}