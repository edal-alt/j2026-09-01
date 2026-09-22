package u;
import c.HybridVehicle;
import static org.junit.Assert.*;
import org.junit.Test;
//command to run: java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:." org.junit.runner.JUnitCore u.HybridVehicleTests

public class HybridVehicleTests {

    @Test 
    public void testGasMPG() {
        HybridVehicle car = new HybridVehicle ();
        car.setMilesfromGas(120);
        car.setGallonfromGas(6);
        double answer = car.calcGasMPG();
        assertEquals(20.0, answer, 0.01);

    }

    @Test 
    public void testElectricMPGe(){
        HybridVehicle car = new HybridVehicle();
        car.setElectricMiles(300);
        car.setTotalkWh(70);
        double answer = car.calcMPGe();
        assertEquals(144.43, answer, 0.01);
    }
   

    @Test
    public void testGasCost() {
        HybridVehicle car = new HybridVehicle();
        car.setCostPerGallon(3.50);
        assertEquals(3.50, car.getCostPerGallon(), 0.01);

    }
    @Test
    public void testElectricCost(){

        HybridVehicle car = new HybridVehicle();
        car.setCostPerkWh (0.24);
        assertEquals(0.24, car.getCostPerKWH(), 0.01);
    }

    

    @Test 
    public void testHybridAvg() {

        HybridVehicle car = new HybridVehicle (); 
        car.setMilesfromGas(120);
        car.setGallonfromGas(6);
        car.setElectricMiles(300);
        car.setTotalkWh(70);
        
        double gasMPG= car.calcGasMPG();
        double electricMPGe = car.calcMPGe();
        double actual = (gasMPG + electricMPGe) / 2.0;
        double expected = (20.0 + 144.43) / 2.0;

        assertEquals(expected, actual, 0.01);
        
    }
    @Test
    public void testNegGasMiles(){
        HybridVehicle car = new HybridVehicle();
        car.setMilesfromGas (-120);
        car.setGallonfromGas(6);

        double answer = car.calcGasMPG();
        assertEquals(0.0, answer, 0.01);

    }
    @Test
    public void testNegKWh(){
        HybridVehicle car = new HybridVehicle();

        car.setElectricMiles(300);
        car.setTotalkWh(-70);

        double answer = car.calcMPGe();

        assertEquals(0.0, answer, 0.01);
    }
    @Test
    public void testZeroGallons(){
        HybridVehicle car = new HybridVehicle();
        car.setMilesfromGas(120);
        car.setGallonfromGas(0);
        double answer = car.calcGasMPG();

        assertEquals(0.0, answer, 0.01);
    }
    @Test
    public void testZeroKWh(){
        HybridVehicle car = new HybridVehicle();
        car.setElectricMiles(3000);
        car.setTotalkWh(0);
        double answer = car.calcMPGe();

        assertEquals(0.0, answer, 0.01);
}
}