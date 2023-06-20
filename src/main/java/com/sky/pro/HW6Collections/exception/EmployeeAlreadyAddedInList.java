

package com.sky.pro.HW6Collections.exception;


import org.springframework.http.HttpStatus;


import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)


public class EmployeeAlreadyAddedInList extends RuntimeException {



    public EmployeeAlreadyAddedInList(String message) {
        super(message);
    }


//    public EmployeeAlreadyAddedInList(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    public EmployeeAlreadyAddedInList(Throwable cause) {
//        super(cause);
//    }
//
//    public EmployeeAlreadyAddedInList(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//        super(message, cause, enableSuppression, writableStackTrace);
//    }
}
