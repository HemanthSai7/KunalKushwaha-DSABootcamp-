import java.util.Arrays;
public class arrayCon_leetcode {
    public static void main(String[] args) {
        int[] answer=arrayConcatenation(new int[]{1,2,1});
        System.out.println(Arrays.toString(answer));
    }
    public static int[] arrayConcatenation(int[] nums){
        int length=nums.length;
        int[] ans=new int[2*length];
        for (int i=0;i<length;i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
    }
}
