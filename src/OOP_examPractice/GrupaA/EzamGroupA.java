package OOP_examPractice.GrupaA;

import java.io.IOException;

/**
 * @author Konstantyn Prysiazhnyi on 27.06.2017.
 */
public class EzamGroupA {

    //Task 9
    private static int[] x;

    public static void main(String[] args) {
        System.out.println(x[0]);
    }

    //Task 1

//    boolean	                 false
//    char          	        \u0000
//    int,short,byte / long	    0 / 0L
//    float /double     	0.0f / 0.0d
//    any reference type    	null

    //Task 2 ??
//    Type	Size	Range of values that can be stored
//    byte	1 byte	−128 to 127
//    short	2 bytes	−32768 to 32767
//    int	4 bytes	−2,147,483,648 to 2,147,483,647
//    long	8 bytes	9,223,372,036,854,775,808 to 9,223,372,036,854,755,807

//    Type	Size	Range of values that can be stored
//    float	4 bytes	    3.4e−038 to 3.4e+038
//    double 8 bytes	1.7e−308 to 1.7e+038

    //Task 3 (d)
    //Task4 (c,d)
    interface Base{
        boolean start();
    }
    abstract class Test  implements Base{
        public boolean start(){
            System.out.println("start");
            return (5<2);
        }
    }
    //Task5 (d)



}
//Task 6 (C) final can't be override
class A{
   final public int getSomething(){
        return 0;
    }
}
//class B extends A{
//    public int getSomething(){
//        return 1;
//    }
//}

//Task 7(e,c)
//Task 8(c)
//Task 9(b)
//Task 10(d)
//Task 11(c)

//Task 12(b) Can be final but not obligatory
 class Taks12{
    private static  void innerClass(){
         abstract class Inner {
            abstract void show();
        }
         class Show extends Inner{
             @Override
             void show() {

             }
         }
    }
}



//Task 13(b)

//Task 14 practice to delete objects , garbage collection

//Task 15 assertion  practice
//Task 16 ?????/
//Task 17(C)
class Task17Test{
    public  void test(int a,int b) throws Exception{

    }
}
class Task17 extends Task17Test{
    private  void test(int a) throws Exception{

    }
    private void test(String a) throws IOException{

    }
    public void test(int a, int b) throws IOException{

    }
    private void practice(){
        final int a;
        a=5;
        try {
            test(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            test("fddfdf");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            test(2,3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            super.test(2,3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Task 18(b)

//Task 19(b,c,d) ( final class can't be extended ) (final methods can't be override)
//Task 20(a,b,c,d) ?? niezbedny http://www.java67.com/2016/02/how-to-loop-over-treeset-in-java-with.html
//Task 21(a,b,c)
class Task22{
    private static void test(){
        String s[] = new String[5];
        try {
            System.out.println(s[5]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        s[2] = new String();
        System.out.println("new String() " + s[2]);
        try {
            System.out.println(s[3].length());
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        test();
    }
}
//Task 22(b,d)
class Task23{
    private static void test(){
        byte a=0;
        System.out.println("byte :" + a);
        System.out.println("i=" +a);
        System.out.println(a<'a');
    }
}
//Task 23(d,b)
//Task 24(a,c,e)?
//Task 25(c) ??? unreadable


