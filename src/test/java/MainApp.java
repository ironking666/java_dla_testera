import Utils.StringUtils;
import computer.*;
import model.Bug;
import model.BugReporter;

import java.util.*;


public class MainApp {

    public static void main(String[] args) {


        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Low", new BugReporter("Krzysiek", "Waliszewski", "iron@wp.pl"), 3));
        bugs.add(new Bug("Medium", new BugReporter("Roman", "Kaliszewski", "iron@wp.pl"), 4));
        bugs.add(new Bug("High", new BugReporter("Piotr", "Maliszewski", "iron@wp.pl"), 5));
        bugs.add(new Bug("Low", new BugReporter("Krzysiek", "Waliszewski", "iron@wp.pl"), 3));

        for (Bug bug: bugs
             ) {
            System.out.println(bug.getBugDescription());
        }

        System.out.println("--- SET ---");

        Set<Bug> bugSet = new HashSet<>(bugs);

        for (Bug bug: bugSet
             ) {
            System.out.println(bug.getBugDescription());
        }
        System.out.println("--- TREESET ---");

        Set<Bug> bugTreeSet = new TreeSet<>(bugSet);

        for (Bug bug: bugTreeSet
        ) {
            System.out.println(bug.getBugDescription());
        }


    }
}
