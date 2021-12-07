public class palindrome {
    public static void main(String[] args) {
        Palindrome("malayalam");
    }
    static void Palindrome(String name){
        int len=name.length();
        String reverse="";
        for (int i=len-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        if (name.equals(reverse)){
            System.out.println("is Palindrome");
        }else{
            System.out.println("is not Palindrome");
        }
    }
}
