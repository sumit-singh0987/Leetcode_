class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        for(int i = arr.length-1;i>0;i--){
            if(arr[i]!=" "){
                str.append(arr[i]);
                str.append(" ");
            }
        }
        if(arr[0]!=" "){
            str.append(arr[0]);
        }
        String result = str.toString();
        return result;
    }
}