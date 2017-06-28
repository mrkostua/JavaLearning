package OOP_examPractice.GrupaA;

/**
 * @author Konstantyn Prysiazhnyi on 27.06.2017.
 */
interface Test77{
    void show();
}
interface Test7{
    int add();
}

public abstract class Task7 implements Test77{
    public final void show(){

    }
    interface AllTests extends Test77{
        float getAvg(int h,int i);
    }

}