package oopMultiThreaded2Task1;

public class Ship {
    private String name;
    private int box;
    
    public Ship(String name, int box) {
        this.name = name;
        this.box = box;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBoxinShip() {
        return box;
    }

    public void setDrawerCapacity(int box) {
        this.box = box;
    }

}
