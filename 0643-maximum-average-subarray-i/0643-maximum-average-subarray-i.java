class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = 0;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for(int i = 0;i<k;i++){
            sum = sum + nums[i];
        }
        int j = 0;
        int right = k;
        while(right<nums.length){
            average = sum/k;
            max = Math.max(average,max);
            sum = sum - nums[j] + nums[right];
            j++;
            right++;
        }
        average = sum/k;
        max = Math.max(average,max);
        return max;
    }
}