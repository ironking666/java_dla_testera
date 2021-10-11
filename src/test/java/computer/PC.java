package computer;

public class PC extends Computer {

    private boolean commutator;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        commutator = false;
    }

    public void setCommutator(boolean commutator) {
        this.commutator = commutator;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp() {
        return volumeLevel += 1;
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
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
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
    public void switchOn() {
        System.out.println("Connection");
        if (commutator) {
            super.switchOn();
        } else {
            System.out.println("Devices is not connected");
        }
    }
}
