package restaurant;

import org.w3c.dom.ls.LSOutput;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem(1234, "Toasted Ravioli", 17.99, "Our famous breaded deep-fried ravioli.", "Appetizer", true);
        MenuItem item2 = new MenuItem(1235, "Wings", 12.99, "One pound of fried chicken wings", "Appetizer", true);
        MenuItem item3 = new MenuItem(1236, "Pasta Con Broccoli", 14.99, "Fettuccine noodles in cream sauce with broccoli.", "Main Course", true);
        MenuItem item4 = new MenuItem(12347, "Chicken Mudega", 14.99, "Grilled chicken breast smothered in mushroom cream sauce.", "Main Course", true);
        MenuItem item5 = new MenuItem(12348, "Vanilla Ice cream", 5.99, "Plain old vanilla ice cream", "Dessert", true);

        Menu menu = new Menu();

        //Add menu items to menu

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        //Print the entire menu

        System.out.println(menu);

        //Print just one menu item

        //System.out.println(item1);

        //Remove and item and reprint menu
        menu.removeItem(item4);
        //System.out.println(menu);

        // Test equals method
        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem(12348, "Vanilla Ice cream", 5.99, "Plain old vanilla ice cream", "Dessert", true);
        menu.addItem(item6);
        System.out.println(item5 == item6);
        System.out.println(item5.equals(item6));
    }

}