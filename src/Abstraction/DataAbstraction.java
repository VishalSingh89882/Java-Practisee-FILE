package Abstraction;

public class DataAbstraction {
    public static void main(String[] args)
    {
      Car car1 = new Audi();
      CarRepair repair = new CarRepair();
      repair.repairCar(car1);

      car1 = new Ferrari();
      repair.repairCar(car1);
    }
}
