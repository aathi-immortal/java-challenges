import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class product_Management {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product_service service = new Product_service();
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));
        List<Product> pp = service.getAllProduct();
        for (Product i : pp) {
            System.out.println("name :" + i.getName());
            System.out.println("place :" + i.getPlace());
            System.out.println("type :" + i.getType());
            System.out.println("wranty :" + i.getWranty());

        }
        // System.out.println(
        // "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // System.out.println("enter the product name you need to get: ");

        // System.out.println(service.getProduct(product_name));

        // System.out.print("enter the particular string :");
        // String name = scan.nextLine();
        // List<Product> products = service.getProductWithText(name);
        // for (Product i : products) {
        // S ystem.out.println("name :" + i.getName());
        // System.out.println("place :" + i.getPlace());
        // System.out.println("type :" + i.getType());
        // System.out.println("wranty :" + i.getWranty());
        // System.out.println("----------------------------------------------------------------------------");

        // }
        // System.out.println(
        // "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // }
        while (true) {
            System.out.println("1.finding product by place\n2.getting the product which have wranty\n3.exit\n");
            String choice = scan.nextLine();
            if (choice.equals("1")) {
                System.out.println("enter the place: ");

                String place = scan.nextLine();
                System.out.println(
                        "___________________________details of products in given place____________________________");
                List<Product> products = service.getProductByPlace(place);
                for (Product i : products) {
                    System.out.println("name :" + i.getName());
                    System.out.println("place :" + i.getPlace());
                    System.out.println("type :" + i.getType());
                    System.out.println("wranty :" + i.getWranty());
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

                }
            }

            else if (choice.equals("2")) {
                System.out.println(
                        "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("product which have wranty");
                List<Product> productss = service.getProductByWranty();
                for (Product i : productss) {
                    System.out.println("name :" + i.getName());
                    System.out.println("place :" + i.getPlace());
                    System.out.println("type :" + i.getType());
                    System.out.println("wranty :" + i.getWranty());
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

                }
            } else {
                System.out.println("+++++++++++++++++the end+++++++++++++++++++++++++++++");
                break;
            }

        }
    }
}