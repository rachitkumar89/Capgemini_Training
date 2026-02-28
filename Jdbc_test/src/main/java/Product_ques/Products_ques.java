package Product_ques;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Scanner;

public class Products_ques {

    public static void main(String[] args) throws SQLException {
        //Load & Register Driver
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        //Create Connection
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3310/productdb",
                "root",
                "7818906417"
        );
        System.out.println("Connected Successfully!");

        Statement statement= connection.createStatement();

        Scanner sc= new Scanner(System.in);
        int n = 0;
        int  product_id=0;
        String product_name="";
        String category="";
        double price=0;
        int quantity=0;
        double rating=0;
        String manufacturer="" ;



        while(n<15){
            System.out.println("1. Add new product");
            System.out.println("2. View all Product");
            System.out.println("3. View Product by Id");
            System.out.println("4. Update product price");
            System.out.println("5. Update Product stock");
            System.out.println("6. Delete Product");
            System.out.println("7. Search by Name");
            System.out.println("8. Search by Category");
            System.out.println("9. Low Stock alert");
            System.out.println("10. Top Rated Product");
            System.out.println("11. Sort Products");
            System.out.println("12. Calculate Stock Value");
            System.out.println("13. Count Products");
            System.out.println("14. Category Wise Report");
            System.out.println("15. Pagination View");
            System.out.println("16. Exit Application");
            System.out.println();
            System.out.println();

            n=sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter the product id");
                    product_id = sc.nextInt();
                    System.out.println("Enter the product name");
                    product_name = sc.next();
                    System.out.println("Enter the category");
                    category = sc.next();
                    System.out.println("Enter the price of product");
                    price = sc.nextInt();
                    System.out.println("Enter the quantity");
                    quantity = sc.nextInt();
                    System.out.println("Enter the rating");
                    rating = sc.nextDouble();
                    System.out.println("Enter the manufacturer");
                    manufacturer = sc.next();

                    String query = "INSERT INTO products VALUES("

                            + product_id + ", '"
                            + product_name + "', '"
                            + category + "', "
                            + price + ", "
                            + quantity + ", "
                            + rating + ", '"
                            + manufacturer + "', NOW())";

                    int rows=statement.executeUpdate(query);
                    System.out.println(rows+"rows inserted successfully");
                    break;
                case 2:
                    ResultSet  rs= statement.executeQuery("select * from products");
                    while (rs.next()){
                        product_id=rs.getInt("product_id");
                        product_name=rs.getString("product_name");

                    }
            }
        }
    }



}

