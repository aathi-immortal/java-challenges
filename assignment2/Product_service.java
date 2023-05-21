
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Product_service {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProduct() {
        return products;
    }

    public Product getProduct(String product) {
        for (Product p : products) {
            if (product.compareToIgnoreCase(p.getName()) == 0) {
                return p;
            }

        }
        return null;
    }

    // method for getting product by place
    // assignment
    public List<Product> getProductByPlace(String place) {

        List<Product> pro = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getPlace().equalsIgnoreCase(place)) {
                pro.add(product);
            }
        }
        return pro;
    }

    // method for checking the wranty of the product
    public List<Product> getProductByWranty() {

        List<Product> pro = new ArrayList<Product>();
        for (Product product : products) {
            if (Year.now().getValue() > product.getWranty()) {
                pro.add(product);
            }
        }
        return pro;
    }

    public List<Product> getProductWithText(String name) {
        name = name.toLowerCase();
        List<Product> pro = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name) || product.getPlace().toLowerCase().contains(name)
                    || product.getType().toLowerCase().contains(name)) {
                pro.add(product);
            }
        }
        return pro;
    }
}
