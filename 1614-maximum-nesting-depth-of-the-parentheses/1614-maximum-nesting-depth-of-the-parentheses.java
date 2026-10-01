class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int overall_max = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                max++;
                overall_max = Math.max(overall_max,max);
            }else if(s.charAt(i)==')'){
                max--;
            }
        }
        return overall_max;
    }
}