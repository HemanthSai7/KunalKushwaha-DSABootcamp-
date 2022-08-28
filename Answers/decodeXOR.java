class Solution {
    public int[] decode(int[] encoded, int first) {
        int len=encoded.length;
        int[] output=new int[len+1];
        output[0]=first;
        for (int i=0;i<len;++i){
            output[i+1]=encoded[i]^output[i];
        }
        return output;
    }
}
