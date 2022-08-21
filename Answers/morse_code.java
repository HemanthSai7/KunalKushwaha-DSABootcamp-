import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class uniqueMorseRepresentations {
    public static void main(String[] args) {
        int res=MorseCode(new String[]{"gin","zen","gig","msg"});
        System.out.println(res);
    }
    public static int MorseCode(String[] words) {
        int count=0;
        HashMap<Character,String> map=new HashMap<>(26);
        Set<String> set=new HashSet<>(26);
        String[] Morse = new String[]{".-","-...","-.-.","-..",".",
                                    "..-.","--.","....","..",".---",
                                     "-.-",".-..","--","-.","---",".--.",
                                      "--.-",".-.","...","-","..-","...-",
                                       ".--","-..-","-.--","--.."};
        int len=Morse.length;
        for (int i=0;i<len;i++) {
            map.put((char) (i + 97), Morse[i]);
        }

        for (String word:words){
            StringBuilder str= new StringBuilder();
            for (char alphabet:word.toCharArray()){
                str.append(map.get(alphabet));
            }
            if (!set.contains(str.toString())){
                set.add(str.toString());
                count++;
            }
        }
        return count;
    }
}
