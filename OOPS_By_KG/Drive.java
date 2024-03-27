package OOPS_By_KG;

public class Drive {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.addFuel(6);
        System.out.println(myCar.currentFuelInLiters);
myCar.drive();
myCar.drive();
        myCar.drive();
        System.out.println(myCar.currentFuelInLiters);
        System.out.println(myCar.getCurrentFuelLevel());
    }
}
