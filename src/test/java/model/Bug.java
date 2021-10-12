package model;

public class Bug implements ConsoleNotification{
    private String bugDescription;
    private int bugPriority;
    private boolean bugStatus;
    private BugReporter bugReporter;

    public Bug(String bugDescription, BugReporter bugReporter, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }


    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Jest zbyt krótki. Nie ustawiamy");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority < 1) {
            System.out.println("Zbyt małe. Błąd");
        } else if (bugPriority > 5) {
            System.out.println("Zbyt duże. Błąd");
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        notifyStatusChange();
        this.bugStatus = bugStatus;
    }


    public void showBugStatus() {
        System.out.println("Bug status");
    }

    public int getBugPriority() {
        return bugPriority;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                ", bugReporter=" + bugReporter +
                '}';
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Status change");
    }
}
