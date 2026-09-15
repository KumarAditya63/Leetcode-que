class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] max = new int[n + 1 ];
        int maxsum = 0;

        max[0] = 0;
        for(int i = 1;i<=n;i++){
            max[i] = max[i-1] +gain[i - 1 ];
            if(max[i] > maxsum){
                maxsum = max[i];
            }

        }
        return maxsum;
        
    }
}