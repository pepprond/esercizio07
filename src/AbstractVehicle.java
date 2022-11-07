public abstract class AbstractVehicle {
    public String type;
    public  int numberOfWheels;



    public void showVehicleDetails(){
        System.out.println("type vehicle:" + this.type + "\nnumber of wheels: " + this.numberOfWheels);

    }

    abstract void doVehicleSound();
}
