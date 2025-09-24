import java.util.Scanner;

public class factorial_recursion {
    public static void printfac(int n,int p){
        if(n==1){
            p=p*n;
        System.out.println(p);
        return;
        }
        p=p*n;
        printfac(n-1,p);
    }
    public static void main(String args[])
{  
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    printfac(n,1);
    sc.close();
}
}
