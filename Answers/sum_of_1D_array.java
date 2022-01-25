import java.util.Arrays;
public class sum_of_1D_array {
    public static void main(String[] args) {
        int[] answer=runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(answer));
    }
    public static int[] runningSum(int[] nums) {
        int length=nums.length;
        int[] ans=new int[length];
        int sum=0;
        for (int i=0;i<length;i++){
            sum=sum+nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
