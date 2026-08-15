class Solution {
    public int[] replaceElements(int[] arr) 
    {
        int n=arr.length;
        int last=n-1;
        int last2=n-2;
        //int temp=0;
        if(n==1)
        {
            return new int[]{-1};
        }
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            int temp=0;
            while(j<n)
            {
                if(temp<arr[j])
                {
                    temp=arr[j];
                }
                j++;
                
            }
            arr[i]=temp;
        }
    //arr[last2]=arr[last];
    arr[last]=-1;
    
    return arr;
    
        
    }
}