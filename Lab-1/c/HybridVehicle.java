package c; 
public class HybridVehicle implements Gasoline, Electric {
    //Variables for Gas
    private double milesGas; // box to store vale of miles of gas
    private double gallonGas; // gallons of gas
    private double costperGallon; // cost per gallon

    //Variables for the Electric
    private double totalkWh; // same thing values to store for the elctric
    private double costkWh; 
    private double electricMiles; 

    //Gas Method

    public double calcGasMPG (){
        if (milesGas < 0 || gallonGas <=0){
            return 0; 
        }
        return milesGas / gallonGas;
    }

    
    public void setCostPerGallon(double cost) { //setter which put it into box
        costperGallon = cost;
    }
    public void setMilesfromGas (double miles) { //setter
        milesGas = miles; 
    }
    public double getCostPerGallon () { // gives val
        return costperGallon;
    }
    public void setGallonfromGas (double gallons) {
        gallonGas = gallons;

    
    }


    //Electric Methods

    public double calcMPGe() { //( milrs / kwh) * 33.7 = MPG in electric
        if (electricMiles < 0 || totalkWh <=0){
            return 0;
        }
        return(electricMiles/ totalkWh ) * 33.7;

    }


    public void setElectricMiles (double totalElectricMiles) {
        electricMiles = totalElectricMiles; 
    }
    public void setTotalkWh (double kwh) {
       totalkWh = kwh;
    }

    public void setCostPerkWh (double cost) {
        costkWh = cost;
    }

    public double getCostPerKWH () {
        return costkWh;
    }
}



