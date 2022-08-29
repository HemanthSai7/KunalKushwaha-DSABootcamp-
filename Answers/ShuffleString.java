class Solution {
    public String restoreString(String s, int[] indices) {
        int len=s.length();
        char[] result=new char[len];
        for (int i=0;i<len;++i){
            result[indices[i]]=s.charAt(i);
        }
        return String.valueOf(result);
    }
}
