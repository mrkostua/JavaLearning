package Generics;

import Collections.AnimalObject;
import Collections.UserObject;

/**
 * Created by Администратор on 24.05.2017.
 */
public class GenericsUserObject<T extends Number> {
    private T t;
    private String name="";
    private int age = 0;

    public GenericsUserObject(T t, String name, int age) {
        this.t = t;
        this.name = name;
        this.age = age;

    }


    public <U> void show(U[] u){
        for (int i=0; i<u.length;i++){
            System.out.println(u[i]);
        }

    }
}
