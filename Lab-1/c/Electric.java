package c;
public interface Electric {
    double calcMPGe();
    void setElectricMiles(double totalElectricMiles);
    void setTotalkWh(double totalkWh); //store the value 
    void setCostPerkWh(double cost); //gives val 
    double getCostPerKWH(); //returns the val
}