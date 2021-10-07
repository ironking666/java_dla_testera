import Utils.StringUtils;


public class MainApp {

    public static void main(String[] args) {

        String bartekTest = StringUtils.getFormattedText("KrzysiekWaliszewski");
        System.out.println(bartekTest);

        String bartek = StringUtils.getFormattedText("Krzyś");
        System.out.println(bartek);


    }
}
