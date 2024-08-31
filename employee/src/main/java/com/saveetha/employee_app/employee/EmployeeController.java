package com.saveetha.employee_app.employee;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping (path= "api/v1/employee")
public class EmployeeController {
    public void postEmployee(@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
    }
    @PutMapping(path = "/{id}")
    public void putEmloyee(@PathVariable("id") Long employeeID, @RequestBody Employee employee){
        employeeService.updateExistingEmployee(employeeID,employeeFromUser);
    }
    @DeleteMapping(path = "/{id}")
    public void deleteEmployee(@PathVariable("id") Long employeeID){
        employeeService.deleteExistingEmployee(employeeID);
    }
//    @GetMapping
//    public List<Employee> greet(){
//        return List.of(
//                new Employee(
//                        101L,
//                        "John",
//                        "antonyjohnkennady2004@gmail.com",
//                        LocalDate.of(2004, Month.SEPTEMBER,12),
//                        20
//
//                )
//        );
//    }

}
