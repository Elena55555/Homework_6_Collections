
package com.sky.pro.HW6Collections.service;


import com.sky.pro.HW6Collections.employee.Employee;

import com.sky.pro.HW6Collections.exception.EmployeeAlreadyAddedInList;

import com.sky.pro.HW6Collections.exception.EmployeeNotFoundInList;

import com.sky.pro.HW6Collections.exception.EmployeeStorageIsFullList;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service

public class EmployeeServiceImpl implements EmployeeService {

    private final List <Employee> employees  = List.of(new Employee(" Иван  ", "Иванов" ),

            new Employee(" Семен  ", "Горбунков "),

            new Employee("Петр  ", " Петров"),

            new Employee(" Николай ",  "Николаев"),

            new Employee("  Федор  ", "Федоров") );
//    public EmployeeServiceImpl(

//            List<Employee> employees

//    =  List.of(
//
//             new Employee(" Иван  ", "Иванов" ),
//
//             new Employee(" Семен  ", "Горбунков "),
//
//             new Employee("Петр  ", " Петров"),
//
//             new Employee(" Николай ",  "Николаев"),
//
//             new Employee("  Федор  ", "Федоров"));   {
//        this.employees = new ArrayList<>();
//    }

//    private final List<Employee> employees =  List.of(
//
//            new Employee(" Иван  ", "Иванов" ),
//
//            new Employee(" Семен  ", "Горбунков "),
//
//            new Employee("Петр  ", " Петров"),
//
//            new Employee(" Николай ",  "Николаев"),
//
//            new Employee("  Федор  ", "Федоров"));


    @Override

    public Employee add(String name, String lastName) throws EmployeeStorageIsFullList, EmployeeAlreadyAddedInList{

        Employee employee = new Employee(name, lastName);


        int STORAGE_SIZE = 5;
        if (employees.size() == STORAGE_SIZE) {

            throw new EmployeeStorageIsFullList("Хранилище заполнено");

        }


        if (employees.contains(employee)) {

            throw new EmployeeAlreadyAddedInList("Сотрудник уже есть в хранилище");
        }
        employees.add(employee);
        return employee;
    }



    @Override


    public Employee remove(String name, String lastName) throws EmployeeNotFoundInList{

        Employee employee = new Employee(name, lastName);


        if ( employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        }

            throw new EmployeeNotFoundInList("Такого  сотрудника нет в хранилище");
    }

    @Override

    public Employee find(String name, String lastName) throws EmployeeNotFoundInList {

        Employee employee = new Employee(name, lastName);


        if (employees.contains(employee )) {
            return employee;

        }
        throw new EmployeeNotFoundInList("Такого  сотрудника нет в хранилище");

        }

    @Override

    public List <Employee> getAll() {

        return employees;

    }
}










