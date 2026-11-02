
class Max_subarray{
    public static int max_subarray(int[]nums){
        int curr_sum = nums[0];
        int best_sum = nums[0];
        for(int i = 1; i<nums.length; i++){
            curr_sum = Math.max(nums[i], nums[i]+curr_sum);
            best_sum = Math.max(curr_sum, best_sum);
        }
        return best_sum;
    }


    public static void main(String[] args) {

        int[]nums={1,2,-3,4};
        max_subarray(nums);
    }
}