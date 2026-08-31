class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] lm = new int[n];
        int [] rm = new int[n];
        int m = 0;
        for(int i = 0;i<n;i++){
            m = Math.max(m,height[i]);
            lm[i] = m;
        }
        m = 0;
        for(int i = n-1;i>=0;i--){
            m = Math.max(m,height[i]);
            rm[i] = m;
        }

        int ans = 0;
        for(int i = 0;i<n;i++){
            ans = ans + (Math.min(lm[i],rm[i]) - height[i]);
        }
        return ans;
    }
}


//