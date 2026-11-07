class Solution {

    public double findMaxAverage(int[] nums, int k) {
        
        double windowSum = 0;
        for(int i = 0; i<k; i++){
            windowSum += nums[i];
        }
        double best = windowSum;

        for(int i = k; i<nums.length; i++){
            windowSum = windowSum + nums[i]-nums[i-k];
            best = Math.max(windowSum,best);

        }
        return best/k;
        
    }
}
