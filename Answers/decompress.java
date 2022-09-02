//aproach 1 brute force
class Solution {
    public int[] decompressRLElist(int[] nums) {
        // List<Integer> output=new ArrayList<>();
        int len=0,index=0;
        for (int i=0;i<nums.length;i+=2){
            len+=nums[i];
        }
        int[] output=new int[len];
        for (int i=0;i<nums.length;i+=2){
            for (int j=0;j<nums[i];++j){
                output[index]=nums[i+1];
                index+=1;
            }
        }
        return output;
        
    }
}
