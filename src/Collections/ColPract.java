package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Администратор on 23.05.2017.
 */
 enum names{
    TOM,
    ALEX,
    NIKITA,
    ANDRIJ
}
public class ColPract {

//    public void traverseCollections(List<UserObject> userObjects){
//
//        userObjects.stream()
//                .filter((UserObject isItTom) ->
//                        isItTom.getName().equals(names.TOM.toString()))
//                .forEach((UserObject showAllUsersWithFilter) ->{
//                    System.out.print(" Surname :" + showAllUsersWithFilter.getSurname());
//                    System.out.println("  Age : + :" + showAllUsersWithFilter.getAge());
//                });
//    }
    public void traverseCollectionsString(List<String> userObjects){

        userObjects.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ColPract colPract = new ColPract();
        List<UserObject> userObjects = new ArrayList<>();

        Random random = new Random();
        String name ="";
        String surname="";
        for(int i =0; i <20; i++){
            switch (random.nextInt(4)){
                case 0:
                    name=String.valueOf(names.TOM);
                    surname="Kuczeriawyj";
                    break;
                case 1:
                    name=String.valueOf(names.ALEX);
                    surname="Cmuglyj";

                    break;
                case 2:
                    name=String.valueOf(names.ANDRIJ);
                    surname="Bandit";
                    break;
                case 3:
                    name=String.valueOf(names.NIKITA);
                    surname="Bilyj";
                    break;
            }
            userObjects.add(new UserObject(name,surname,i+10));
        }
        String result = userObjects.stream()
                .map(Object::toString)
                .collect(Collectors.joining(",\n "));
        System.out.println(result);

        System.out.println("\n ___________");
       // colPract.traverseCollections(userObjects);
    }
}
