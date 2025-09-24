import java.util.Scanner;

public class F1AndL1String {
    public static int first=-1;
    public static int last=-1;
    public static void count(String s,String c,int l){
        for(int i=0,j=l;i<l;i++,j--){
        if(s.charAt(i)==l){
            if(s.charAt(j)==l)
        System.out.println("First match is at index "+i+" last match is at index "+j);
        }
        }
        return;
    }
    public static void main(String args[])
{  
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String");
    String s=sc.nextLine();
    // System.out.println("Enter the the letter whose 1st occurance and last occurance has to be searched");
    // String c=sc.next();
    int l=s.length();
    count(s,l-1);
    sc.close();
}
}
