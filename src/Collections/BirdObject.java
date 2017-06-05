package Collections;

import Collections.UserObject;

/**
 * Created by Администратор on 24.05.2017.
 */
public class BirdObject extends UserObject {
    private String type ="fast eay";

    public BirdObject(String name, String surname, int age) {
        super(name, surname, age);
    }


    public String getType() {
        return type;
    }
}
