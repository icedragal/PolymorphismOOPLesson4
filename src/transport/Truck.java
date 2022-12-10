package transport;

public class Truck extends Transport{
    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " +getModel()+ " закончил движение");
    }
}
