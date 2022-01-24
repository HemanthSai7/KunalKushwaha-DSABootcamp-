mport java.util.Arrays;
public class buildArray_leetcode {
    public static void main(String[] args) {
        int[] ans=buildArray(new int[]{0,2,1,5,3,4});
        System.out.println(Arrays.toString(ans));
    }

    public static int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
