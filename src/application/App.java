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
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findbyDepartment(department);
        for (Seller x : list){
            System.out.println(x.toString());
        }
    }
}
