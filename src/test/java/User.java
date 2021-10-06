public class User {

     String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public User (String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isUserAdult(){
        if(age >= 18) {
            return  true;
        } else {
            return false;
        }
    }
}
