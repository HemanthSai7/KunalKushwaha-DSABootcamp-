class Solution {
    public int mostWordsFound(String[] sentences) {
       int count=0;
        for (String sentence:sentences){
            String[] words=sentence.split(" ");
            if (words.length>count){
                count=words.length;
            }
        }
        return count;
    }
}
