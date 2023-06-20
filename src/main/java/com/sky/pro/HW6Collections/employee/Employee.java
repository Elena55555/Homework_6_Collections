
package com.sky.pro.HW6Collections.employee;

import java.util.Objects;


public class Employee  {

    private final String name;

    private final String lastName;


    public Employee(String name, String lastName) {

        this.name = name;

        this.lastName = lastName;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
