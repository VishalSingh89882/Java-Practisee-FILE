package Abstraction;

public class Audi extends Car{
    @Override
    void applybrakes() {
        System.out.println("Applying brakes to audi ");
    }

    @Override
    void accelerate() {
        System.out.println("Accelarating audi ");
    }
}
