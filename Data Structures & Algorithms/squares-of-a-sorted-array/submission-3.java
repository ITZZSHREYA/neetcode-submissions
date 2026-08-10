class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();

        for(int num:nums)
        {
            if(num<0)
            {
                neg.add(num);
            }
            else
            {
                pos.add(num);
            }
        }

        if(pos.size()==0)

        {
            for(int i=0;i<neg.size();i++)
            {
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }
        if(neg.size()==0)
        {
            for(int i=0;i<pos.size();i++)
            {
                pos.set(i,pos.get(i)*pos.get(i));

            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        for(int i=0;i<pos.size();i++)
        {
            pos.set(i,pos.get(i)*pos.get(i));
        }
        for(int i=0;i<neg.size();i++)
        {
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        int i=0,j=0,id=0;
        int m=pos.size();
        int n=neg.size();
        int[] res=new int[m+n];

        while(i<m && j<n)
        {
            if(pos.get(i)<=neg.get(j))
            {
                res[id++]=pos.get(i++);
            }
            else
            {
                res[id++]=neg.get(j++);
            }
        }
        while(i<m)
        {
            res[id++]=pos.get(i++);

        }
        while(j<n)
        {
            res[id++]=neg.get(j++);

        }
    return res;
        
    }
}