class Solution {
    public int totalNumbers(int[] digits) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    String s = "";
                    s = Integer.toString(digits[i]) + Integer.toString(digits[j]) + Integer.toString(digits[k]);
                    int num = Integer.parseInt(s);
                    if(i==j || j==k || k==i){
                        continue;
                    }
                    if(digits[i]==0) continue;
                    if(!l.contains(num) && num%2==0){
                        l.add(num);
                    }
                }
            }
        }
        return l.size(); 
    }
}