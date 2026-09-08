class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        if(part.length()>str.length()) return s;
        while(str.indexOf(part)!=-1){
            int i = str.indexOf(part);
            str = str.delete(i,i+part.length());
        }
        return str.toString();
    }
}