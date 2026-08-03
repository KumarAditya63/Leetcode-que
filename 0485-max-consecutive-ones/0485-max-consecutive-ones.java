class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(nums[i] == 1){
                count++;
            }
            if(max < count){
                max = count;
            }
            else if(nums[i] == 0){
                count = 0;
            }
            

        }

        return max;
        
    }
}