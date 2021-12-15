import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        hcf(36,69);
        lcm(36,69);
        vnc('A');
        perfectno(15);
        sumofdigit(12345);
        evensum(31);
        sumarray(5);
    }
    static void hcf(int a,int b){
        int HCF = 1;
        for (int i=1;i<=a || i<=b;i++) {
            if (a % i == 0 && b % i == 0) {
                HCF = i;
            }
        }
        System.out.println("HCF of two numbers:"+HCF);
    }
    static void lcm(int c,int d){
        int LCM=c;
        for (int i=c;i<=c*d;i++){
            if (i%c==0 && i%d==0){
                System.out.println("LCM is::"+i);
                break;
            }
        }
    }
    static void vnc(char ch){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("vowel");
        }else if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
    static void perfectno(int num){
        int sum=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if (sum==num){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
    static void leap(int year){
        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("leap year");
        }else {
            System.out.println("not a leap year");
        }
    }
    static void sumofdigit(int num1){
        int sum=0;
        while (num1>0){
            int rem=num1%10;
            sum+=rem;
            num1=num1/10;
        }
        System.out.println(sum);
    }
    static void evensum(int days){
        int count=0;
        for (int i=1;i<days;i++){
            if (i%2==0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
        static void sumarray(int N){
        Scanner in=new Scanner(System.in);
        int[] arr=new int[N];
        int sum=0;
        for (int i=0;i<N;i++){
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
