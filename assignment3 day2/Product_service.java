
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product_service {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProduct() {
        return products.stream()
                .collect(Collectors.toList());
    }

    // getting the single product
    public Product getProduct(String product) {
        return (Product) products.stream()
                .filter(p -> p.getName().compareToIgnoreCase(product) == 0)
                .findFirst()
                .orElse(null);

    }

    // method for getting product by place
    // assignment
    public List<Product> getProductByPlace(String place) {

        return products.stream()
                .filter(p -> p.getPlace().equalsIgnoreCase(place))
                .collect(Collectors.toList());

    }

    Predicate<Product> predicate = n -> Year.now().getValue() > n.getWranty();

    // method for checking the wranty of the product
    public List<Product> getProductByWranty() {

        return products.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public List<Product> getProductWithText(String name) {
        String new_name = name.toLowerCase();
        return products.stream()
                .filter(product -> product.getName().toLowerCase().contains(new_name)
                        || product.getPlace().toLowerCase().contains(new_name)
                        || product.getType().toLowerCase().contains(new_name))
                .collect(Collectors.toList());
    }
}
