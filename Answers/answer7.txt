public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Principal Amount::");float P=in.nextFloat();
        System.out.println("Interest Rate::");float r=in.nextFloat();
        System.out.println("Compounding Period::");float n=in.nextFloat();
        System.out.println("Time::");float t=in.nextFloat();
        float bracket = (1+r/n);
        double FV= P*Math.pow(bracket,n*t);
        System.out.println("Future Value::"+FV);
    }
}
