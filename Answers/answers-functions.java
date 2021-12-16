import java.util.Scanner;

public class Questions{
    public static void main(String[] args){
        max(3);
        min(11,26,3);
        evenodd(9);
        vote(22);
        sumnum(2,3);
        int ans=mul(2,3);
        System.out.println("Multiple::"+ans);
        cirarea(4);
        prime(17);
        factorial(4);
        palindrome(1221);
        int[] arr={3,1,4,6,5};
        triplet(arr,5);
        sumN(6);
    }
    static void max(int numele){
        int max=0;
        Scanner in=new Scanner(System.in);
        int[] arr=new int[numele];
        for (int i=0;i<numele;i++) {
            arr[i] = in.nextInt();
        }
        for (int j=0;j<numele;j++){
            if (max<arr[j]) {
                max=arr[j];
            }
        }
        System.out.println("Max is::"+max);
    }

    static void min(int num1,int num2,int num3){
        int min=num1;
        if (num2<min){
            min=num2;
        }
        if (num3<min){
            min=num3;
        }
        System.out.println("Min is::"+min);
    }
    static void evenodd(int num){
        if (num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    static void vote(int age){
        if (age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
    static void sumnum(int a,int b){
        int sum=a+b;
        System.out.println("Sum::"+sum);
    }
    static int mul(int a,int b){
        int multi=a*b;
        return multi;
    }
    static void cirarea(int radius){
        double cir=2*Math.PI*radius;
        double area=2*Math.pow(Math.PI,2);
        System.out.println("Circumference::"+cir);
        System.out.println("Area::"+area);
    }
    static void prime(int num){
        int flag=0;
        for (int i=1;i<=num;i++){
            if (num%i==0) {
                flag+=1;
            }
        }
        if (flag==2){
            System.out.println("IS PRIME");
        }else {
            System.out.println("IS NOT PRIME");
        }
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
    static void palindrome(int num){
        int numcopy=num;
        int pal=0;
        while (numcopy>0) {
            int rem=numcopy%10;
            pal=pal*10+rem;
            numcopy=numcopy/10;
        }
        if (pal==num){
            System.out.println("IS PALINDROME");
        }else{
            System.out.println("IS NOT PALINDROME");
        }
    }

    //naive approach still..will update it soon//
    static void triplet(int[] arr,int n){
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    int x=arr[i]*arr[i],y=arr[j]*arr[j],z=arr[k]*arr[k];
                    if (x==y+z|| y==x+z || z==x+y){
                        System.out.println("TRIPLET");
                    }
                }
            }
        }
    }
    static void sumN(int n){
        int sum=0;
        for (int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
