
package com.sky.pro.HW6Collections.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeStorageIsFullList extends   RuntimeException {




    public EmployeeStorageIsFullList(String message) {
        super(message);
    }

//    public EmployeeStorageIsFullList(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    public EmployeeStorageIsFullList(Throwable cause) {
//        super(cause);
//    }
//
//    public EmployeeStorageIsFullList(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//        super(message, cause, enableSuppression, writableStackTrace);
//    }
}
