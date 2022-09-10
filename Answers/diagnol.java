class Solution {
    public int diagonalSum(int[][] mat) {
        int len=mat.length;
        int sum=0;
        for (int i=0;i<len;++i){
            sum+=mat[i][i];
            sum+=mat[i][len-i-1];
        }
        if (len%2==1)
            sum=sum-mat[len/2][len/2];
        return sum;
    }
}
