package chichi.copy.services;

import chichi.copy.dao.EmployeesDao;
import chichi.copy.entity.Employees;
import chichi.copy.entity.Salon;
import chichi.copy.services.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeesDao employeesDao;

    @Override
    public Employees addEmployee(Employees employee) {
        return employeesDao.save(employee);
    }

    @Override
    public List<Employees> getAllEmployees() {
        return employeesDao.findAll();
    }

    @Override
    public Employees getEmployee(int id) {
        return employeesDao.findById(id).orElseThrow(() -> new RuntimeException("Error"));
    }

    @Override
    public void removeEmployees(int id) {
        employeesDao.deleteById(id);
    }

    @Override
    public List<Employees> getEmployeesBySalon(int id) {
        return employeesDao.getEmployeesBySalon(id);
    }
}
