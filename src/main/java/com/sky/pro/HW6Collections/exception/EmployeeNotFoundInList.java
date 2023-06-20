

package com.sky.pro.HW6Collections.exception;


import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.web.client.HttpClientErrorException;


import static org.springframework.http.HttpStatus.NOT_FOUND;


@ResponseStatus( NOT_FOUND)

public class EmployeeNotFoundInList extends RuntimeException {





    public EmployeeNotFoundInList(String message) {
        super(message);
    }


//    public EmployeeNotFoundInList(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    public EmployeeNotFoundInList(Throwable cause) {
//        super(cause);
//    }
//
//    public EmployeeNotFoundInList(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//        super(message, cause, enableSuppression, writableStackTrace);
//    }
}
