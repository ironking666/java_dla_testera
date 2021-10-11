package computer;

public class PC extends Computer{

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

    public int volumeUp(){
        return volumeLevel += 1;
    }

    @Override
    public void switchOn() {
        System.out.println("Connection");
        if(commutator) {
        super.switchOn();
        } else {
            System.out.println("Devices is not connected");
        }
    }
}
