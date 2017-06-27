package OOP_examPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Konstantyn Prysiazhnyi on 27.06.2017.
 */
public class QuestionsFromLectures {

    public static void test1(){
        try{
            return;
        }
        finally {
            System.out.println("finally");
        }
    }


      class A{
//         final public int getResult(int a){
//            return 0;
//        }
    }
    class B extends A{
        final  public int getResult(int a){ //error can't override final method
            return 1;
        }
    }




    public static void main(String[] args) {
//1
        QuestionsFromLectures.test1();
//3
        QuestionsFromLectures questionsFromLectures = new QuestionsFromLectures();
        B b = questionsFromLectures.new B();
        System.out.println(b.getResult(2));

//4
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(2,"Anton"));
        personList.add(new Person(3,"Maks"));
        personList.add(new Person(1,"Halk"));
        personList.add(new Person(40,"Mark"));
        personList.add(new Person(15,"Jon"));

        for (Person p : personList)
            System.out.println(p);

        System.out.println("sorted list");
       personList = personList.stream().sorted().collect(Collectors.toList());
        for (Person p: personList
             ) {
            System.out.println(p);
        }





//basic 4
        System.out.println("task 4 basic");
        Person[] personArray = {new Person(2,"Anton"),new Person(3,"Anton"),new Person(2,"Pol"),new Person(40,"Anton"),new Person(1,"Anton")};
         Arrays.sort(personArray);
        for (Person p:
             personArray) {
            System.out.println(p);

        }
    }
}
    class Person implements Comparable<Person> {
    private int salary;
    private String name;

    public Person(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if(o.salary<this.salary)
            return -1;
        else if(o.salary==salary)
            return 0;
        return 1;
    }

        @Override
        public String toString() {
            return "Person{" +
                    "salary=" + salary +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
