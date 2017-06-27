package OOP_examPractice.GrupaA;

/**
 * @author Konstantyn Prysiazhnyi on 27.06.2017.
 */
public class Task16 {
    static int j;


    static void methodA(int i){
        boolean b;
        int i2 = 0;
        do{
            b = i<10 | methodB(4);
            System.out.println("i4 b: " +b+" J:" + j);
            b = i<10 || methodB(8);
            System.out.println("i8 b: " +b+" J:" + j);

            i2++;
            if(i2==160)
                break;
        }
        while (!b);
    }
    static boolean methodB(int i){
        j+=i;
        return true;
    }

    public static void main(String[] args) {
        methodA(0);
        System.out.println("j = " + j);
    }
}
