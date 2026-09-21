class Animal {
    String color;
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        // super.speak();
        System.out.println("Meow and the color is "+super.color);
    }
    void leg(int n){
        System.out.println("legs:"+n);
    }
}



class Dog extends Animal {
    @Override
    void speak() {
        // super.speak();
        System.out.println("Barks and the color is "+super.color);
    }
    void leg(int n){
        System.out.println("legs:"+n);
    }
}


public class polymorphism {
    public static void main(String[] args) {
       Animal a;
       a=new Cat();
       a.speak();
       a=new Dog();
       a.speak();
    }
}
