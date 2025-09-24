import java.util.Scanner;

public class reverseString {
    public static void reverse(String s,int l){
        if(l==0){
        System.out.print(s.charAt(l));
        return;
        }
        System.out.print(s.charAt(l));
        reverse(s,l-1);
    }
    public static void main(String args[])
{  
    Scanner sc= new Scanner(System.in);
    String s=sc.nextLine();
    int l=s.length();
    reverse(s,l-1);
    sc.close();
}
}
