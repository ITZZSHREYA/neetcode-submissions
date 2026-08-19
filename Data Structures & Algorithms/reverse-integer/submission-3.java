class Solution {
    public int reverse(int x) {
       
        int num=0,reverse=0,org=0;
        
        while (x!=0) 
        {
            num=x%10;
            x=x/10;
            if(reverse>Integer.MAX_VALUE/10 || reverse==Integer.MAX_VALUE/10 && num>7)
            {
                return 0;
            }
            if(reverse<Integer.MIN_VALUE/10 || reverse==Integer.MIN_VALUE/10 )
            {
                return 0;
            }
            reverse = reverse * 10 + num;
                  
        }
        if(org<0)
        {
            return -reverse;
        }

    return reverse;
    }
}