class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int max = 0;
        int ans = nums[0];

        for(int i =0;i<n;i++){
            int count =1;
            for(int j = i+1;j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > max){
                max = count;
                ans = nums[i];
            }

        }
        return ans;
        
    }
}