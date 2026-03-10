package org.example.App;



import org.example.dao.ProductDAO;
import org.example.model.Product;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDAO dao = new ProductDAO();

        while(true){

            System.out.println("\n===== PRODUCT INVENTORY MENU =====");

            System.out.println("1 Add Product");
            System.out.println("2 View All Products");
            System.out.println("3 View Product By ID");
            System.out.println("4 Update Product Price");
            System.out.println("5 Update Product Quantity");
            System.out.println("6 Delete Product");
            System.out.println("7 Search Product By Name");
            System.out.println("8 Show Low Stock Products");
            System.out.println("9 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1 -> {

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Category: ");
                    String cat = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();

                    Product p = new Product(id,name,cat,price,qty,rating);

                    dao.addProduct(p);
                }

                case 2 -> dao.viewAllProducts();

                case 3 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    dao.viewProductById(id);
                }

                case 4 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("New Price: ");
                    double price = sc.nextDouble();

                    dao.updatePrice(id,price);
                }

                case 5 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("New Quantity: ");
                    int qty = sc.nextInt();

                    dao.updateQuantity(id,qty);
                }

                case 6 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    dao.deleteProduct(id);
                }

                case 7 -> {
                    sc.nextLine();
                    System.out.print("Enter keyword: ");
                    String key = sc.nextLine();
                    dao.searchProduct(key);
                }

                case 8 -> dao.lowStock();

                case 9 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}