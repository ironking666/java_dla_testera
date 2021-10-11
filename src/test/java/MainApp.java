import Utils.StringUtils;
import computer.Computer;
import computer.Laptop;
import computer.PC;


public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer = new PC("Office Computer", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 12);

        System.out.println(officeComputer.volumeUp());
        System.out.println(gamingLaptop.volumeUp());





    }
}
