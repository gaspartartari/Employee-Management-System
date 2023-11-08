package application;

import java.util.List;

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

        System.out.println("\n---- TEST 3: department delete");
        departmentDao.deleteById(5);
        System.out.println("Deletion complete!");

        System.out.println("\n---- TEST 4: department findById");
        Department depTest4 = departmentDao.findById(3);
        if(depTest4 != null)
            System.out.println(depTest4.toString());
        else
            System.out.println("Department not found!");

        System.out.println("\n---- TEST 5: department findAll");
        List <Department> list = departmentDao.findAll();
        if(list != null){
            for (Department x : list){
                System.out.println(x.toString());
            }
        }
        else
            System.out.println("No departments found!");
    }
    
}
