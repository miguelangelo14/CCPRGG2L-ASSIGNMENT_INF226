public class Cashier {

    public void checkOut(Groceryitem item) {
        System.out.println("You have purchased this item " + item.name);

    }

    public void showItemPrice(Groceryitem item) {
        System.out.println("The price of this item is " + item.price );

    }
    
}
