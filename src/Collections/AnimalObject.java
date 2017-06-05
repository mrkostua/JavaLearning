package Collections;

import Collections.UserObject;

/**
 * Created by Администратор on 24.05.2017.
 */
public class AnimalObject extends UserObject {

    private String typeAnimal ="big killer";
    public AnimalObject(String name, String surname, int age) {
        super(name, surname, age);
    }



    public String getTypeAnimal() {
        return typeAnimal;
    }

}
