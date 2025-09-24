import java.util.Scanner;

public class fibonacciRecursion {
    public static void printfac(int n,int i,int n1,int n2,int s){
        if(i==n){
           s=n1+n2;
        System.out.println(s);
        return;
        }
      s=n1+n2;
        printfac(n,i+1,n2,s,s);
    }
    public static void main(String args[])
{  
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int n=sc.nextInt();
    int i=3;
    printfac(n,i,0,1,0);
    sc.close();
}
}
