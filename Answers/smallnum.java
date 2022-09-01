// approach 1 brute force
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        for (int i=0;i<len;++i){
            int count=0;
            for (int j=0;j<len;++j){
                if (nums[i]>nums[j])
                    count++;
            }
            arr[i]=count;
        }
            
        return arr;
        }
    }
