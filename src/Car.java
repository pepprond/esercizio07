public class Car extends AbstractVehicle {

    public int numberOfDoors;
    public double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        this.numberOfDoors=4;
        System.out.println("number of doors: " + numberOfDoors);
    }



    public Car(String type,int wheels, int doors, double price){
        this.type=type;
        this.numberOfWheels=wheels;
        this.numberOfDoors=doors;
        this.carPrice=price;
    }



    @Override
    void doVehicleSound() {
        System.out.println("brum brum");

    }
}
