import java.util.ArrayList;
public class Pharmacy {
    public final int id;
    public final String name;
    public int quantity;
    public double price;

    public Pharmacy(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public static class pharmacyManagementSystem {
        private final ArrayList<Pharmacy> inventory = new ArrayList<>();

        public void addItem(Pharmacy item) {
            inventory.add(item);
        }

        public void updateItem(int id, int quantity, double price) {
            for (Pharmacy item : inventory) {
                if (item.id == id) {
                    item.quantity = quantity;
                    item.price = price;
                    break;
                }
            }
        }

        public void removeItem(int id) {
            inventory.removeIf(item -> item.id == id);
        }
        public void displayInventory() {
            System.out.println("Inventory:");
            for (Pharmacy item : inventory) {
                System.out.println(item.id + " | " + item.name + " | Quantity: " + item.quantity + " | Price: " + item.price);
            }
        }
        public Pharmacy searchItemByID(int id) {
            for (Pharmacy item : inventory) {
                if (item.id == id) {
                    return item;
                }
            }
            return null; // Item not found
        }
    }
    public static void main(String[] args) {
        pharmacyManagementSystem ims = new pharmacyManagementSystem();

        // Adding sample items
        ims.addItem(new Pharmacy(1, "Crocin", 100, 2.5));
        ims.addItem(new Pharmacy(2, "Calpol", 50, 3.0));
        ims.addItem(new Pharmacy(3, "Allegra", 200, 1.0));

        // Displaying inventory
        ims.displayInventory();

        // Updating an item
        ims.updateItem(1, 90, 2.0);

        // Displaying inventory after update
        ims.displayInventory();

        // Searching for an item
        System.out.println("Searching for item with ID 2:");
        Pharmacy foundItem = ims.searchItemByID(2);
        if (foundItem != null) {
            System.out.println("Item found: " + foundItem.name);
        } else {
            System.out.println("Item not found.");
        }

        // Removing an item
        ims.removeItem(2);

        // Displaying inventory after removal
        ims.displayInventory();
    }
}


