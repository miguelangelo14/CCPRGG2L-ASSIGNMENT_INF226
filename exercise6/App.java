public class App {
    public static void main(String[] args) throws Exception {
        
        
        Groceryitem item1 = new Diaper ();
        item1.name = "Huggies";
        item1.price = 100;
        item1.showItemName();

        Groceryitem item2 = new Softdrink ();
        item2.name = "Pepsi";
        item2.price = 70;
        item2.showItemName();

        Cashier c1 = new Cashier();

        c1.checkOut(item1);
        c1.checkOut(item2);

    
        c1.showItemPrice(item1);
        c1.showItemPrice(item2);

        Groceryitem[] itemArray = new Groceryitem[2];

        itemArray [0] = item1;
        itemArray [1] = item2;

        double totalAmount = 0.00;

        for (int i = 0; i < itemArray.length; i++ ) {
            itemArray[i].showItemName();
            System.out.println(itemArray[i].price);

        totalAmount += itemArray[i].price;
            

        }

        System.out.println(totalAmount);
        

        Cat mycat = new Cat();
        mycat.eat();


        
    }
}
