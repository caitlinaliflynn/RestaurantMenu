package restaurant;

import java.util.ArrayList;
import java.util.Date;
public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated = new Date();
    //private MenuItem mostRecent = new MenuItem();

    public ArrayList<MenuItem> getMenuItems() {

        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Appetizer")) {
                appetizers.append('\n' + item.toString());
            }
        }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Main Course")) {
                mainCourse.append('\n' + item.toString());
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("Dessert")) {
                dessert.append('\n' + item.toString());
            }
        }
        return "MENU\n" +
                "\nAPPETIZERS\n" + appetizers.toString() + '\n' +
                "\nMAIN COURSES\n" + mainCourse.toString() + '\n' +
                "\nDESSERTS\n" + dessert.toString() + '\n';
    }

    //    public String printItem(MenuItem menuItem) {
//        System.out.println(menuItem.toString());
//        return;
//    }
    void addItem(MenuItem newItem) {
        String message = "That item has already been added to the menu.";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = new Date();
    }

    void removeItem(MenuItem oldItem) {
        if (menuItems.contains(oldItem)) {
            menuItems.remove(oldItem);
            lastUpdated = new Date();
        }
    }

}

