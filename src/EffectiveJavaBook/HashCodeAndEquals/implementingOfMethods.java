package EffectiveJavaBook.HashCodeAndEquals;

/**
 * @author Konstantyn Prysiazhnyi on 10.06.2017.
 */

/**@TODO
 * HashCode and equals used to compare equality of objects, primarily inside hash based collections such as Hashtable and HashMap.
 *
 */


/**
 * Reflexive -  x.equal(y)
 * Symmetric - x.equal(y) and y.equal(x) true
 * Transitive - if x.equal(y) and y.equal(z) than x.equal(z)
 * Consistent - for multiple invocations equal return true
 * not-nullity
 */
public class implementingOfMethods {

    private String name;
    private int age;
    private String surname;

    public implementingOfMethods(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        implementingOfMethods that = (implementingOfMethods) o;

        if (age != that.age)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        return surname != null ? surname.equals(that.surname) : that.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}
