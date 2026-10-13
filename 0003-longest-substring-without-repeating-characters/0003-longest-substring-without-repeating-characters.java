class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int max = 1;
        for(int i = 0;i<s.length();i++){
            int count = 0;
            boolean[] b = new boolean[256];
            for(int j = i;j<s.length();j++){
                char ch = s.charAt(j);
                if(b[ch]) break;
                b[ch] = true;
                count++; 
            }
            if(count>max) max = count;
        }
        return max;
    }
}