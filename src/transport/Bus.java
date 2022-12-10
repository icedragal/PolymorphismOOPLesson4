package transport;

public class Bus extends Transport implements Competing{
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

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " +getModel() + " прошел пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 20);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 90);
    }
}
