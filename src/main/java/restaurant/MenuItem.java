package restaurant;

import java.util.ArrayList;
import java.util.Date;
public class MenuItem {
    private int id;

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isAvailable;

    private Date dateAdded;

    public MenuItem(int id, String name, double price, String description, String category, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        String newItem = isNew() ? " -- NEW! --" : "";
        return name + newItem + '\n' +
                "$" + price + '\n' +
                description + '\n' +
                "This item " + isAvailable + "\n" +
                "We added " + name + " to our menu on " + dateAdded + '\n';
    }

    @Override
    public boolean equals(Object toBeCompared) {

        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem otherItem = (MenuItem) toBeCompared;
        return this.id == otherItem.getId();
    }

    boolean isNew() {
        return true;
    }

//    boolean isAvailable() {
//        if (isAvailable) {
//            System.out.println(" is available!");
//            return true;
//        } else {
//            System.out.println(" is NOT available!");
//        }
//        return false;
//    }

}

