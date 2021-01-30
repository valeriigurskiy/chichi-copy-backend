package chichi.copy.services.interfaces;

import chichi.copy.entity.Employees;
import chichi.copy.entity.Salon;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEmployeeService {

    Employees addEmployee(Employees employee);

    List<Employees> getAllEmployees();

    Employees getEmployee(int id);

    void removeEmployees(int id);

    List<Employees> getEmployeesBySalon(int id);

}
