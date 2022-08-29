class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> output = new ArrayList<>();
        int len=nums.length;
        int[] result=new int[len];
        for (int i=0;i<len;++i){
            output.add(index[i],nums[i]);
        }
        
        for (int i=0;i<len;++i){
            result[i]=output.get(i);
        }
        return result;
    }
}
