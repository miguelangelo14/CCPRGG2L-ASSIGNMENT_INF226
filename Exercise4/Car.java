public class Car {

    String brand;
    String color;
    String owner;

    Car(String carBrand, String carColor, String carOwner) {
        this.brand = carBrand;
        this.color = carColor;
        this.owner = carOwner;
    }

    void carOwner() {
        System.out.println(" This is a " + this.brand + " ,  The color is " + this.color + " ,  The owner name is " + this.owner);
    }

    
}
