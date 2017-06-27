package OOP_examPractice.GrupaA;

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
    //Task4 (d)
    interface Base{
        boolean start();
    }
    abstract class Test  implements Base{
        public boolean start(){
            System.out.println("start");
            return (5<2);
        }
    }
    //Task5 (d) but also possible long, int, bite(result will be cut to those types)



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

//Task 7(e)
//Task 8(c)
//Task 9(b)
//Task 10(d)
//Task 11(c)

//Task 12(a,b)
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
//Task 17(c)
//Task 18(c)
//Task 19(c)
//Task 20(c)
//Task 21(c)
//Task 22(c)
//Task 23(c)
//Task 24(c)
//Task 25(c)


