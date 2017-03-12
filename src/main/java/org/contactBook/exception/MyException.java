package org.contactBook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Администратор on 12.03.2017.
 */
@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "Bad way")
public class MyException extends Exception {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
