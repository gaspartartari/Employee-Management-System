package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("\n---- TEST 1: seller findById ----");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller.toString());
        System.out.println();

        System.out.println("\n---- TEST 2: seller findByDepartment ----");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findbyDepartment(department);
        for (Seller x : list){
            System.out.println(x.toString());
        }

        System.out.println("\n---- TEST 3: seller findAll ----");
        list = sellerDao.findAll();
        for (Seller x : list){
            System.out.println(x.toString());
        }

        System.out.println("\n---- TEST 4: seller insert ----");
        Seller newSeller = new Seller(null, "Bob Brown", "bob@gmail.comn", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id: " + newSeller.getId());

        System.out.println("\n---- TEST 5: seller update ----");
        seller = sellerDao.findById(2);
        seller.setName("Maria");
        seller.setBirthDate(new Date());
        sellerDao.update(seller);
        System.out.println("Update successful!");

        System.out.println("\n---- TEST 6: seller delete ----");
        sellerDao.deleteById(80);
        System.out.println("Deletion complete!");
    }
}
