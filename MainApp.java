
interface Car{
    String getName();
    int getMaxSpeed();
    static void getFastestCar(Car car1, Car car2){
        if(car1.getMaxSpeed() > car2.getMaxSpeed()){
            System.out.println("Fastest car is: "+car1.getName()+" with Maximum speed: "+car1.getMaxSpeed());
        }
        else{
            System.out.println("Fastest car is: "+car2.getName() + " with Maximum speed: "+car2.getMaxSpeed());
        }
    }
}
class BMW implements Car{
    public String name;
    public int speed;
    BMW(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public String getName(){
        return name;
    }
    public int getMaxSpeed() {
        return speed;
    }
}
class Audi implements Car{
    public String name;
    public int speed;
    Audi(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public String getName(){
        return name;
    }
    public int getMaxSpeed(){
        return speed;
    }
}
public class MainApp{
    public static void main(String[] args){
        Car car1 = new BMW("BMW M5", 250);
        Car car2 = new Audi("AUDI R8", 200);
        Car.getFastestCar(car1, car2);

    }
}