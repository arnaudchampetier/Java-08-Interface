public class Eagle extends Bird {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

public void takeOff() {
    if (!this.flying) {
        System.out.println("Taking off...");
        this.flying = true;
    }
}

public void ascend(int meters) {
    if (this.flying) {
        System.out.println("Ascending to " + meters + " meters...");
        this.altitude += meters;
    }
}

public void glide() {
    if (this.flying) {
        System.out.println("Gliding...");
    }
}

public void descend(int meters) {
    if (this.flying) {
        System.out.println("Descending to " + meters + " meters...");
        this.altitude -= meters;
    }
}

public void land() {
    if (this.flying && this.altitude == 0) {
        System.out.println("Landing...");
        this.flying = false;
    }
}

}
