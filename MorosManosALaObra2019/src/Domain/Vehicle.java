package Domain;

/**
 *
 * @author Steven
 */
public class Vehicle {

    //Variables
    String name;
    int year;
    float mileage;
    boolean isAmerican;
    int vehicleIdentificationNumber;

    //Constructor
    public Vehicle() {
        this.name = "";
        this.year = 0;
        this.mileage = 0;
        this.isAmerican = false;
        this.vehicleIdentificationNumber = 0;
    }//constructor vacio

    public Vehicle(String name, int year, float mileage, boolean isAmerican, int vehicleIdentificationNumber) {
        this.name = name;
        this.year = year;
        this.mileage = mileage;
        this.isAmerican = isAmerican;
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }//Constructor Recargado
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public boolean isIsAmerican() {
        return isAmerican;
    }

    public void setIsAmerican(boolean isAmerican) {
        this.isAmerican = isAmerican;
    }

    public int getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(int vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "Name=" + name + ", Year=" + year + ", Mileage=" + mileage
                + ", Is American?=" + isAmerican + ", Vehicle Identification Number=" + vehicleIdentificationNumber + '}';
    }//ToString

    public int size() {
        return this.getName().length() * 2 + 4 + 4 + 1 + 4;
    }//size()

}//Fin de clase.
