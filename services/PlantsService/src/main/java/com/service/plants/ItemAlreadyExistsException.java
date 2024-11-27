package com.service.plants;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Item already exists")
public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException(String message) {
        super(message);
    }
}
