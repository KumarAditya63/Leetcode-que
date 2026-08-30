class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newar[] = new int[n+m];
        int z = 0;
        for(int i = 0;i<m;i++){
            newar[z] = nums1[i];
            z++;


        }
        for(int i = 0;i<n;i++){
            newar[z] = nums2[i];
            z++;
        }
        Arrays.sort(newar);
        for(int i = 0;i<m+n;i++){
            nums1[i] = newar[i];
        }
        
    }
}