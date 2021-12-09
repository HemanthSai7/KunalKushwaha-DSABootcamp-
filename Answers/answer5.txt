import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n::");
        int n=in.nextInt();
        System.out.print("Enter r::");
        int r=in.nextInt();
        pnc(n,r);
    }
    static void pnc(int n,int r){
        int i,j,k;
        int factn=1;
        int factr=1;
        int deno=(n-r);
        for (i=1;i<=n;i++){
            factn=factn*i;
        }
        for (j=1;j<=r;j++){
            factr=factr*j;
        }
        for (k=1;k<(n-r);k++){
            deno=deno*k;
        }
        System.out.println("nCr::"+factn/(factr*deno));
        System.out.println("nPr::"+factn/factr);
    }

}
