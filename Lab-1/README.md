The Build:
The program iplements a HybridVehicle using two infrencees: Gasoline and Electric. It calculates: Gasoline MPG, Electric MPGe, Half-gas/half electric average, & Gasoline/Electricy cost per gallon/kWh. JUnit 4 is used to test the calculation, methods, and edge cases. Its split into two seperate files; c where the coding files are which include Gasoline, Electric, HybridVehicle, CarRunner,TestMe, and then the u file which include HybridVehicleTests, and TestMeTests. 

javac - cp jUnit-4.13.2.jar
      c/Gasoline.java
      c/Electric.java
      c/HybridVehicle.java
      c/CarRunner.java
      u/hybridVehicleTests.java
The Test:
Test the file using the following run in terminal 
java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:." org.junit.runner.JunitCost u.HybridVehicleTests


The Run:

java -cp "." c.CarRunner



the expected output should print out the gas MPG, electric MPGe, and half gas/half electric average 



MPG is Gas =20.0
Electric MPGe: 144.42857142857144
Half Gas/Electric Average: 82.21428571428572

While running JUnit Tests you run the following:

java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:." org.junit.runner.JunitCost u.HybridVehicleTests

which will get your expected output to look like:
JUnit version 4.13.2
.........
Time: 0.015

OK (9 tests)