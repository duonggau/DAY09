package com.example.day09.dao;

import com.example.day09.entity.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(BigDecimal id);
    boolean insertEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(BigDecimal id);
}
