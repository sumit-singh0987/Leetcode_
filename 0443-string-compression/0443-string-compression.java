class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        int freq = 0;
        StringBuilder sb = new StringBuilder();
        while(j<chars.length){
            if(chars[i]==chars[j]){
                j++;
            }else{
                freq = j-i;
                sb.append(chars[i]);
                if(freq>1){
                    sb.append(String.valueOf(freq));
                }
                i = j;
            }
        }
        freq = j - i;
        sb.append(chars[i]);
        if (freq > 1) {
           sb.append(String.valueOf(freq));
        }
        for(int k = 0;k<sb.length();k++){
            chars[k] = sb.charAt(k);
        }
        return sb.length();
    }
}