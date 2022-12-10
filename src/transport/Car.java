package transport;

import java.time.LocalDate;
public class Car extends Transport{
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel()+ " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " +getModel()+ " закончил движение");
    }
}

