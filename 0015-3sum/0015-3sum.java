import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

        
        int j = i+1;
        int z = nums.length-1;
        while(j<z){

    
        int sum = nums[i] + nums[j] + nums[z];
        if(sum < 0){
            j++;
        }
        else if(sum > 0){
            z--;
        }

        else{
            ans.add(Arrays.asList(nums[i], nums[j], nums[z]));
            j++;
            z--;

            while (j < z && nums[j] == nums[j - 1]) j++;
            while (j < z && nums[z] == nums[z + 1]) z--;

        }
        }

        }
        return ans;

    }
}