package chichi.copy.controllers;

import chichi.copy.entity.Employees;
import chichi.copy.entity.Salon;
import chichi.copy.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    private List<Employees> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(value = "/{id}")
    public Employees findEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping()
    public Employees addEmployee(@RequestBody Employees employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping(value = "/salon/{id}")
    public List<Employees> getEmployeesBySalon(@PathVariable int id){
        return employeeService.getEmployeesBySalon(id);
    }

}
