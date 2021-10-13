import enums.Gender;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Bartek", "Testowy", "iro@.dl", 30, Gender.MALE));
        users.add(new User("Asia", "Testowy", "iro@.dl", 32, Gender.FEMALE));
        users.add(new User("Tomek", "Testowy", "iro@.dl", 34, Gender.MALE));
        users.add(new User("Krzysiek", "Testowy", "iro@.dl", 35, Gender.MALE));
        users.add(new User("Monika", "Testowy", "iro@.dl", 37, Gender.FEMALE));
        users.add(new User("Beata", "Testowy", "iro@.dl", 38, Gender.FEMALE));

        List<User> female = users.stream()
                .filter(user -> user.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        for (User user : female
        ) {
            System.out.println(user);
        }
    }
}






