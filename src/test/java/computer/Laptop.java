package computer;

public class Laptop extends Computer{

    private int batteryLevel;
    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;

    }
    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public void switchOn(){
        System.out.println("Checking battery level");
        if(batteryLevel <= 0 ) {
            System.out.println("Low battery");
        } else {
            super.switchOn();
        }

    }
}
