import java.util.Scanner;

public class String_2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        // int cols=sc.nextInt();

        int l1=s1.length();
        String s="";


        for(int i=l1-1;i>=0;i--){
            s=s+s1.charAt(i);
        }
        System.out.println(s);
        // System.out.println(s1.substring(0, 1));
         sc.close(); 
    }
}
