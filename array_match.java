import java.util.Scanner;

public class array_match {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns");
        int cols=sc.nextInt();
        System.out.println("Enter the number to be searched from the array elements");
        int x=sc.nextInt();

        int numbers[][] = new int[rows][cols];

        System.out.println("Enter the elements of array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
             numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){  
                System.out.print("The element is found at row "+i+" and column "+j);
                }
                System.out.print("\n"+numbers[i][j]+" "); 
            }
            System.out.println();
        }
         sc.close(); 
    }
}
