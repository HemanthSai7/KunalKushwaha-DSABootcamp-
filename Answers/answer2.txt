public class fibo {
    public static void main(String[] args) {
        fibonacci(5,0,1);
    }
    static void fibonacci(int n,int num1,int num2){
        int sum = 0;
        for (int i=0;i<n;i++){
            num1=num2;
            num2=sum;
            sum=num1+num2;
            System.out.println(sum);
        }
    }
}
