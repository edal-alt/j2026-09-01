package c;

public interface Gasoline {
    double calcGasMPG();
    void setMilesfromGas(double miles);
    void setGallonfromGas(double gallons);//set method for the cost per gallon
    void setCostPerGallon(double cost); //get method for the gallosn used
    double getCostPerGallon();
}