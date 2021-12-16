import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter power::");
	    int n=in.nextInt();
	    System.out.print("Enter number::");
	    int m=in.nextInt();
	    pow(m,n);
	}
	static void pow(int m,int n){
	    int val=1;
	    for (int i=0;i<n;i++){
	        val=val*m;
	    }
	    System.out.print("Answer::"+val);
	}
}
