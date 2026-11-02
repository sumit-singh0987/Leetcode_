class Solution {
    public String getHint(String secret, String guess) {
        int right_pos = 0;
        for(int i = 0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                right_pos++;
            }
        }
        int same_dig = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<secret.length();i++){
            char ch = secret.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < guess.length(); i++) {
            char ch = guess.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                continue;
            }
            same_dig++;
            map.put(ch, map.get(ch) - 1);
        }
        int third = Math.abs(same_dig - right_pos);
        String str = "";
        str += Integer.toString(right_pos) + "A" + Integer.toString(third) + "B";
        return str;
    }
}