public class App {

    public static void main(String [] args) throws Exception {
        System.out.println("Hello");

        Person Me = new Person(" Miguel", 18);

        Person Friend = new Person("Gabrielle" , 20);

        Me.addFriend (Friend);

        Pet Dog = new Pet("Brownie", 10, Me);
        Dog.showOwner();


        Person Classmate1 = new Person("Buttercup" , 20);
        Person Classmate2 = new Person("Blossom" , 21);
        Person Classmate3= new Person("Buubbles" , 22);

        Me.addClassmate (Classmate1);
        Me.addClassmate (Classmate2);
        Me.addClassmate (Classmate3);

        Car brand = new Car("Ferrari" , "Red", "Miguel");
        brand.carOwner();
    

    }
    
}
