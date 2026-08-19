class Solution {
    public int reverse(int x) {
       
        int num=0,reverse=0,org=0;
        if(x<0)
        {
            org=x;
            x=Math.abs(x);

        }
        while (x>0) 
        {
            num=x%10;
            x=x/10;
            if(reverse>Integer.MAX_VALUE/10 || reverse==Integer.MAX_VALUE/10 && num>7)
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