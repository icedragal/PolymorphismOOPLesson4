package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус " + getBrand() + " " +getModel()+ " закончил движение");
    }
}
