class Solution {
    public String largestOddNumber(String s) {
        String s1 = "";
        for(int i = s.length()-1 ; i >= 0 ; i--)
        {
            char dig = s.charAt(i);
            int d = dig - '0';
            if(d % 2 != 0)
            {
                 s1 = s.substring(0, i+1); break;
            }
        }
        return s1;
    }
}