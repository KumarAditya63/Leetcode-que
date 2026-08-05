class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[Math.min(n,m)];
        int k = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(nums1[i] == nums2[j]){
                    arr[k] =  nums1[i];
                    k++;
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }

            }
        }
        return Arrays.copyOf(arr,k);
        
    }
}