class Solution {
    public int maxProfit(int[] prices)
    {
        int temp=0,profit=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[i]<prices[j])
                {
                    profit=Math.abs(prices[i]-prices[j]);
                    //System.out.println(temp);
                    //System.out.println(profit);
                    if(temp<profit)
                    {
                        temp=profit;          
                    }                 
                }
            }
        }

    return temp;
    }
}