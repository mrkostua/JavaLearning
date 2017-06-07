package EffectiveJavaBook.StaticMethodFactory;

/**
 * Created by Администратор on 05.06.2017.
 */
public class CarObject_StaticMethodFactory {
    private   String type = "car";
    private String mark = "";

    private int weight = 0;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed = 0;


    private static final int TOP_WEIGHT =4000;
    private static final int TOP_SPEED = 350;

    public CarObject_StaticMethodFactory(String mark, int weight, int speed) {
        this.mark = mark;
        this.weight = weight;
        this.speed = speed;
    }


    public static CarObject_StaticMethodFactory CarWithOutType(String mark, int weight, int speed ){
        return new CarObject_StaticMethodFactory(mark,weight,speed);
    }
    public static String showAll(String type, String mark, int weight,int speed){
        return "type :" + type + " mark :" + mark + " weight :" + weight + " speed : " + speed;
    }


    public String getType(){
        return type;
    }


    public static String carIsItTopWeight(int weight,int speed){
        return weight<= CarObject_StaticMethodFactory.TOP_WEIGHT && speed>= CarObject_StaticMethodFactory.TOP_SPEED  ? "TOP" : "SHIT";
    }




}
