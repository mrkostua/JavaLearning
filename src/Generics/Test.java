package Generics;

import Collections.AnimalObject;
import Collections.BirdObject;
import Collections.UserObject;

/**
 * Created by Администратор on 24.05.2017.
 */
public class Test {

    public static void main(String[] args) {
        GenericsUserObject<Integer> genericsUserObject = new GenericsUserObject<Integer>(20,"TOM",21);
        GenericsUserObject genericsUserObjectPro = new GenericsUserObject<>(20,"TOM",21);
        GenericsUserObject<?> genericsUserObject1 = new GenericsUserObject<>(10,"and",42);


        Integer i[] = {1,2,3};
        String s[] = {"hh","gfgf","TOM"};
        genericsUserObject.<Integer>show(i);
        genericsUserObject.show(s);
        genericsUserObject1.show(i);





        UserObject u = new UserObject("gg","g",2);
        AnimalObject a = new AnimalObject("a","aa",3);
        u=a;
        System.out.println(((AnimalObject) u).getTypeAnimal());



    }
}
