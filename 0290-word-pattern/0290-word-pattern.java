class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> reverse = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i = 0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arr[i])){
                    return false;
                }
            }else{
                if(reverse.containsKey(arr[i])){
                    return false;
                }
                map.put(pattern.charAt(i),arr[i]);
                reverse.put(arr[i],pattern.charAt(i));
            }
        }
        return true;
    }
}