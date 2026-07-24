class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        String s=countAndSay(n-1)+"j";
        String ans="";
        int i = 0;
        for (int j = 1; j < s.length(); j++) {
            if (s.charAt(i) != s.charAt(j)) {
                ans += (j - i);
                ans += s.charAt(i);
                i = j;
            }
        }
        // ans += (s.length() - i);
        // ans += s.charAt(i);
        return ans;
    } 
}