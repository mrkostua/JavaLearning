package EffectiveJavaBook.StaticMethodFactory;

/**
 * Created by Администратор on 05.06.2017.
 */
public class StaticMethodFactory {

    private void showCar(CarObject_StaticMethodFactory carObject_staticMethodFactory){
        System.out.println(carObject_staticMethodFactory.getSpeed());
    }
    public static void main(String[] args) {
        System.out.println(CarObject_StaticMethodFactory.showAll("4x4","Jeep",600,230));
        StaticMethodFactory staticMethodFactory = new StaticMethodFactory();
        staticMethodFactory.showCar(new CarObject_StaticMethodFactory("2*2",2000,180));

        staticMethodFactory.showCar(CarObject_StaticMethodFactory.CarWithOutType("sedan",1500,170));

    }


}
