import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 5
        int value = 33;
        System.out.println(value);

        changeValue(value);
        System.out.println(value);

        //task 6
        Integer valueInt = 33;
        System.out.println(valueInt);

        changeValueInt(valueInt);
        System.out.println(valueInt);

        //task 7
        int[] arrayInt = {3, 4};
        System.out.println(Arrays.toString(arrayInt));
        changeValueArray(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        //task 8
        Integer[] arrayInteger = {3, 4};
        System.out.println(Arrays.toString(arrayInteger));
        changeValueArray(arrayInteger);
        System.out.println(Arrays.toString(arrayInteger));

        //task 9
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person.toString());
        changePerson(person);
        System.out.println(person.toString());

        //task 10
        Person person1 = new Person("Lyapis", "Trubetskoy");
        System.out.println(person1.toString());
        changePerson2(person1);
        System.out.println(person1.toString());
    }

    public static void changeValue(int value ){
        value = 22;
    }

    public static void changeValueInt(Integer value ){
        value = 22;
    }

    public static void changeValueArray(int value[] ){
        value[0] = 10;
    }

    public static void changeValueArray(Integer arrayInteger[] ){
        arrayInteger[0] = 99;
    }
    public static void changePerson(Person person){
        person = new Person("Ilya", "Lagutenk0");
    }
    public static void changePerson2(Person person){
        person.setName("Ilya");
        person.setName("Lagutenk0");
    }
}
