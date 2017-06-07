package EffectiveJavaBook.CreatingAndDeletingOfObjects.BuilderPattern;

public class UserObject {

    private  int  id;

    private  String name;
    private   String email;
    private  String town;
    private  String phoneNumber;


    private UserObject(Builder builder) {
        id= builder.id;
        name = builder.name;
        email = builder.email;
        town = builder.town;
        phoneNumber= builder.phoneNumber;
    }

    static class Builder{
        //set required variables final to ensure they are set on the constructor
        private final int  id;
        private final String name;
        private final String email;

        //optional parameters
        private String town="";
        private String phoneNumber="";

         Builder(int id, String name,String email){
            this.id = id;
            this.name=name;
            this.email=email;
        }

         Builder town(String town){
            this.town = town;
            return this;
        }
         Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

         UserObject build(){
            return new UserObject(this);
        }
    }

    @Override
    public String toString() {
        return "UserObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", town='" + town + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }



}