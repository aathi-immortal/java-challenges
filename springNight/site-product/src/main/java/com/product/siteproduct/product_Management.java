// package com.product.siteproduct;

// import java.sql.SQLException;
// import java.util.List;
// import java.util.Scanner;

// public class product_Management {
// public static void main(String[] args) throws SQLException {
// Scanner scan = new Scanner(System.in);
// Product_service service = new Product_service();

// // System.out.println(
// //
// "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// // }
// while (true) {
// System.out.println(
// "1.finding product by place\n2.getting the product which does not have
// wranty\n3.searching the product by name\n 4.seraching the product if it have
// the entered subtring \n 5.display all product\n6.exit\n");
// String choice = scan.nextLine();
// if (choice.equals("1")) {
// System.out.println("enter the place: ");

// String place = scan.nextLine();
// System.out.println(
// "___________________________details of products in given
// place____________________________");
// List<Product> products3 = service.getProductByPlace(place);
// for (Product i : products3) {
// System.out.println("name :" + i.getName());
// System.out.println("place :" + i.getPlace());
// System.out.println("type :" + i.getType());
// System.out.println("wranty :" + i.getWranty());
// System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// }
// }

// else if (choice.equals("2")) {
// System.out.println(
// "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
// System.out.println("product which have wranty");
// List<Product> productss = service.getProductByWranty();
// for (Product i : productss) {
// System.out.println("name :" + i.getName());
// System.out.println("place :" + i.getPlace());
// System.out.println("type :" + i.getType());
// System.out.println("wranty :" + i.getWranty());
// System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// }

// } else if (choice.equals("3")) {
// System.out.println("enter the product name you need to get: ");
// String product_name = scan.nextLine();
// Product p = service.getProduct(product_name);
// if (p != null) {
// System.out.println("name :" + p.getName());
// System.out.println("place :" + p.getPlace());
// System.out.println("type :" + p.getType());
// System.out.println("wranty :" + p.getWranty());

// } else {
// System.out.println("no product");
// }
// } else if (choice.equals("4")) {
// System.out.print("enter the particular string :");
// String name = scan.nextLine();
// List<Product> products = service.getProductWithText(name);
// for (Product i : products) {
// System.out.println("name :" + i.getName());
// System.out.println("place :" + i.getPlace());
// System.out.println("type :" + i.getType());
// System.out.println("wranty :" + i.getWranty());
// System.out.println("----------------------------------------------------------------------------");

// }
// } else if (choice.equals("5")) {
// List<Product> pp = service.getAllProduct();
// for (Product i : pp) {
// System.out.println("name :" + i.getName());
// System.out.println("place :" + i.getPlace());
// System.out.println("type :" + i.getType());
// System.out.println("wranty :" + i.getWranty());

// }
// System.out.println(
// "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
// } else {
// System.out.println("+++++++++++++++++the end+++++++++++++++++++++++++++++");
// break;
// }

// }
// }
// }