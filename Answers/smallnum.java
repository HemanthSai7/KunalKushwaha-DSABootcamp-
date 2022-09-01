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

//approach 2 hashmap
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len=nums.length;
        int[] arr=Arrays.copyOf(nums,len);
        Arrays.sort(nums);
        HashMap<Integer,Integer> res= new HashMap<>();
        for (int i=len-1;i>=0;i--){
            res.put(nums[i],i);
        }
        for (int i=0;i<len;++i){
            arr[i]=res.get(arr[i]);
        }
        return arr;
        }
    }
