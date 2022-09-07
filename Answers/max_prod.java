class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int prod=(nums[len-1]-1)*(nums[len-2]-1);
        return prod;
    }
}
