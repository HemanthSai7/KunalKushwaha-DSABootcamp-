// class Solution {
//     public int arithmeticTriplets(int[] nums, int diff) {
//         int len=nums.length;
//         int count=0;
//         for (int i=0;i<len;++i){
//             for (int j=i+1;j<len;++j){
//                 for (int k=j+1;k<len;++k){
//                     if ((nums[j]-nums[i]==diff) & (nums[k]-nums[j]==diff))
//                         count+=1;
//                 }
//             }
//         }
//         return count;
//     }
// }

// class Solution{
//     public int arithmeticTriplets(int[] nums, int diff) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int len=nums.length;
//         int count=0;
//         for (int i=0;i<len;++i){
//             map.put(nums[i],i);
//         }
//         for (Integer i:map.keySet()){
//             if (map.containsKey(i+diff) & map.containsKey(i+2*diff)){
//                 count+=1;
//             }
//         }
//         return count;
        
//     }
// }


class Solution{
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for (Integer num:nums){
            if (set.contains(num-diff) && set.contains(num-2*diff)){
                count+=1;
            }
            set.add(num);
        }
        return count;
    }
}
