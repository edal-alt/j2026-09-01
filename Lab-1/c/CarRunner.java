package c;

public class CarRunner {
    public static void main(String[] args) {
        HybridVehicle car = new HybridVehicle ();

        car.setMilesfromGas(120);
        car.setGallonfromGas(6);
        car.setCostPerGallon(3.50);

        double gasMPG = car.calcGasMPG();
        System.out.println("MPG is Gas =" + gasMPG);

        car.setElectricMiles (300);
        car.setTotalkWh(70);
        car.setCostPerkWh(0.24);

        double electricMPGe = car.calcMPGe();

        System.out.println("Electric MPGe: " + electricMPGe);
        double average = (gasMPG + electricMPGe) / 2;
        System.out.println("Half Gas/Electric Average: " + average);

    }
}
