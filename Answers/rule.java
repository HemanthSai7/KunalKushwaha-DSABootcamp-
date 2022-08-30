class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String,Integer> hash=new HashMap<>();
        hash.put("type",0);
        hash.put("color",1);
        hash.put("name",2);
        int result=0;
        int index=hash.get(ruleKey);
        for (List<String> list:items){
            if (list.get(index).equals(ruleValue))
                result++;
        }
        
        return result;
    }
}
