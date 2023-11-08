package oopMultiThreaded2Task1;

public class UnloadingPort implements Runnable {
    private Ship ship;
    private boolean busy = false;

    public UnloadingPort() {

    }

    public void setShip(Ship ship) {
        this.ship = ship;
        busy = true;
        System.out.println("Корабель "+ship.getName()+" був пристикований");
    }

    public boolean isBusy() {
        return busy;
    }

    @Override
    public synchronized void run() {
    	int box = 10;
        int boxShip = ship.getBoxinShip();
        for (int i = boxShip; i > 0; i--) {
            try {
                System.out.println((box--) + " ящик було вивантажено з: " + ship.getName());
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
        busy = false;
        notifyAll();
    }
}