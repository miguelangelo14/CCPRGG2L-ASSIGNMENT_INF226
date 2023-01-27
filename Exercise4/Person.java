
public class Person {

    int age;
    String name;

    Person(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;

    }

    void addFriend(Person Friend) {
        System.out.println(this.name + " is friends with " + Friend.name);
    
    }

    void addClassmate(Person Classmate) {
        System.out.println(this.name + " is classmate with " + Classmate.name);
    
    }
}

