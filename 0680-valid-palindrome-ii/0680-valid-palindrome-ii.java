class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return fun(s,i+1,j) || fun(s,i,j-1);

            }
            i++;
            j--;
        }
        return true;
    }

        private boolean fun(String s, int i, int j){
            while(i<j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;

        }
        
        
    
}