class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while (n>0){
            int remainder=n%10;
            sum=sum+remainder;
            product=product*remainder;
            n=n/10;
        }
        return product-sum;
    }
}
