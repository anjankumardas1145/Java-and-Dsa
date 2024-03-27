package OOPS_By_KG;

public class Car {
    String name;
    String color;
    int noOfWheels;
    float maxSpeed;
    double currentFuelInLiters;
    int noOfSeats;

    public void drive() {
        if (currentFuelInLiters == 0) {
            System.out.println("car is out of fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("car is in reserved mode please refuel it");
            currentFuelInLiters--;
        } else {
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }

    }


    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }
public float getCurrentFuelLevel(){
        return (float)currentFuelInLiters;
}

}
