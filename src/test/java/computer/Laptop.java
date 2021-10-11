package computer;

public class Laptop extends Computer implements Music {

    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;

    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 3;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel <= 0) {
            System.out.println("Low battery");
        } else {
            super.switchOn();
        }

    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;

    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = volumeLevel + newVolumeLevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");
    }

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");

    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }
}
