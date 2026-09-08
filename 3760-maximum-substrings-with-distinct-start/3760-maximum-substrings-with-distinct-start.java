class Solution {
    public int maxDistinct(String s) {
        // HashMap<Character,Integer> map = new HashMap<>();
        // int count = 0;
        // for(int i = 0;i<s.length();i++){
        //     if(!map.containsKey(s.charAt(i))){
        //         count++;
        //     }
        //     map.put(s.charAt(i),1);
        // }
        // return count;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size();
    }
}