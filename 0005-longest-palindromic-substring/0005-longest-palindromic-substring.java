class Solution {
    public boolean Palindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int max = 0;
        String result = "";
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                String str = s.substring(i,j);
                if(Palindrome(str)){
                    if(str.length()>max){
                        max = str.length();
                        result = str;
                    }
                }
            }
        }
        return result;
    }
}