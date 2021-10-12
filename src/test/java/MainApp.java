import Utils.StringUtils;
import computer.*;
import model.Bug;
import model.BugReporter;


public class MainApp {

    public static void main(String[] args) {


        BugReporter bugReporter = new BugReporter("Krzysztof", "Waliszewski", "ironking666@wp.pl");
        Bug bug = new Bug("Major Bug",bugReporter, 5);

        System.out.println(bug);
        bug.setBugStatus(true);
        System.out.println(bug);






    }
}
