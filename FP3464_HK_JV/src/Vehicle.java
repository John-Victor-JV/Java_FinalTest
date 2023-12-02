public class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleType category;

    public Vehicle(String make, String plate, String color, VehicleType category){
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    public String getMake(){
        return make;
    }

    public String getPlate(){
        return plate;
    }

    public String getColor(){
        return color;
    }

    public VehicleType getCategory(){
        return category;
    }

    public String getVehicle(){
        return "Vehicle";
    }

    public String getVehicleDetails(){
        String vehicleDetails = "Employee has a " + getVehicle() + "\n\t- make: " +
                                getMake() + "\n\t- plate: " + getPlate() + "\n\t- color: " +
                                getColor() + "\n\t- category: " + getCategory();

        return vehicleDetails;
    }
}
