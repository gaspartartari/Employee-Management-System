package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {
    public static void main (String[] args){


        System.out.println("\n---- TEST 1: department insert");
        Department dep = new Department(0,"Kitchen");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        departmentDao.insert(dep);
        System.out.println("Insert complete! Key: " + dep.getId());

        System.out.println("\n---- TEST 2: department update");
        Department newDep = new Department(6, "Shoes");
        departmentDao.update(newDep);
        System.out.println("Update complete!");
    }
    
}
