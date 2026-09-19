class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = 0;
        int a=0;
        int b=n-1;
        while(a<b){
            int max = 0;
            if(height[a]<height[b]){
                max=height[a]*(b-a);
                area = Math.max(area,max);
                a++;
            }else{
                max=height[b]*(b-a);
                area = Math.max(area,max);
                b--;
            }
        }
        return area;
    }
}