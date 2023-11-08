package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {
    public static void main (String[] args){


        System.out.println("---- TEST 1: department insert");
        Department dep = new Department(0,"Toys");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        departmentDao.insert(dep);
        System.out.println("Insert complete!");
    }
    
}
