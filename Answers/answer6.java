public class Main {
    public static void main(String[] args) {
        reverse("hemanth");
    }
    static void reverse(String s){
        String rev="";
        int len=s.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
