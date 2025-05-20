import java.util.Vector;
public class online_shopping_platform {

    static class Product{
        String name;
        double price;
        String category;
            public Product (String name, double price, String category){
                this.name = name;
                this.price = price;
                this.category = category;
            }
    }

    public static class Cashier{
        private Vector<Product> inventory;

        public Cashier(){
            inventory = new Vector<>();
        }

        public void addProduct(String name, double price, String category){
            Product product = new Product(name, price, category);
            inventory.add(product);
        }

        public void removeProduct(String name){
            for(int i = 0; i < inventory.size(); i++){
                if(inventory.get(i).name.equalsIgnoreCase(name)){
                    inventory.remove(i);
                    break;
                }
            }
        }

        public void display(){
            for(Product product: inventory){
                System.out.println("Name: "+ product.name + "price: " + product.price + "category: " + product.category);;
            }
        }

    }

    public static void main(String[] args){
        Cashier manager = new Cashier();

        manager.addProduct("Face wash",125, "skincare");
        manager.addProduct("Ice Cream",100, "frozen dessert");
        manager.addProduct("Power bank",1800, "electronics");

        manager.display();

        manager.removeProduct("Ice Cream");

        manager.display();
    }
}
