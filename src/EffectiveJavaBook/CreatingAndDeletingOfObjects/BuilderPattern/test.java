package EffectiveJavaBook.CreatingAndDeletingOfObjects.BuilderPattern;

/**
 * @author Konstantyn Prysiażny on 07.06.2017.
 */
public class test {

    public static void main(String[] args) {
        UserObject tom = new UserObject.Builder(2,"Tom","Jerry").build();
        System.out.println(tom);

        UserObject mike = new UserObject.Builder(3,"Mike","Ross")
                .phoneNumber("570-22-11")
                .town("Cracow Poland")
                .build();
        UserObject Einstein = new UserObject.Builder(3,"Einstein","Pro")
                .phoneNumber("11-&")
                .town("Somewhere")
                .build();
        System.out.println(mike);
        System.out.println(Einstein);

    }
}
