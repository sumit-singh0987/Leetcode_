class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!map.isEmpty()){
            char ch = ' ';
            int max = 0;
            for (char c : map.keySet()) {

                if (map.get(c) > max) {
                    max = map.get(c);
                    ch = c;
                }
            }
            while(max>0){
                sb.append(String.valueOf(ch));
                max--;
            }
            map.remove(ch);
        }
        return sb.toString();
    }
}