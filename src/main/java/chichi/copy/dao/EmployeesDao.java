package chichi.copy.dao;

import chichi.copy.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeesDao extends JpaRepository<Employees, Integer> {

    @Query(value = "select e from Employees e where e.salon=:salon")
    List<Employees> getEmployeesBySalon(int salon);

}
