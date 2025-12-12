package Abstraction;

public class Ferrari extends Car{
    @Override
    void applybrakes() {
        System.out.println("Applying brakes to ferrari ");
    }

    @Override
    void accelerate() {
        System.out.println("Accelarating ferrari ");
    }
}
