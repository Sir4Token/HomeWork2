package oopMultiThreaded2Task1;

public class Main {
    public static void main(String[] args) {
    	
    	AllPort seaPort = new AllPort(2);
    	
        Ship ship1 = new Ship("Atlantic",10);
        Ship ship2 = new Ship("Jorda Javana",10);
        Ship ship3 = new Ship("Mason",10);
        
        seaPort.addShipQueued(ship1);
        seaPort.addShipQueued(ship2);
        seaPort.addShipQueued(ship3);
        
        seaPort.unloadShip();
    }
}