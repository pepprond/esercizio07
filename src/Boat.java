public class Boat extends AbstractVehicle {
    public double maxKnotsSpeed;
    public int boatKilosWeight;



    public Boat(String type,double maxSpeed, int weight){
        this.type=type;
        this.maxKnotsSpeed=maxSpeed;
        this.boatKilosWeight=weight;

    }
    public void getBoatWeightAndSpeed(){
        System.out.println( "total kilos weight: "+ this.boatKilosWeight + "\nmaximum knots speed: "+ maxKnotsSpeed);
    }
    @Override
    void doVehicleSound() {
        System.out.println("wrumm wrumm");
    }
}
