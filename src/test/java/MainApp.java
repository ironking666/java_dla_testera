import Utils.StringUtils;
import computer.*;


public class MainApp {

    public static void main(String[] args) {


        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("GoodRAM", 128);
        Computer mac = new Laptop("Mac","Pro", hdd, ram, 45);
        System.out.println(mac.getRam().getSize());







    }
}
