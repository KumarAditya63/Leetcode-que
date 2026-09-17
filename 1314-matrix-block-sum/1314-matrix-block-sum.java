class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] answer = new int[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                int sum = 0;
                for(int r = Math.max(0,i-k);r<=Math.min(mat.length-1,i+k);r++){

                    for(int c = Math.max(0,j-k);c<=Math.min(mat[0].length-1,j+k);c++){

                        sum += mat[r][c];
                    }
                }
                answer[i][j] = sum ;
            }
        }
        return answer;
        
    }
}