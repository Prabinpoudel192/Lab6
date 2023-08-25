class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class CallByValueAndReference {

    // This method demonstrates call by value
    static void modifyPrimitive(int x) {
        x = x * 2;
        System.out.println("Inside modifyPrimitive: x = " + x);
    }

    // This method demonstrates call by reference
    static void modifyReference(Person person) {
        person.name = "Prabin";
        System.out.println("Inside modifyReference: person.name = " + person.name);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before modifyPrimitive: a = " + a);
        modifyPrimitive(a);
        System.out.println("After modifyPrimitive: a = " + a);

        Person person = new Person("Bhanubhakta Acharya");
        System.out.println("Before modifyReference: person.name = " + person.name);
        modifyReference(person);
        System.out.println("After modifyReference: person.name = " + person.name);
    }
}
