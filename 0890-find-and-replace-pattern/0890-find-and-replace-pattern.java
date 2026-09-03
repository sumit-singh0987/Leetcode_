class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<>();
        int[] mapt = new int[256];
        for(int i = 0;i<words.length;i++){
            Arrays.fill(mapt,0);
            int count = 0;
            if(pattern.length()!=words[i].length()) continue;
            int[] maps = new int[256];
            for(int j = 0;j<pattern.length();j++){
                if(mapt[pattern.charAt(j)]!= words[i].charAt(j) && mapt[pattern.charAt(j)]!=0){
                    break;
                }
                if(mapt[pattern.charAt(j)]!= words[i].charAt(j) && maps[words[i].charAt(j)]!=0){
                    break;
                }
                mapt[pattern.charAt(j)] = words[i].charAt(j);
                maps[words[i].charAt(j)] = pattern.charAt(j);
                count++;
            }
            if(count==pattern.length()){
                l.add(words[i]);
            }
        }
        return l;
    }
}