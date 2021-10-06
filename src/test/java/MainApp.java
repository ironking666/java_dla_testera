import model.Bug;

public class MainApp {

    public static void main(String[] args) {

        Bug bug = new Bug("Short", "ironking666@wp.pl", 3);

        bug.showAllBugs();
        bug.setBugDescription("Longlonglong");
        bug.setEmail("ironkingironking@wp.pl");
        bug.setBugPriority(-1);
        bug.showAllBugs();
    }
}
