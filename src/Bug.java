public class Bug {
    String bugDescription;
    String email;
    int priority;
    boolean bugStatus;

    Bug(String bugDescription, String email, int priority, boolean bugStatus){
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.bugStatus = bugStatus;

    }
    void showEmail(){
        System.out.println(email);
    }
    void showBugStatus(){
        System.out.println(bugStatus);
    }
    void showAllInfo(){
        System.out.println(bugDescription +" " + email + " " + priority + " " + bugStatus);
    }
    int getBugPriority(){
        return priority;
    }
}
