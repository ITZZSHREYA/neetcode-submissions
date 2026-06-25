class Solution {
    public boolean isAnagram(String s, String t) {
        int count=0;
        char[] chars=s.toCharArray();
        Arrays.sort(chars);

        char[] chart=t.toCharArray();
        Arrays.sort(chart);
        if(chars.length!=chart.length)
        {
            return false;
        }

        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]==chart[i])
            {
                count++;
            }
        }
       
        if(count==chars.length)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
}