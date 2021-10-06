public class MainApp {

    public static void main(String[] args) {

        Bug bug = new Bug("Zepsuty Mac", "ironking666@wp.pl", 1, false);
        bug.showAllInfo();
        bug.showEmail();
        bug.showBugStatus();
        int bugPriority = bug.getBugPriority();
        System.out.println(bugPriority);


    }
}
