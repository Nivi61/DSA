//taeget = nums[i]+nums[j]
// Using Two pointer approch
class Two_pointer{
	public int[] two_sum(int[]nums,int target){
		
		for(int i =0; i<nums.length; i++){
			for(int j = i+1; j<nums.length; j++){
				int sum = nums[i]+nums[j];
				if(sum==target){
                   return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
}

// Using HashMap 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> seen = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            int num = target-nums[i];
            if(seen.containsKey(num)){
                return new int[]{seen.get(num), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};

        }
        

        
    }
