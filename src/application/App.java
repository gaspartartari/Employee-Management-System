package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        Department obj = new Department(1, "Books");

        System.out.println(obj.toString());

        Seller seller = new Seller(23, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller.toString());
    }
}
