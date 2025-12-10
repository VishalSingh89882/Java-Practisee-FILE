public class CarObject {
    public static void main() {
        CarClass suzuki = new CarClass();
        suzuki.modelname ="Suzuki F412";
        suzuki.maxspeed = 120;
        suzuki.seats = 4;
        suzuki.display();


        CarClass  Mahindra = new CarClass();
        Mahindra.modelname ="Mahindra Z34";
        Mahindra.maxspeed = 150;
        Mahindra.seats = 6;
        Mahindra.display();
    }
}
