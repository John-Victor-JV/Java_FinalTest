public class Motorcycle extends Vehicle{
    private boolean sideCar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sideCar){
        super(make, plate, color, category);
        this.sideCar = sideCar;
    }

    public boolean isSideCar(){
        return sideCar;
    }

    @Override
    public String getVehicle(){
        return "MotorCycle";
    }
}
