public class Main {
    public static void main(String[] args) {
        Car car = new Car("car",4,5,12000.500);
        Boat boat =new Boat("boat", 320.0,450);

        car.showVehicleDetails();
        car.doVehicleSound();
        System.out.println("--------------------");
        boat.showVehicleDetails();
        boat.getBoatWeightAndSpeed();
        boat.doVehicleSound();

    }

}