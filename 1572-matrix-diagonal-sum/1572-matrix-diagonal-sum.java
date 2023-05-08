class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        for(int i=0; i<n ;i++){
            ans=ans+mat[i][i];
            ans=ans+mat[n-1-i][i];
        }
        if(n%2 !=0){
            ans=ans-mat[n/2][n/2];
        }
        
        return ans;
    }
}