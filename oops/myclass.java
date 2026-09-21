class car{
    int speed;
    String color;

    car(int speed,String color){
        this.speed=speed;
        this.color=color;
    }

    void move(){
        System.out.println("The "+color+" car is moving at a speed of "+speed+" km/hr");
    }
}


public class myclass {
    public static void main(String[] args) {
        car mycar=new car(2,"Red");
        // mycar.speed=2;
        // mycar.color="Red";
        mycar.move();
    }
}
