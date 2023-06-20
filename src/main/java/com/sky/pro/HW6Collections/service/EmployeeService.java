
package com.sky.pro.HW6Collections.service;


import com.sky.pro.HW6Collections.employee.Employee;

import com.sky.pro.HW6Collections.exception.EmployeeAlreadyAddedInList;

import com.sky.pro.HW6Collections.exception.EmployeeNotFoundInList;

import com.sky.pro.HW6Collections.exception.EmployeeStorageIsFullList;

import org.springframework.stereotype.Service;


import java.util.List;

@Service


public interface EmployeeService {





    Employee add (String name, String lastName)throws EmployeeStorageIsFullList, EmployeeAlreadyAddedInList;

    Employee remove (String name, String lastName)throws EmployeeNotFoundInList;


    Employee find (String name, String lastName)throws EmployeeNotFoundInList;


    List<Employee> getAll();


}
