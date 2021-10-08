import Utils.StringUtils;
import computer.Laptop;
import computer.PC;


public class MainApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office Computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 12);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
        officeComputer.setCommutator(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        gamingLaptop.switchOn();
        //System.out.println(gamingLaptop.getState());



    }
}
