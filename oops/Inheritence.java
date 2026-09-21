class Animal{
    String animal;
    String sound;
    String breed;
    int number;

    void call(){
        System.out.println("The "+animal+" of "+" breed "+breed+" sounds like "+sound+" and present in "+number+"number");
    }
}

class cat extends Animal{
    int leg;
     void display() {
    super.call();

    System.out.println(super.animal+" has "+leg+" legs.");
}
}

public class Inheritence {
    public static void main(String args[]){
        cat mycat=new cat();
        mycat.leg=4;
        mycat.animal="cat";
        mycat.sound="meow";
        mycat.breed="indian";
        mycat.number=7;
        mycat.display();
    }
}
