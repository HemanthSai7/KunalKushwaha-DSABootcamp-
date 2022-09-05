class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder result=new StringBuilder();
        String[] words=s.split(" ");
        for (int i=0;i<k;++i){
            result.append(words[i]);
            if (i<k-1)
                result.append(" ");
        }
        return result.toString();
    }
}
