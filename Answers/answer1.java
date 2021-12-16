import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number::");
        int num=in.nextInt();
        factorial(num);
    }
    static void factorial(int num){
        int fact=1;
        if (num==0 || num==1){
            System.out.println(1);
        }
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factorial is::"+fact);
    }
}
