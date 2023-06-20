

package com.sky.pro.HW6Collections.service;



import com.sky.pro.HW6Collections.employee.Employee;



import com.sky.pro.HW6Collections.exception.EmployeeAlreadyAddedInList;



import com.sky.pro.HW6Collections.exception.EmployeeNotFoundInList;


import com.sky.pro.HW6Collections.exception.EmployeeStorageIsFullList;


import org.springframework.stereotype.Service;


import java.util.ArrayList;

import java.util.List;



@Service


public class EmployeeServiceImpl implements EmployeeService {

    private final     List<Employee> employees = new ArrayList<>(List.of(

            new Employee("Иван", "Иванов"),

            new Employee("Семен", "Горбунков"),

            new Employee("Петр", "Петров"),

            new Employee("Николай", "Николаев"),

            new Employee("Федор", "Федоров")));

    private final int STORAGE_SIZE = 10;



    @Override


    public Employee add(String name, String lastName) throws EmployeeStorageIsFullList, EmployeeAlreadyAddedInList {

        Employee employee = new Employee(name, lastName);

        if (employees.size() >= STORAGE_SIZE) {


            throw new EmployeeStorageIsFullList("Хранилище заполнено");

        }


        if (employees.contains(employee)) {

            throw new EmployeeAlreadyAddedInList("Сотрудник уже есть в хранилище");

        }

        employees.add(employee);

        return employee;

    }

    @Override


    public Employee remove(String name, String lastName) throws EmployeeNotFoundInList {

        Employee employee = new Employee(name, lastName);

        if (employees.contains(employee)) {

            employees.remove(employee);

            return employee;

        }

        throw new EmployeeNotFoundInList("Такого  сотрудника нет в хранилище");

    }
//        if (!employees.contains(employee)) {
//            throw new EmployeeNotFoundInList("Такого  сотрудника нет в хранилище");
//        }
//        employees.remove(employee);
//        return null;
//    }

    @Override

    public Employee find(String name, String lastName) throws EmployeeNotFoundInList {

        Employee employee = new Employee(name, lastName);

        if (employees.contains(employee)) {

            return employee;

        }

        throw new EmployeeNotFoundInList("Такого  сотрудника нет в хранилище");

    }
//        Employee employeeToFind = new Employee(name, lastName);
//        if (!employees.contains(employeeToFind)) {
//
//            throw new EmployeeNotFoundInList("Такого  сотрудника нет в хранилище");
//
//        }
//        for (Employee employee : employees) {
//            if (employee.equals(employeeToFind)) {
//                return employee;
//
//
//            }
//
//        }
//        return null;

    @Override

    public List<Employee> getAll() {

        return employees;


    }

}












