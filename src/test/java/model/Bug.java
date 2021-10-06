package model;

public class Bug {
    private String bugDescription;
    private String email;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public void showAllBugs() {
        System.out.println("Bug description: " + bugDescription + " , " + " email: " + email + " bug priority: " + bugPriority
                + " bug Status: " + bugStatus);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Incorrect symbol");
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

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }

    public void showEmail() {
        System.out.println("Email: " + email);
    }

    public void showBugStatus() {
        System.out.println("Bug status");
    }

    public int getBugPriority() {
        return bugPriority;
    }
}
