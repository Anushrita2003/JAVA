public class bitwiseOperationGET {
    public static void main(String args[]){
    int a=5;
    int pos=2;

    int bitMask=1<<pos;

    if((bitMask & a)==0)
        System.out.println("the bit is 0");
        else
            System.out.println("the bit is 1");
    
    }
    
}
