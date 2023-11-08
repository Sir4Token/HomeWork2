package oopMultiThreaded2Task1;

import java.util.concurrent.ConcurrentLinkedQueue;

public class AllPort {
    private UnloadingPort[] UnloadingPort;
    public Thread[] unloadThreads;
    ConcurrentLinkedQueue<Ship> ships = new ConcurrentLinkedQueue<>();

    public AllPort(int quantityUnloadingPorts) {
        this.UnloadingPort = new UnloadingPort[quantityUnloadingPorts];
        this.unloadThreads = new Thread[quantityUnloadingPorts];
        for (int i = 0; i < quantityUnloadingPorts; i++) {
        	UnloadingPort[i] = new UnloadingPort();
        }
    }

    public void addShipQueued(Ship ship) {
        ships.add(ship);
    }

    public synchronized void unloadShip() {
        int freeDockPosition;
        while (!ships.isEmpty()) {
            freeDockPosition = FreeUnloadingPort();
            if (freeDockPosition>=0){
            	UnloadingPort[freeDockPosition].setShip(ships.poll());
                unloadThreads[freeDockPosition] = new Thread(UnloadingPort[freeDockPosition]);
                unloadThreads[freeDockPosition].start();
            }
        }
        System.out.println("Пустий порт");
    }

    public int FreeUnloadingPort() {
        int result = -1;
        for (int i = 0; i < UnloadingPort.length; i++) {
            if (!UnloadingPort[i].isBusy()) return i;
        }
        return result;
    }
}
